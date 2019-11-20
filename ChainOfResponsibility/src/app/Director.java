package app;

/**
 * Director
 */
public class Director extends LeaveHandler {

    Director(LeaveHandler leaveHandler) {
        super(leaveHandler);
    }

    @Override
    public void check(int days) {
        System.out.println("====Director check====");
        if (days <= 7) {
            System.out.println("Director approved.");
        } else {
            System.out.println("Director can't handle.");
            next(days);
        }
    }
}