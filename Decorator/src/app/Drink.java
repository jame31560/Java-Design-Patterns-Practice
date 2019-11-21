package app;

/**
 * Drink
 */
public class Drink extends Additional {

    Drink(Combo combo) {
        super(combo);
    }

    @Override
    public int price() {
        return combo.price() + 15;
    }

    @Override
    public String print() {
        return combo.print() + "+ Drink ";
    }
}