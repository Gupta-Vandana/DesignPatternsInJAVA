public class Main {
    public static void main(String[] args) {
        Burger burger = new ZingerBurger();
        System.out.println(burger.getDescription());

        burger = new CheeseDecorator(burger);
        System.out.println(burger.getDescription());
        System.out.println(burger.getCost());

        burger = new MayoDecorator(burger);
        System.out.println(burger.getDescription());
        System.out.println(burger.getCost());
        // this pattern is used in hotel management system like systems

    }
}
