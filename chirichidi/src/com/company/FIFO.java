package com.company;

public class FIFO {

    public static void main(String[] args) {

//        int[] cores = {10000, 10000};
        int[] cores = new int[10000];
        for(int i = 0; i < cores.length; i++)
        {
            cores[i] = 10000;
        }
        int n = 50000;

        FIFO fifo = new FIFO();
        long core = fifo.solution(n, cores);

        int break1 = 1;
    }

    public long solution(int n, int[] cores)
    {
        /**
         * 한 라운드가 꼭 1 단위일 필요?
         * 코어에 작업을 맡기면 n 은 1 감소
         * 단, 코어간 우선순위는 앞 코어
         */

        int[] timers = new int[cores.length];
        for (int i = 0; i < timers.length; i++)
        {
            timers[i] = -1;
        }

        int core = -1;
        int nextAmount = 1;
        while(n > 0)
        {
            for (int i = 0; i < cores.length; i++)
            {
                int reverseThroughput = cores[i];

                if (timers[i] < reverseThroughput)
                {
                    timers[i] += nextAmount;
                }
                else
                {
                    timers[i] = 0;
                }

                if (timers[i] == 0 || timers[i] == reverseThroughput)
                {
                    timers[i] = 0;
                    n--;
                    core = (i + 1); //core numbering : 1 ~ n
                }

                if (n == 0)
                {
                    break;
                }
            }

            //TODO 한 라운드가 돌았을때, 다음 작업이 끝나기까지 최소 타이머만큼 시간을 진행시켜야 함(최적화)
            nextAmount = getMinValue(timers, cores);
        }

        return core;
    }

    public int getMinValue(int[] timers, int[] cores) {
        int minValue = cores[0] - timers[0];
        for (int i = 1; i < timers.length; i++) {
            if (cores[i] - timers[i] < minValue) {
                minValue = cores[i] - timers[i];
            }
        }
        return minValue;
    }
}
