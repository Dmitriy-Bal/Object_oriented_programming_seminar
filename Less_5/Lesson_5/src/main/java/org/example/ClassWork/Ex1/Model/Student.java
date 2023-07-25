package org.example.ClassWork.Ex1.Model;

public class Student extends AbstractUser {
    int studentId;
    int valuation;
    int classNumber;

    public Student(int studentId, int valuation, int classNumber) {
        this.studentId = studentId;
        this.valuation = valuation;
        this.classNumber = classNumber;
    }

    public Student(String name, String lastName, int studentId, int valuation, int classNumber) {
        super(name, lastName);
        this.studentId = studentId;
        this.valuation = valuation;
        this.classNumber = classNumber;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getValuation() {
        return valuation;
    }

    public void setValuation(int valuation) {
        this.valuation = valuation;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", valuation=" + valuation +
                ", classNumber=" + classNumber +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}