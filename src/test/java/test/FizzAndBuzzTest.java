package test;

import org.junit.Test;

import java.util.List;

import static test.FizzAndBuzz.fizzBuzz;

public class FizzAndBuzzTest {
    @Test
    public void test(){
        List<String> list = fizzBuzz(100);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
