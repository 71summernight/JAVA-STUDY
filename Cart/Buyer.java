package Cart;

import java.util.ArrayList;

public class Buyer {

    int money = 500000;
    double totalpoint;
    ArrayList<Product> cart = new ArrayList<Product>();

    void buy(Product product) {
        cart.add(product);

    }

    void sum() {
        int total_price = 0;
        int count;

        System.out.println("*********영수증*************");
        for (int j = 0; j < cart.size(); j++) {
            System.out.printf("%-18s :%d \n", cart.get(j).name, cart.get(j).price);
            total_price += cart.get(j).price;
            totalpoint += cart.get(j).point;
        }

        count = (money - total_price);
        if (money < total_price) {
            System.out.printf("***총 금액은 [%d] 입니다.*** \n", total_price);
            System.out.println("[!] 잔액이 부족합니다.");
        } else {
            System.out.println();
            System.out.printf("***총 금액은 [%d] 입니다.*** \n", total_price);
            System.out.printf("누적 포인트는 %.1f, 잔액은  %d 입니다.", totalpoint, count);
            System.out.println();

        }
    }

}
