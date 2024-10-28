package one.dio.gof.strategy;

public class TestBehavior {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.setBehavior(new NormalBehavior());
        robot.move();

        robot.setBehavior(new DefensiveBehavior());
        robot.move();

        robot.setBehavior(new AgresssiveBehavior());
        robot.move();
    }

}
