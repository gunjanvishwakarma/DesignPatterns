public class SimpleMazeFactory
{
    public static MazeFactory simpleMazeFactory()
    {
        return new MazePrototypeFactory(new Maze(), new Room(), new Wall(), new Door());
    }
}
