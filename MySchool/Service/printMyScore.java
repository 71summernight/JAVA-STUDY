package MySchool.Service;

import MySchool.Student;
import MySchool.Subject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class printMyScore {

   public void printScore(Subject subject) throws IOException {
       System.out.printf("=========%s 수업 점수표==============\n",subject.getSubjectName());
       System.out.println("학번       |이름      |전공         |점수    |학점       ");

       for (int i = 0; i < subject.getStudentList().size(); i++) {
           Student student = subject.getStudentList().get(i);
           System.out.printf("%-4d     %-4s     %-6s     %-2d     %-1s\n", student.getStudentId(), student.getStudentName(),
                   student.getMajor().getMajorName(), student.getScoreMap().get(subject.getSubjectName()), student.getScoreList().get(subject.getSubjectName()));




           FileWriter fw = new FileWriter("/Users/71summernight/file4.txt", true);
           BufferedWriter bw = new BufferedWriter(fw);
           bw.write("==========" + subject.getSubjectName() + " 수업 점수표================\n");
           bw.write("학번     |이름     |전공         |점수   |학점       \n");

           for (int j = 0; j < subject.getStudentList().size(); j++) {
               Student student1 = subject.getStudentList().get(i);
               bw.write(student.getStudentId() + "\t" + student.getStudentName() +"\t"+ student.getMajor().getMajorName() +
                       "     " + student.getScoreMap().get(subject.getSubjectName())+"     "+
                       student.getScoreList().get(subject.getSubjectName())+"\n");

           }
           bw.flush();
           bw.close();
       }
       System.out.println();
   }


}
