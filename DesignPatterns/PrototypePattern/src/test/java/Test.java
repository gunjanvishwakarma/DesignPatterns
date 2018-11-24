public class Test
{
    public static void main(String[] args)
    {
        //MazeFactory mazeFactory = SimpleMazeFactory.simpleMazeFactory();
        MazeFactory mazeFactory = BombedMazeFactory.bombedMazeFactory();
        Room r1 = mazeFactory.makeRoom();
        Room r2 = mazeFactory.makeRoom();
        mazeFactory.makeDoor(r1,r2);
        Wall wall = mazeFactory.makeWall();
        Maze maze = mazeFactory.makeMaze();
        
    }
}
