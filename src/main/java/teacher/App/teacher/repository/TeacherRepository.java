package teacher.App.teacher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import teacher.App.teacher.model.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer>{}

