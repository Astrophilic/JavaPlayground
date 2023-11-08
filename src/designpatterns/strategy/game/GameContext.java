package designpatterns.strategy.game;

public class GameContext {
    private PathFindingStrategy pathFindingStrategy;


    public void setPathFindingStrategy(PathFindingStrategy pathFindingStrategy) {
        this.pathFindingStrategy = pathFindingStrategy;
    }

    public void findPath(){
        this.pathFindingStrategy.findPath();
    }


    public static void runGameExample(){
        GameContext context = new GameContext();
        context.setPathFindingStrategy(new AstarStrategy());
        context.setPathFindingStrategy(new BfsStrategy());
        context.findPath();
    }
}
