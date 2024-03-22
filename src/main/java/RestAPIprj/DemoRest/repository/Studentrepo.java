package RestAPIprj.DemoRest.repository;
import org.springframework.data.jpa.repository.JpaRepository;  
import RestAPIprj.DemoRest.model.Student;
public interface Studentrepo extends JpaRepository<Student, String>{

}
