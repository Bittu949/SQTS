package com.task.task2.Service;

import com.task.task2.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MainService {
    private List<Student> students = new ArrayList<>();
    public Student addStudent(String name,
                           Integer roll,
                           String className,
                           Integer m1,
                           Integer m2,
                           Integer m3,
                           Integer m4,
                           Integer m5){
        Student student = new Student(name, roll, className, m1, m2, m3, m4, m5);
        calculateTotal(student);
        students.add(student);
        sortStudents();
        assignRank();
        return student;
    }
    public void sortStudents(){
        students.sort((s1, s2) -> {
            if(s1.getTotal() > s2.getTotal())
                return -1;
            else if(s1.getTotal() < s2.getTotal())
                return 1;
            return 0;
        });
    }
    public void assignRank(){
        int rank = 1;
        int prevTotal = 0;

        for(int i=0; i<students.size(); i++){
            if(i==0) {
                students.get(i).setRank(rank);
                prevTotal = students.get(i).getTotal();
            }
            else{
                if(students.get(i).getTotal()==prevTotal)
                    students.get(i).setRank(rank);
                else{
                    rank = i+1;
                    students.get(i).setRank(rank);
                    prevTotal = students.get(i).getTotal();
                }
            }
        }
    }
    public void calculateTotal(Student student){
        int total = student.getM1()+student.getM2()+student.getM3()+
                student.getM4()+student.getM5();
        student.setTotal(total);
        calculatePercentage(student, total);
    }
    public void calculatePercentage(Student student, int total){
        float percentage = (total/500.0f)*100;
        student.setPercentage(percentage);

        calculateGrade(student, percentage);
    }
    public void calculateGrade(Student student, float percentage){
        String grade;
        if(percentage<50)
            grade = "F";
        else if(percentage>=50 && percentage<60)
            grade = "D";
        else if(percentage>=60 && percentage<70)
            grade = "C";
        else if(percentage>=70 && percentage<80)
            grade = "B";
        else if(percentage>=80 && percentage<90)
            grade = "A";
        else
            grade = "A+";
        student.setGrade(grade);
    }
    public List<Student> getTop3(){
        List<Student> top3 = new ArrayList<>();
        if(students.size()<3){
            top3.addAll(students);
        }else {
            for (int i = 0; i < 3; i++) {
                top3.add(students.get(i));
            }
        }
        return top3;
    }
    public List<Student> getStudents(){
        return students;
    }
}
