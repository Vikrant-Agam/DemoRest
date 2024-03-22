package RestAPIprj.DemoRest.service;
import java.util.*; 
import RestAPIprj.DemoRest.model.Student;

public interface StudentServiceMethods {
	public String createStudentDetails(Student student);
	public String updateStudentDetails(Student student);
	public String deleteStudentDetails(String id);
	public Student getStudentDetailsById(String id);
	public List<Student> getAllrecords();

}
