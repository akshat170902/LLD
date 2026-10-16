package SimpleFactory;

import java.util.Optional;

public class Client {
    public static void main() {
        BurgerFactory burgerFactory = new BurgerFactory();
        Burger basic = burgerFactory.createBurger("Basic");
        Burger standard = burgerFactory.createBurger("Standard");
        Burger premium = burgerFactory.createBurger("Premium");
        Optional.ofNullable(basic).ifPresent(Burger::prepare);
        Optional.ofNullable(standard).ifPresent(Burger::prepare);
        Optional.ofNullable(premium).ifPresent(Burger::prepare);

    }
}
