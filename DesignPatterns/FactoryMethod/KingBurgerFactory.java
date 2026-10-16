package FactoryMethod;

import java.util.Objects;

public class KingBurgerFactory extends BurgerFactory {
    @Override
    public Burger createBurger(String burger) {
        if (Objects.equals(burger, "Basic")) {
            return new WheatBurger();
        } else if (Objects.equals(burger, "Standard")) {
            return new StandardWheatBurger();
        } else if (Objects.equals(burger, "Premium")) {
            return new PremiumWheatBurger();
        }
        return null;
    }

}
