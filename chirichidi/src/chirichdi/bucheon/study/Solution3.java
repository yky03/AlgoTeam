package chirichdi.bucheon.study;

import java.util.Arrays;

public class Solution3 {

    public static void main(String[] args) {

        int[] a = new int[] {1, 4, 2};
        int[] b = new int[] {5, 4, 4};

        Solution3 solution3 = new Solution3();
        int result = solution3.solution(a, b);

        System.out.println(result);
    }


    private int solution(int []A, int []B)
    {
        int answer = 0;

        int commonLen = A.length;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < commonLen; i++)
        {
            answer += (A[i]  * B[commonLen - i - 1]);
        }

        return answer;
    }
}