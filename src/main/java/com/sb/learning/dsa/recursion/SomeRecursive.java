package com.sb.learning.dsa.recursion;

import java.util.Arrays;

/*The function returns true if a single value in the array returns true when passed to the callback*/
public class SomeRecursive {
    public boolean someRecursive(int[] listOfNums, OddFuntion oddFuntion){
        if (listOfNums.length == 1){
            return oddFuntion.run(listOfNums[0]);
        }
        return oddFuntion.run(listOfNums[0]) ||
                someRecursive(Arrays.copyOfRange(listOfNums, 1, listOfNums.length), oddFuntion);
    }

    public static class OddFuntion{
        public boolean run(int num){
            return num % 2 != 0;
        }
    }
}
