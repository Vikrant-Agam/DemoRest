package RestAPIprj.DemoRest.seviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import RestAPIprj.DemoRest.model.Student;
import RestAPIprj.DemoRest.repository.Studentrepo;
import RestAPIprj.DemoRest.service.StudentServiceMethods;


@Service
public class StudentServiceImplementation implements StudentServiceMethods{

	
	@Autowired
	Studentrepo studentrepo;
	
	
	@Override
	public String createStudentDetails(Student student)
	{
		
		studentrepo.save(student);
		return "success";
	}

	@Override
	public String updateStudentDetails(Student student) 
	{
		
		studentrepo.save(student);
		return "success";
	}

	@Override
	public String deleteStudentDetails(String id) {
		studentrepo.deleteById(id);
		return "successfully delete";
	}

	@Override
	public Student getStudentDetailsById(String id) {
		
	
		return 	studentrepo.findById(id).get();
	}

	@Override
	public List<Student> getAllrecords() {
		
		return studentrepo.findAll();
	}

}
