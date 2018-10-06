package Domain;

public class Location {
    public int x;
    public int y;
    public int d;

    public static final int WEST = 0;
    public static final int NORTH = 1;
    public static final int EAST = 2;
    public static final int SOUTH = 3;

    public static Location nextDirection(Location location)
    {
        if (location.d >= 3 || location.d < 0)
        {
            location.d = -1;
            return location; //예외 약속 값
        }

        location.d = location.d + 1;
        return location;
    }

    public boolean isEndOfLine()
    {
        return this.d < 0;
    }
}
