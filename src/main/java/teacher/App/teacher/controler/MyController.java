package teacher.App.teacher.controler;

import org.springframework.web.bind.annotation.*;
import teacher.App.teacher.model.Teacher;
import teacher.App.teacher.service.TeacherService;

import java.util.List;

@RestController
@RequestMapping("teacher")
public class MyController {

    public final TeacherService teacherService;

    public MyController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/add")
    public Teacher addTeacher(@RequestBody Teacher teacher){
        return teacherService.createTeacher(teacher);
    }

    /*@PostMapping("/batchAdd")
    public List<Teacher> batchAddTeacher(@RequestBody Teacher teacher){
        return teacherService.batchAddTeacher();
    }*/

    @GetMapping("/listTeacher")
    public List<Teacher> listTeacher(){
        return teacherService.getTeacher();
    }

    @PutMapping("/update")
    public Teacher updateTeacher(@RequestBody Teacher teacher){
        return teacherService.updateTeacher(teacher, teacher.getId());
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTeacher(@PathVariable("id") Teacher teacher){
        teacherService.deleteTeacher(teacher.getId());
    }

}
