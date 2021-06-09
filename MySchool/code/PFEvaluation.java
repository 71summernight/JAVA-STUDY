package MySchool.code;

public class PFEvaluation implements gradeEvaluation {
    @Override
    public String getGrade(int point) {
        String grade;
        if(point>=50){
            grade="PASS";
        }else{
           grade= "FAIL";
        }
        return grade;
    }
}
