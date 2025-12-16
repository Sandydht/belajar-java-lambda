package LambdaDiCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Sandy", "Dwi", "Handoko", "Trapsilo"));

        // Menggunakan anonymous class
        names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        });

        // Menggunakan lambda
        names.removeIf(name -> name.length() > 5);

        System.out.println(names);
    }
}
