package com.learning;

public class Kata {
    public String highAndLow(String numbers) {
        String nr=numbers;
        String[] numbersInStrArray = nr.split(" ");
        //need to understand the below
        int max = Integer.MIN_VALUE, maxIndex = 0;
        int min = Integer.MAX_VALUE, minIndex = 0;
        for (int i = 0; i < numbersInStrArray.length; i++) {
            if (Integer.parseInt(numbersInStrArray[i]) > max) {
                max = Integer.parseInt(numbersInStrArray[i]);
                maxIndex = i;
            }
            if (Integer.parseInt(numbersInStrArray[i]) < min) {
                min = Integer.parseInt(numbersInStrArray[i]);
                minIndex = i;
            }
        }
        System.out.println(max + " " + min);
        return max + " " + min;
    }
}
