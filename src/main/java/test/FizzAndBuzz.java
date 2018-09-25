package test;

import java.util.ArrayList;
import java.util.List;


public class FizzAndBuzz {

    /**
     * fizz & buzz
     */
    public static List<String> fizzBuzz(int n) {
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
}


