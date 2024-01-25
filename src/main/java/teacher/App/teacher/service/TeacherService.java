package teacher.App.teacher.service;

import org.springframework.stereotype.Service;
import teacher.App.teacher.model.Teacher;
import teacher.App.teacher.repository.TeacherRepository;

import javax.persistence.Id;
import java.util.List;

@Service
public class TeacherService {


    public final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }


    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    /*public List<Teacher> batchAddTeacher() {
        return teacherRepository.saveAll();
    }*/

    public List<Teacher> getTeacher(){
        return teacherRepository.findAll();
    }

    public Teacher updateTeacher(Teacher teacher, int id) {
        return teacherRepository.save(teacher);
    }

    public void deleteTeacher(int id){
        teacherRepository.deleteById(id);
    }
}
//type generique JPA repository