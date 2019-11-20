package app;

/**
 * Principal
 */
public class Principal extends LeaveHandler {

    Principal(LeaveHandler leaveHandler) {
        super(leaveHandler);
    }

    @Override
    public void check(int days) {
        System.out.println("====Principal check====");
        if (days <= 50) {
            System.out.println("Principal approved.");
        } else {
            System.out.println("Principal can't handle.");
            next(days);
        }
    }
}