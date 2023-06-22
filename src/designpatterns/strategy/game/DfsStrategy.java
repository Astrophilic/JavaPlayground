package designpatterns.strategy.game;

public class DfsStrategy implements PathFindingStrategy{
    @Override
    public void findPath() {
        System.out.println("finding path using dfs");
    }
}
