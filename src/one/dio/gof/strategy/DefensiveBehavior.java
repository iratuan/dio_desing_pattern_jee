package one.dio.gof.strategy;

public class DefensiveBehavior implements Behavior {

    @Override
    public void move() {
        System.out.println("Defensive movement");
    }

}
