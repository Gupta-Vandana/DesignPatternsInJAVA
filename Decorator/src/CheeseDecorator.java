public class CheeseDecorator extends BurgerDecorator {
    private Burger burger;

    public CheeseDecorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + " Extra Cheese";
    }

    @Override
    public double getCost() {
        return this.burger.getCost() + 10.00;
    }
}
