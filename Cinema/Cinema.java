package Cinema;

import java.util.Random;
import java.util.Scanner;

public class Cinema {

    boolean[][] seat = new boolean[6][6];
    String[][] number = new String[6][6]; // 랜덤 번호를 넣을 배열
    Random ramdom = new Random();
    Scanner scanner = new Scanner(System.in);

    void userChoice() { // 메뉴선택
        while (true) {
            System.out.println("******************");
            System.out.println("****영화예매시스템****");
            System.out.println("******************");
            System.out.println("****1.영화예매****");
            System.out.println("****2.예매조회****");
            System.out.println("****3.예매취소****");
            System.out.println("******************");
            int selectNum = scanner.nextInt();
            if (selectNum == 1) {// 예매하기
                showSeat();
            } else if (selectNum == 2) { // 예매조회

                showInfo();

            } else if (selectNum == 3) { // 예매취소

                cancel();

            } else {
                System.out.println("잘못입력하셨습니다.");
                System.out.println();
            }

        }

    }

    void showSeat() { // 좌석보여주기
        int row = (char) 'A';
        int col = 0;

        for (int i = 0; i < seat.length; i++) {
            System.out.println();

            for (int j = 0; j < seat[i].length; j++) {
                col = j;

                if (!seat[i][j]) {
                    System.out.print("[" + (char) row + "-" + col + "]");
                } else if (seat[i][j]) {
                    System.out.print("[예매]");
                }

            }

            row++;
        }
        System.out.println();
        choiceSeat();

    }

    void choiceSeat() { // 좌석선택(예약)

        String userChoice = "";
        System.out.println("원하시는 좌석을 선택해주세요 ex)A-1");
        userChoice = scanner.nextLine();

        String[] parsedUserInput = userChoice.split("-");
        String userrow = parsedUserInput[0]; // "A"
        String usercol = parsedUserInput[1]; // "0"

        int A = userrow.charAt(0) - (char) 'A';
        int B = Integer.parseInt(usercol);

        int ran = ramdom.nextInt(99999) + 9999;
        String _ran = String.valueOf(ran);

        if (A > 5 || B > 5) {
            System.out.println("잘못 입력하셨습니다.");
        } else if (!seat[A][B]) {
            seat[A][B] = true;
            number[A][B] = _ran;
            System.out.println("예매번호는 :" + ran + "입니다.");

        } else if (seat[A][B]) {
            System.out.println("이미 예약된 좌석입니다.");
        }
    }

    void showInfo() {

        System.out.println("예매번호를 입력하세요");
        String userInput = scanner.nextLine();
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (userInput.equals(number[i][j])) {
                    System.out.println("고객님이 예매하신 좌석은 [" + (char) (i + 65) + "-" + j + "]입니다.\n");
                }
            }
        }

    }

    void cancel() {
        System.out.println("예매번호를 입력하세요");
        String userInput = scanner.nextLine();
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (userInput.equals(number[i][j])) {
                    if (seat[i][j]) {
                        System.out.println("취소되었습니다.");

                        seat[i][j] = false;
                    }
                }
            }
        }
    }

}