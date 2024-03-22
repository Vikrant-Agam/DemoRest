package RestAPIprj.DemoRest.Controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import RestAPIprj.DemoRest.model.Student;
import RestAPIprj.DemoRest.seviceimplementation.StudentServiceImplementation;
import java.util.*;
@RestController
@RequestMapping("/studentcontroller")
public class StudentController 
{

	@Autowired
	StudentServiceImplementation ssi;
	
	@GetMapping("{id}")
	public Student getstudentdetails(@PathVariable("id") String id) {
		return ssi.getStudentDetailsById(id);
				
	}
	
	@GetMapping()
	public List<Student> getAll(){
		return ssi.getAllrecords();
	}
	
	@PostMapping
	public String createStudentDetails(@RequestBody Student student) {
		ssi.createStudentDetails(student);
		return "student details created successfully .";
	}
	
	@PutMapping
	public String updateStudentDetails(@RequestBody Student student) {
		ssi.updateStudentDetails(student);
		return " student details updated successfully";
	}
	
	
	@DeleteMapping("{id}")
	public String delelteStudentDetails(@PathVariable("id") String id) {
		ssi.deleteStudentDetails(id);
		return "student details delete Successfully";
	}

}
