package com.company;

public class DartGame {

    public static void main(String[] args) {

        //given
        String s = "1S2D*3T";
        String s2 = "1D2S#10S";

        int ret;

        DartGame main = new DartGame();
        ret = main.solution2(s2);
    }

    // 점수/보너스/[옵션]
    private int solution2(String dartResult)
    {
        int answer = 0;

        double curScore = 0;
        double preScore = 0;

        for (int i = 0; i < dartResult.length(); i++)
        {
            int pow = 1;

            switch (dartResult.charAt(i))
            {
                case 'T': // 트리플
                    pow++;
                case 'D': // 더블
                    pow++;
                case 'S': // 싱글
                    curScore = Math.pow(curScore, pow);
                    answer += curScore;
                    break;
                case '*': // 스타상 : 이전, 이번 점수 각 두배
                    answer += preScore;
                    answer += curScore;
                    curScore *= 2;
                    preScore = curScore;
                    break;
                case '#': // 아차상 : 이번 점수 * (-1)
                    answer -= curScore; //rollback
                    curScore *= (-1);
                    answer += curScore;
                    preScore = curScore;
                    break;
                default: // 점수
                    preScore = curScore;//TODO 옵션에서 한번 갱신하기때문에 분기처리해야하나

                    //curScore 최대값 10. 규칙상 점수 다음에 out of index 안나므로 규칙 이용한 처리
                    if (i > 0 && dartResult.substring(i - 1, i).matches("[-+]?\\d*\\.?\\d+"))
                    {
                        curScore = 10;
                    }
                    else
                    {
                        curScore = Character.getNumericValue(dartResult.charAt(i));
                    }
            }
        }

        return answer;
    }
}
