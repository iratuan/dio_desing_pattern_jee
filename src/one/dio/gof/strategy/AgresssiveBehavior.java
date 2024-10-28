package one.dio.gof.strategy;

public class AgresssiveBehavior implements Behavior {

    @Override
    public void move() {
        System.out.println("Agressive movement");
    }

}
