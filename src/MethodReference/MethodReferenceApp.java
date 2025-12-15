package MethodReference;

import util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
        Predicate<String> predicate1 = value -> StringUtil.isLowerCase(value);
        Predicate<String> predicate2 = StringUtil::isLowerCase;

        System.out.println(predicate1.test("Sandy"));
        System.out.println(predicate2.test("Dwi"));

        // Method reference parameter
        Function<String, String> function1 = value -> value.toUpperCase();
        Function<String, String> function2 = String::toUpperCase;

        System.out.println(function1.apply("Sandy"));
        System.out.println(function2.apply("Dwi"));
    }

    public void run() {
        Predicate<String> predicate1 = value -> isLowerCase(value);
        Predicate<String> predicate2 = this::isLowerCase;
    }

    public void run2() {
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> isLowerCase = app::isLowerCase;
    }

    public boolean isLowerCase(String value) {
        for (char c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) return false;
        }

        return true;
    }
}
