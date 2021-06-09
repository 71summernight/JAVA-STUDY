package MySchool.Service;


import MySchool.Major;
import MySchool.Score;
import MySchool.Student;
import MySchool.Subject;

public class Entrace {
    public static void main(String[] args) throws Exception {


        Subject computerBasic = new Subject("컴퓨터기초");
        Subject chineseBasic = new Subject("중국학기초");
        Subject computerScience = new Subject("컴퓨터과학");
        Subject chinaEconomy = new Subject("중국경제의이해");
        Subject taekwondo = new Subject("태권도");
        Subject judo = new Subject("유도");


        Major chinese = new Major("중국학과", chineseBasic);
        Major computer = new Major("컴퓨터공학과", computerBasic);

        Student hyunjinkim = new Student("김현진", computer);
        Student aranLee = new Student("이아란", chinese);
        Student myengjuuseo = new Student("서명주", computer);


        computerBasic.register(hyunjinkim);
        computerBasic.register(aranLee);
        computerBasic.register(myengjuuseo);

        chineseBasic.register(hyunjinkim);
        chineseBasic.register(aranLee);
        chineseBasic.register(myengjuuseo);

        computerScience.register(hyunjinkim);
        computerScience.register(aranLee);
        computerScience.register(myengjuuseo);

        chinaEconomy.register(hyunjinkim);
        chinaEconomy.register(aranLee);
        chinaEconomy.register(myengjuuseo);

        taekwondo.register(hyunjinkim);
        taekwondo.register(aranLee);
        taekwondo.register(myengjuuseo);

        judo.register(hyunjinkim);
        judo.register(aranLee);
        judo.register(myengjuuseo);


        computerBasic.getScore(hyunjinkim, new Score(0,100));
        computerBasic.getScore(aranLee, new Score(0,60));
        computerBasic.getScore(myengjuuseo, new Score(0,100));

        chineseBasic.getScore(hyunjinkim, new Score(0,50));
        chineseBasic.getScore(aranLee,new Score(0,80));
        chineseBasic.getScore(myengjuuseo, new Score(0,50));

        computerScience.getScore(hyunjinkim, new Score(1,86));
        computerScience.getScore(aranLee, new Score(1,30));
        computerScience.getScore(myengjuuseo, new Score(1,50));

        chinaEconomy.getScore(hyunjinkim, new Score(1,30));
        chinaEconomy.getScore(aranLee, new Score(1,60));
        chinaEconomy.getScore(myengjuuseo, new Score(1,70));

        taekwondo.getScore(hyunjinkim, new Score(2,40));
        taekwondo.getScore(aranLee, new Score(2,60));
        taekwondo.getScore(myengjuuseo, new Score(2,90));

        judo.getScore(hyunjinkim, new Score(2,40));
        judo.getScore(aranLee, new Score(2,60));
        judo.getScore(myengjuuseo, new Score(2,80));

        printMyScore printMyScore=new printMyScore();
        printMyScore.printScore(computerBasic);
        printMyScore.printScore(chineseBasic);
        printMyScore.printScore(computerScience);
        printMyScore.printScore(chinaEconomy);
        printMyScore.printScore(taekwondo);
        printMyScore.printScore(judo);


    }
}