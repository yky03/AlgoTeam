import Domain.Location;

public class Robot {

    static final int CLEAN_STATE = 2;

    public static int[][] doClean(int[][] map, Location location)
    {
        if (map[location.x][location.y] >= 1) // 벽 or 이미 청소됨
        {
            return map;
        }
        else
        {
            map[location.x][location.y] = Robot.CLEAN_STATE;
        }

        return map;
    }

    public static boolean canIGo(int[][] map, Location location)
    {
        int rowLen = map.length;
        int colLen = map[0].length;

        int x = location.x;
        int y = location.y;
        int direction = location.d;
        switch (direction)
        {
            case Location.NORTH:
                x--;
                break;
            case Location.EAST:
                y++;
                break;
            case Location.SOUTH:
                x++;
                break;
            case Location.WEST:
                y--;
        }

        if (x < 0 || x > rowLen || y > colLen || y < 0)
        {
            return false;
        }
        if (map[x][y] >= 1)
        {
            return false;
        }

        return true;
    }

    // canIGo 가 반드시 선행되어야 함
    public static Location moveLocation(Location location)
    {
        int direction = location.d;
        switch (direction)
        {
            case Location.NORTH:
                location.x = location.x - 1;
                break;
            case Location.EAST:
                location.y = location.y + 1;
                break;
            case Location.SOUTH:
                location.x = location.x + 1;
                break;
            case Location.WEST:
                location.y = location.y - 1;
        }

        return location;
    }

    public static int[][] run(int[][] map, Location location)
    {
        // 현재 셀 청소
        map = doClean(map, location);

        while (true)
        {
            if (canIGo(map, location))
            {
                // 전진 가능하면 전진 우선
                location = moveLocation(location);
            }
            else
            {
                // 전진 불가능하면 방향 전환
                location = Location.nextDirection(location);
            }

            // 방향 탐색 함수를 다 돌려도 청소 공간할 수 없으면, 재귀 리턴
            if (location.isEndOfLine())
            {
                return map;
            }
            else
            {
                run(map, location);
            }
        }
    }
}
