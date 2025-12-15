package JavaUtilFunction;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> predicate = value -> value.isBlank();
        boolean blank = predicate.test("Sandy");
        System.out.println(blank);
    }
}
