package LambdaDiCollection;

import java.util.List;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> names = List.of("Sandy", "Dwi", "Handoko", "Trapsilo");

        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);
    }
}
