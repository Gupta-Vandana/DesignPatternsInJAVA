public class MayoDecorator extends BurgerDecorator{
    Burger burger;

    public MayoDecorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return this.burger.getDescription()+ " Extra Mayo";
    }

    @Override
    public double getCost() {
        return this.burger.getCost()+ 50.00;
    }
}
