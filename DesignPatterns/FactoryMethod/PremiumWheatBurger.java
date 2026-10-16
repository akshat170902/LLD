package FactoryMethod;

public class PremiumWheatBurger extends Burger {
    @Override
    public void prepare() {
        System.out.println("You are preparing premium wheat burger");
    }
}
