package app;

/**
 * ComboA
 */
public class ComboA implements Combo {

    @Override
    public int price() {
        return 120;
    }

    @Override
    public String print() {
        return "ComboA ";
    }
}