package com.aghanscode.utils;

// import java.util.Random;

public class RandomNumber {  

    public static long getRandom(long min, long max){
        long number = min + (long) (Math.random() * (max-min));
        return number;
    }
    // public static long getRandom(){
    //     long min = 1000;
    //     long max = 9999;
    //     long range = max-min;
    //     Random random = new Random(10000);
    //     long randomNumber = random.nextLong(range)+min;
    //     return randomNumber;
    // }
}
