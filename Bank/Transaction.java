package Bank;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {

    long amount; // 거래금액
    long balance; // 잔금
    String transactiondate;
    String transactiontime;
    String kindof;

    public Transaction(String kindof, long amount, long balance) {

        transactiondate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));// 거래날짜
        transactiontime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));// 거래날짜
        this.amount=amount;
        this.balance=balance;
        this.kindof=kindof;



    }

}
