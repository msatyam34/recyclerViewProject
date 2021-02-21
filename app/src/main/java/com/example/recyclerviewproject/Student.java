package com.example.recyclerviewproject;

public class Student {
    String studentId;
    String studentName ;
    String studentRollNo;
    String studentDepartment ;
    String studentDepartmentCode ;
    String studentDOB ;
    String studentGender;

    public Student(){

    }

    public Student(String studentId, String studentName, String studentRollNo, String studentDepartment, String studentDepartmentCode, String studentDOB, String studentGender) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
        this.studentDepartment = studentDepartment;
        this.studentDepartmentCode = studentDepartmentCode;
        this.studentDOB = studentDOB;
        this.studentGender = studentGender;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentRollNo() {
        return studentRollNo;
    }

    public String getStudentDepartment() {
        return studentDepartment;
    }

    public String getStudentDepartmentCode() {
        return studentDepartmentCode;
    }

    public String getStudentDOB() {
        return studentDOB;
    }

    public String getStudentGender() {
        return studentGender;
    }
}
