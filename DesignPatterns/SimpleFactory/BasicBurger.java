package SimpleFactory;

public class BasicBurger extends Burger {
    @Override
    public void prepare() {
        System.out.println("You are creating a basic burger");
    }
}
