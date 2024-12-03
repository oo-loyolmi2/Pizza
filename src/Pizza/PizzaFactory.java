package Pizza;

import Cheese.Cheese;
import Dough.Dough;
import enums.CheeseEnum;
import enums.DoughEnum;

public abstract class PizzaFactory {
    abstract Cheese cheese(CheeseEnum cheese);
    abstract Dough dough(DoughEnum dough);
}
