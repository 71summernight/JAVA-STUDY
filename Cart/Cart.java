package Cart;

public class Cart {

    public static void main(String[] args) {

        Product computer = new Computer();
        Product mp3 = new Mp3();
        Product Audio = new Audio();

        Buyer buyer = new Buyer();

        buyer.buy(Audio);
        buyer.buy(computer);
        buyer.buy(mp3);
        buyer.buy(mp3);
        buyer.buy(computer);
        buyer.buy(computer);
        buyer.sum();

    }

}
