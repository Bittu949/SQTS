package com.task.task6.Entity;

public class Student {
    String studentId;
    String name;
    String email;
    String course;
    int marks;

    public Student(String studentId, String name, String email, String course, int marks) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.course = course;
        this.marks = marks;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
