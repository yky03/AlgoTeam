import Domain.Location;

public class Main {

    public static void main(String[] args)
    {
//        int row = 3;
//        int col = 3;
//        Location location = new Location();
//        location.x = 1;
//        location.y = 1;
//        location.d = 0;
//
//        int[][] map = new int[][]{
//                {1, 1, 1},
//                {1, 0, 1},
//                {1, 1, 1},
//        };

        int row = 11;
        int col = 10;
        Location location = new Location();
        location.x = 7;
        location.y = 4;
        location.d = 0;

        int[][] map = new int[][] {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 1, 1, 1, 1, 0, 1},
                {1, 0, 0, 1, 1, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };

        int[][] resultMap = Robot.run(map, location);

        int count = 0;
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                if (map[i][j] == Robot.CLEAN_STATE)
                {
                    count++;
                }
            }
        }

        int break1 = 1;
    }
}
