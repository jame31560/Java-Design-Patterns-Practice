package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("=======Chain Of Responsibility Test Start=======");
        LeaveHandler leaveHandler = new Teacher(new Director(new Principal(null)));

        System.out.println("======2 Days Leave Request======");
        leaveHandler.check(2);
        System.out.println("======6 Days Leave Request======");
        leaveHandler.check(6);
        System.out.println("======20 Days Leave Request======");
        leaveHandler.check(20);
        System.out.println("======51 Days Leave Request======");
        leaveHandler.check(51);

        System.out.println("========Chain Of Responsibility Test End========");
    }
}
