package com.task.task6.Service;

import com.task.task6.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;

@Service
public class MainService {
    private ArrayList<Student> students;
    public MainService(){
        students = new ArrayList<>();
    }
    public String addStudent(String studentId, String name, String email, String course, Integer marks){
        if((studentId != null && !studentId.isEmpty())&&(name != null && !name.isEmpty())&&
                (email != null && !email.isEmpty())&&(course != null && !course.isEmpty())&&
                (marks!=null)) {
            for(Student s : students){
                if(s.getStudentId().equals(studentId))
                    return "Student ID already exists";
            }
            Student stud = new Student(studentId, name, email, course, marks);
            students.add(stud);
            return "Student added successfully";
        }
        return "Please provide all the details";
    }
    public ArrayList<Student> displayStudents(){
        return students;
    }
    public String deleteStudent(String studentId){
        boolean isDeleted = students.removeIf(x -> x.getStudentId().equals(studentId));
        if(isDeleted)
            return "Student deleted successfully";
        return "Student not found";
    }
    public String updateStudent(String studentId, String name, String email, String course, Integer marks){
        if(studentId != null && !studentId.isEmpty()) {
            Iterator<Student> it = students.iterator();
            boolean flag = false;
            while (it.hasNext()) {
                Student stud = it.next();
                if (stud.getStudentId().equals(studentId)) {
                    flag = true;
                    if(name!=null && !name.isEmpty() )
                        stud.setName(name);
                    if(email!=null && !email.isEmpty())
                        stud.setEmail(email);
                    if(course!=null && !course.isEmpty())
                        stud.setCourse(course);
                    if(marks!=null)
                        stud.setMarks(marks);
                    break;
                }
            }
            if (flag)
                return "Student updated successfully";
            return "Student with id " + studentId + " does not exist";
        }
        return "Please provide studentId";
    }
}
