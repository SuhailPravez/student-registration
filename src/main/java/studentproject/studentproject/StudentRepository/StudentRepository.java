package studentproject.studentproject.StudentRepository;


import org.springframework.data.jpa.repository.JpaRepository;
import studentproject.studentproject.StudentDomain.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
