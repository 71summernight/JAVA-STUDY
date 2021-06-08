package Bank;;

public class BankTest {

    public static void main(String[] args) {

        Bank woori=new Bank();
        woori.addAccount("김현진",5000);
        woori.addAccount("박보라",2000);
        woori.addAccount("이아란",3000);
        woori.addAccount("김연수",5300);
        woori.addAccount("김현진",60000);

        Account hyunjin=woori.getAccount(1000003);

        hyunjin.deposit(100);

        hyunjin.withdraw(1000);
        System.out.println();
        woori.totalAccountsee();
        hyunjin.getTransaction();

        woori.findAccount(1000002);
        woori.findsAccounts("김현진");
    }

}
