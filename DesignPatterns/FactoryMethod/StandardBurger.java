package FactoryMethod;

public class StandardBurger extends Burger {
    @Override
    public void prepare() {
        System.out.println("You are preparing standard Burger");
    }
}
