public abstract class MazeFactory
{
    abstract public Maze makeMaze();
    
    abstract public Room makeRoom();
    
    abstract public Wall makeWall();
    
    abstract public Door makeDoor(Room r1, Room r2);
}
