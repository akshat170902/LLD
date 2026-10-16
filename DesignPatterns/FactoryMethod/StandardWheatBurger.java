package FactoryMethod;

public class StandardWheatBurger extends Burger {
    @Override
    public void prepare() {
        System.out.println("You are preparing standard Wheat Burger");
    }
}
