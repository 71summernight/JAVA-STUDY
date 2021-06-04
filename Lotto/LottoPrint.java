package Lotto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class LottoPrint {
    static int serialnum;

    int[] lotto = new int[6];
    int temp = 0;
    Scanner scanner = new Scanner(System.in);

    void lottorandom() {// 랜덤번호생성

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45) + 1;
        }

        lottoarray();
        lottosnd();

    }

    void lottoarray() { // 오름차순 정렬

        for (int i = 0; i < lotto.length - 1; i++) {
            for (int j = 0; j < lotto.length - 1; j++) {

                if (lotto[j] > lotto[j + 1]) {
                    temp = lotto[j];
                    lotto[j] = lotto[j + 1];
                    lotto[j + 1] = temp;
                    j--;
                }

            }
        }

    }

    void lottosnd() { // 중복제거

        for (int i = 0; i < 5; i++) {
            for (int j = 4; i < j; j--) {
                if (lotto[i] == lotto[j]) {
                    int tmp = (int) (Math.random() * 45) + 1;
                    lotto[i] = tmp;
                    i = 0;
                }
            }
        }
    }

    void lottoprint() throws Exception {

        while (true) {
            System.out.println("***************************");
            System.out.println("**1. 당첨 예상 번호 추출하기**");
            System.out.println("**2. 이전번호 조회하기 ****");
            System.out.println("**3. 프로그램 종료 ^^! ^^! ^^**");
            System.out.println("***************************");
            System.out.println("원하는 메뉴 번호를 입력하세요 :");
            int selectnum = scanner.nextInt();
            switch (selectnum) {
                case 1:
                    lottorandom();
                    System.out.println("[    랜덤 Lotto 번호    ]");
                    System.out.printf("[%d] [%d] [%d] [%d] [%d] [%d]\n", this.lotto[0], this.lotto[1], this.lotto[2],
                            this.lotto[3], this.lotto[4], this.lotto[5]);

                    this.serialnum++;

                    System.out.println("이번주 1등은 당신입니다^^~");
                    System.out.println();

                    FileWriter fw = new FileWriter("/Users/71summernight/file1.txt", true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(serialnum + "회차 로또번호\n");

                    for (int i = 0; i < lotto.length; i++) {
                        bw.write("[" + lotto[i] + "]");
                    }
                    bw.write("\n-----------------------------\n");
                    bw.flush();
                    bw.close();
                    break;

                case 2:
                    FileReader fr = new FileReader("/Users/71summernight/file1.txt");
                    BufferedReader br = new BufferedReader(fr);
                    int readCharNo;
                    char [] cbuf = new char[100];
                    while((readCharNo=br.read(cbuf))!=-1) {
                        String data=new String (cbuf,0,readCharNo);
                        System.out.println(data);

                    }

                    fr.close();
                    break;

                case 3:
                    System.out.println("이용해주셔서 감사합니다!");
                    return;
            }
        }

    }
}










