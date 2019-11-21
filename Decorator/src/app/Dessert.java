package app;

/**
 * Dessert
 */
public class Dessert extends Additional {

    Dessert(Combo combo) {
        super(combo);
    }

    @Override
    public int price() {
        return combo.price() + 30;
    }

    @Override
    public String print() {
        return combo.print() + "+ Dessert ";
    }
}