package chirichdi.bucheon.study;

import com.sun.org.apache.regexp.internal.RE;

public class Solution2 {


    public static void main(String[] args) {

        int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};

        Solution2 sol = new Solution2();
        int result = sol.landing(land, 0, -1);
    }


    private int landing(int[][] land, int depth, int coloumn)
    {
        int ret = 0;

        for (int row = depth; row < land.length; row++)
        {
            ret += landing(land, depth + 1, coloumn);

            for (int col = 0; col < land[row].length; col++)
            {
                 getMaxPerColoumn(land[row], coloumn);
            }

        }

        return ret;
    }

    private int getMaxPerColoumn(int[] row, int preCol)
    {
        int max = 0;
        for (int i = 0; i < row.length; i++)
        {
            if (i == preCol) continue;

            if (max < row[i])
            {
                max = row[i];
            }
        }

        return max;
    }
}
