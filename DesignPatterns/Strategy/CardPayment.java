package Strategy;

public class CardPayment extends PaymentStrategy{
    @Override
    public void pay(){
        System.out.println("You are paying via CardPayment");
    }
}
