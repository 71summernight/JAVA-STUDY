package MySchool;

import MySchool.code.Define;

public class Major {
    private int majorId;
    private String majorName;
    private Subject majorSubject;


    public Major(String majorName, Subject majorSubject) {
       if(majorName.equals("컴퓨터공학과")){
           this.majorId = Define.컴퓨터공학과;
       }else if(majorName.equals("중국학과")){
           this.majorId=Define.중국학과;
       }

        this.majorName = majorName;
        this.majorSubject = majorSubject;
    }

    public int getMajorId() {
        return majorId;
    }

    public void setMajorId(int majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Subject getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(Subject majorSubject) {
        this.majorSubject = majorSubject;
    }

    @Override
    public String toString() {
        return "Major{" +
                "majorId=" + majorId +
                ", majorName='" + majorName + '\'' +
                ", majorSubject=" + majorSubject +
                '}';
    }
}
