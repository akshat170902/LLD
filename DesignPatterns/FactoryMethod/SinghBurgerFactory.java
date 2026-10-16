package FactoryMethod;

import java.util.Objects;

public class SinghBurgerFactory extends BurgerFactory {
    @Override
    public Burger createBurger(String burger) {
        if (Objects.equals(burger, "Basic")) {
            return new BasicBurger();
        } else if (Objects.equals(burger, "Standard")) {
            return new StandardBurger();
        } else if (Objects.equals(burger, "Premium")) {
            return new PremiumBurger();
        }
        return null;
    }

}
