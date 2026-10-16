package FactoryMethod;

import java.util.Optional;

public class Client {
    public static void main() {
        BurgerFactory burgerFactory = new KingBurgerFactory();
        Burger basic = burgerFactory.createBurger("Basic");
        Burger standard = burgerFactory.createBurger("Standard");
        Burger premium = burgerFactory.createBurger("Premium");
        Optional.ofNullable(basic).ifPresent(Burger::prepare);
        Optional.ofNullable(standard).ifPresent(Burger::prepare);
        Optional.ofNullable(premium).ifPresent(Burger::prepare);

        BurgerFactory burgerFactory1 = new SinghBurgerFactory();
        Burger basic1 = burgerFactory1.createBurger("Basic");
        Burger standard1 = burgerFactory1.createBurger("Standard");
        Burger premium1 = burgerFactory1.createBurger("Premium");
        Optional.ofNullable(basic1).ifPresent(Burger::prepare);
        Optional.ofNullable(standard1).ifPresent(Burger::prepare);
        Optional.ofNullable(premium1).ifPresent(Burger::prepare);

    }
}
