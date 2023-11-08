package designpatterns.strategy.game;

public class BfsStrategy implements PathFindingStrategy{
    @Override
    public void findPath() {
        System.out.println("finding path using bfs");
    }
}
