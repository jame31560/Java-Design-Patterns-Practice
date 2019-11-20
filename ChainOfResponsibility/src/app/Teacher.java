package app;

/**
 * Teacher
 */
public class Teacher extends LeaveHandler {

    Teacher(LeaveHandler leaveHandler) {
        super(leaveHandler);
    }

    @Override
    public void check(int days) {
        System.out.println("====Teacher check====");
        if (days <= 3) {
            System.out.println("Teacher approved.");
        } else {
            System.out.println("Teacher can't handle.");
            next(days);
        }
    }
}
