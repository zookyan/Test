package test;

import java.util.ArrayList;
import java.util.List;


public class FizzAndBuzz {

    /**
     * fizz & buzz
     * stage 1
     */
    public static List<String> fizzBuzzStage1(int n) {
        List<String> result = new ArrayList<String>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else {
                if (i % 3 == 0) result.add("Fizz");
                else if (i % 5 == 0) result.add("Buzz");
                else result.add(i + "");
            }
        }
        return result;
    }

    /**
     * fizz & buzz
     * stage 2
     */
    public static List<String> fizzBuzzStage2(int n) {
        List<String> result = new ArrayList<String>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0 || String.valueOf(i).contains("3") || String.valueOf(i).contains("5")) {
                result.add("FizzBuzz");
            } else {
                if (i % 3 == 0 || String.valueOf(i).contains("3")) result.add("Fizz");
                else if (i % 5 == 0 || String.valueOf(i).contains("5")) result.add("Buzz");
                else result.add(i + "");
            }
        }
        return result;
    }
}


