public class MazePrototypeFactory extends MazeFactory
{
    private Maze maze;
    private Room room;
    private Wall wall;
    private Door door;
    
    public MazePrototypeFactory(Maze maze, Room room, Wall wall, Door door)
    {
        this.maze = maze;
        this.room = room;
        this.wall = wall;
        this.door = door;
    }
    
    public Maze makeMaze()
    {
        return maze.clone();
    }
    
    public Room makeRoom()
    {
        return room.clone();
    }
    
    public Wall makeWall()
    {
        return wall.clone();
    }
    
    public Door makeDoor(Room r1, Room r2)
    {
        Door clone = door.clone();
        clone.initialize(r1, r2);
        return clone;
    }
}

