package Bank;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<Account>();

    }

    public Account getAccount(int accountnum) {
        Account account = new Account();
        for (int i = 0; i < accounts.size(); i++) {
            if (accountnum == accounts.get(i).accountNo) {
                account = accounts.get(i);
            }
        }
        return account;
    }

    public void addAccount(String name, int balance) { // 계좌생성
        Account account = new Account(name, balance);
        accounts.add(account);
        System.out.printf("%s 님의 (%d)계좌가 생성되었습니다. 예치하신 금액은 %d 원 입니다.", name, account.accountNo, balance);
        System.out.println();

    }

    public void findAccount(int accountnum) { // 계좌번호로 계좌찾기
        int count = 0;
        System.out.println();
        System.out.println();

        for (int i = 0; i < accounts.size(); i++) {
            if (accountnum == accounts.get(i).accountNo) {
                System.out.println("============해당계좌번호의 계좌정보============");
                System.out.printf("[계좌번호: %d, 소유자명: %s, 잔액: %d]", accounts.get(i).accountNo, accounts.get(i).name,
                        accounts.get(i).balance);
                count++;

            }
        }
        if (count < 1) {
            System.out.println("찾으시는 계좌가 없습니다.");
        }
    }

    public void findsAccounts(String ownername) { // 소유자명으로 계좌찾기
        int count = 0;
        System.out.println();
        System.out.println();

        System.out.println("========= 해당 소유자명의 계좌 목록 ============");
        for (int i = 0; i < accounts.size(); i++) {
            if (ownername.equals(accounts.get(i).name)) {
                System.out.printf("[계좌번호: %d, 소유자명: %s, 잔액: %d]\n", accounts.get(i).accountNo, accounts.get(i).name,
                        accounts.get(i).balance);
                count++;
            }
        }

        if (count < 1) {
            System.out.println("찾으시는 계좌가 없습니다.");
        }
    }

    public void totalAccountsee() {
        System.out.println("============== 전체 계좌 목록 =============");
        for (int i = 0; i < accounts.size(); i++) {
            System.out.printf("[계좌번호: %d, 소유자명: %s, 잔액: %d]\n", accounts.get(i).accountNo, accounts.get(i).name,
                    accounts.get(i).balance);

        }
    }

    public int totalAccount() { // 총계좌수 조회
        return accounts.size();
    }

}
