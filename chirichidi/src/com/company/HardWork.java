package com.company;

import java.util.stream.*;

public class HardWork {

    public static void main(String[] args) {

        int[] works = {4, 3, 3};
        int n = 4;

        HardWork hardWork = new HardWork();
        long answer = hardWork.calcFatigue(n, works);

        int breakA = 1;
    }

    public long calcFatigue(int n, int[] works) {
        long answer = 0;
        int len = works.length;

        // 0. Confirm whether you can off work.
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += works[i];
        }
         // too slow..
//        int sum = IntStream.of(works).sum();

        if (n >= sum) {
            return answer;
        }

        // 1. Reduce the works per n
        while (n-- > 0) {
            int max = 0;
            int search = 0;

            for (int i = 0; i < len; i++) {
                if (works[i] > max) {
                    max = works[i];
                    search = i;
                }
            }

            works[search]--;
        }

        // 2. Calculate the work shift Indicator.
        for (int i = 0; i < len; i++) {
            answer += works[i] * works[i];
        }

        return answer;
    }
}
