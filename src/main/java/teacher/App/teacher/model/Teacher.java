package teacher.App.teacher.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Teacher {

    @OneToMany
    List<ClassRoom> classRooms;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String subject;

    private String enseignementLevel;

    public Teacher(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEnseignementLevel() {
        return enseignementLevel;
    }

    public void setEnseignementLevel(String enseignementLevel) {
        this.enseignementLevel = enseignementLevel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ClassRoom> getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(List<ClassRoom> classRooms) {
        this.classRooms = classRooms;
    }
}
