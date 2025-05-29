package bai8;

public class Student extends Person {
    private int mark;
    private String grade;

    public Student(String id, String name, int age, int mark, String grade) {
        super(id, name, age);
        this.mark = mark;
        this.grade = grade;
    }

    public int getMark() {
        return mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setGrade(int mark) {
        this.mark = mark;
        if (mark >= 8) {
            this.grade = "A";
        } else if (mark >= 7) {
            this.grade = "B";
        } else if (mark >= 6) {
            this.grade = "C";
        } else if (mark >= 5) {
            this.grade = "D";
        } else if (mark <5) {
            this.grade = "Tạch cmnr";
        } else {
            this.grade = "Invalid";
        }
    }

    @Override
    public void input() {

    }

    @Override
    public void display() {
    }

}
