package com.ynap.fp.exercise;

import java.util.List;

public class EvenAverageCalculator {

    public static Double compute(List<Integer> nums) {
        Double res = 0.0;
        Integer counter = 0;

        for(int i=0; i<=nums.size(); i++) {
            Integer num = nums.get(i);
            if(num%2 != 0) {
                res += num;
                counter++;
            }
        }

        return res / counter;
    }
}
