package Bank;

import java.util.ArrayList;
import java.util.List;

public class Account { // 고객이나 마찬가지

    int accountNo;
    String name;
    long balance;
    public static int serialnum = 1000000;
    List<Transaction> transactions = new ArrayList<Transaction>();

    public Account() {

    }

    public Account(String name, long balance) {
        serialnum++;
        this.accountNo = serialnum;
        this.name = name;
        this.balance = balance;
    }

    void deposit(long amount) { // 입금하기
        System.out.println();
        this.balance += amount;
        System.out.printf("%s님이 입금 하신 금액은 %d원 입니다.", name, amount);
        System.out.println();
        getbalance();
        System.out.println();
        String kindof = "입금";

        Transaction transaction = new Transaction(kindof, amount, this.balance);
        transactions.add(transaction);

    }

    void withdraw(long amount) { // 출금하기
        this.balance -= amount;
        System.out.printf("%s님이 출금 하신 금액은 %d원 입니다.", name, amount);
        System.out.println();
        getbalance();
        System.out.println();

        String kindof = "출금";

        Transaction transaction = new Transaction(kindof, amount, this.balance);
        transactions.add(transaction);

    }

    void getbalance() { // 잔고확인
        System.out.printf("%s 고객님의 남은 잔액은 %d 입니다.", name, balance);

    }

    public void getTransaction() { // 거래내역확인
        System.out.println();
        System.out.println("===================거래내역===================");
        for (int i = 0; i < transactions.size(); i++) {
            System.out.printf("%s :%d 잔액: %d 거래일시: %s %s", transactions.get(i).kindof, transactions.get(i).amount,
                    transactions.get(i).balance, transactions.get(i).transactiondate,
                    transactions.get(i).transactiontime);
            System.out.println();

        }

        System.out.printf("총 거래 내역: %d", transactions.size());


    }

}
