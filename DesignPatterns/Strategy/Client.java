package Strategy;

public class Client {
    public static  void main() {
        PaymentStrategy strategy = new CardPayment();

        strategy.pay();

    }
}
