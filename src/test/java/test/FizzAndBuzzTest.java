package test;

import org.junit.Test;

import java.util.List;

import static test.FizzAndBuzz.fizzBuzzStage1;
import static test.FizzAndBuzz.fizzBuzzStage2;

public class FizzAndBuzzTest {
    @Test
    public void test1(){
        List<String> list = fizzBuzzStage1(100);
        for (String s : list) {
            System.out.println(s);
        }
    }

    @Test
    public void test2(){
        List<String> list = fizzBuzzStage2(100);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
