package Pizza;

import enums.CheeseEnum;
import enums.DoughEnum;

public class Ordinary implements Pizza{

    @Override
    public String getPizzaName() {
        return "Ordinary Pizza";
    }

    @Override
    public String setCheese(CheeseEnum cheese) {
        return cheese.toString();
    }

    @Override
    public String setDough(DoughEnum dough) {
        return dough.toString();
    }

    public String getPizza(CheeseEnum cheeseEnum, DoughEnum doughEnum){
        return getPizzaName()+ " with " + setCheese(cheeseEnum) + " and " + setDough(doughEnum);
    }
}
