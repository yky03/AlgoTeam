package com.company;

public class SecretMap {

    public static void main(String[] args) {

        //given
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String[] ret;

        Main main = new Main();
        ret = main.solution2(n, arr1, arr2);
    }

    private String[] solution2(int n, int[] arr1, int[] arr2)
    {
        String[] answer = new String[n];

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++)
        {
            int ele = arr1[i] | arr2[i];

            while (ele > 0)
            {
                int reminder = ele % 2;

                if (reminder == 1)
                {
                    sb.insert(0, "#");
                }
                else
                {
                    sb.insert(0, " ");
                }

                ele = ele >> 1;
            }

            int needToInsertDigit = n - sb.length();
            if (needToInsertDigit > 0)
            {
                for (int j = 0; j < needToInsertDigit; j++)
                {
                    sb.insert(0, " ");
                }
            }

            answer[i] = sb.toString();
            sb.delete(0, sb.length());
        }

        return answer;
    }
}
