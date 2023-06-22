package designpatterns.strategy.game;

public class AstarStrategy implements PathFindingStrategy{
    @Override
    public void findPath() {
        System.out.println("path using A* algorithm");

    }
}
