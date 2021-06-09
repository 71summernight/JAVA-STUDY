package MySchool;
import MySchool.code.Define;

import java.util.ArrayList;

public class Subject {
    private int subjectId;
    private String subjectName;
    public ArrayList<Student> studentList = new ArrayList<>();
     private Score score;

    public void register(Student student) {
        studentList.add(student);

    }

    public void getScore(Student student, Score score) {
        student.scoreMap.put(subjectName, score.getPoint());
        student.scoreList.put(subjectName,score.getGrade());

    }

    public Subject(String subjectName) {
       this.subjectName=subjectName;

        if(subjectName.equals("컴퓨터기초")){
            this.subjectId = Define.컴퓨터공학과;
        }else if(subjectName.equals("중국학기초")){
            this.subjectId= Define.중국학과;
        }

    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

}
