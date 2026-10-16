package FactoryMethod;

public class WheatBurger extends Burger {
    @Override
    public void prepare() {
        System.out.println("You are preparing Wheat burger");
    }

    ;
}
