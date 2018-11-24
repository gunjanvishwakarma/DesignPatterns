public class BombedMazeFactory
{
    public static MazeFactory bombedMazeFactory()
    {
        return new MazePrototypeFactory(new Maze(), new Room(), new Wall(), new Door());
    }
}

