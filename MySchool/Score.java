package MySchool;

import MySchool.code.BasicEvaluation;
import MySchool.code.MajorEvaluation;
import MySchool.code.PFEvaluation;
import MySchool.code.gradeEvaluation;

public class Score {

    private int point;
    private Subject subject;
    private Student student;
    private int gradeType;

    String grade;
    gradeEvaluation[] score = { new MajorEvaluation(), new BasicEvaluation(),new PFEvaluation()};

    public  Score(int gradeType, int point){
        this.point=point;
        this.gradeType=gradeType;

        if (this.gradeType== 0) {
            this.grade = score[0].getGrade(point);
        } else if (this.gradeType== 1) {
            this.grade = score[1].getGrade(point);
        } else if(this.gradeType==2){
            this.grade = score[2].getGrade(point);

        }

    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Student getStudentId() {
        return student;
    }

    public void setStudentId(Student student) {
        this.student = student;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public gradeEvaluation[] getScore() {
        return score;
    }

    public void setScore(gradeEvaluation[] score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "point=" + point +
                ", subject=" + subject +
                ", studentId=" + student +
                '}';
    }
}
