package app;

/**
 * LeaveHandler
 */
public abstract class LeaveHandler {

    private LeaveHandler leaveHandler = null;

    LeaveHandler(LeaveHandler leaveHandler) {
        setLeaveHandler(leaveHandler);
    }

    public void next(int days) {
        if (leaveHandler == null) {
            System.out.println("Request can't Handle.");
        } else {
            leaveHandler.check(days);
        }
    }

    public abstract void check(int days);

    /**
     * @param leaveHandler the leaveHandler to set
     */
    public void setLeaveHandler(LeaveHandler leaveHandler) {
        this.leaveHandler = leaveHandler;
    }
}
