package Strategy;

public class UPIPayment extends PaymentStrategy{
    @Override
    public void pay(){
        System.out.println("You are paying via the UPIPayment");
    }
}
