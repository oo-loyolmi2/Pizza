package Pizza;

import enums.CheeseEnum;
import enums.DoughEnum;

public interface Pizza {
    String getPizzaName();
    String setCheese(CheeseEnum cheese);
    String setDough(DoughEnum dough);
}
