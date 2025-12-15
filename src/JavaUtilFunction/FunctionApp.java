package JavaUtilFunction;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        Function<String, Integer> function = value -> value.length();
        Integer length = function.apply("Sandy Dwi Handoko Trapsilo");
        System.out.println(length);
    }
}
