import enums.PizzaEnum;

public class Main {
    public static void main(String[] args){
        PizzaHut pizzaMenu = new PizzaHut();
        PizzaHut pastaMenu = new PizzaHut();

        System.out.println("PIZZA DETAILS");
        System.out.println(pizzaMenu.pizza(PizzaEnum.CHEESE).getToppings());
        System.out.println(pizzaMenu.pizza(PizzaEnum.CHEESE).getPrice());

        System.out.println("PASTA DETAILS");
        System.out.println(pastaMenu.pasta(PastaEnum.CARBONARA).getType());
        System.out.println(pastaMenu.pasta(PastaEnum.CARBONARA).getPrice());
    }
}