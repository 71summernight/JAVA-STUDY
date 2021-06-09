package MySchool;

import java.util.HashMap;

public class Student {
    static int serialnum=10000;
    private int StudentId;
    private String StudentName;
    private Major major;
    public HashMap<String,Integer> scoreMap=new HashMap<>();
    public HashMap<String,String>scoreList =new HashMap<>();

    public Student(String studentName, Major major) {
        serialnum++;
        StudentId = serialnum;
        StudentName = studentName;
        this.major = major;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public HashMap<String, Integer> getScoreMap() {
        return scoreMap;
    }

    public void setScoreMap(HashMap<String, Integer> scoreMap) {
        this.scoreMap = scoreMap;
    }

    public HashMap<String, String> getScoreList() {
        return scoreList;
    }

    public void setScoreList(HashMap<String, String> scoreList) {
        this.scoreList = scoreList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", StudentName='" + StudentName + '\'' +
                ", major=" + major +
                ", scoreMap=" + scoreMap +
                ", scoreList=" + scoreList +
                '}';
    }
}
