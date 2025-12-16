package LambdaOptionalClass;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("Sandy");
        sayHello(null);
    }

    public static void sayHello(String name) {
        // Menggunakan cara standar
//        String upperName = name.toUpperCase();
//        System.out.println("HELLO " + upperName);

        // Menggunakan Optional
//        Optional<String> optionalName = Optional.ofNullable(name);
//        Optional<String> upperName = optionalName.map(value -> value.toUpperCase());
//        upperName.ifPresent(value -> System.out.println("HELLO " + value));

        // Menggunakan if check null
//        if (name != null) {
//            System.out.println("HELLO " + name);
//        }

        // Menggunakan method reference
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresent(value -> System.out.println("HELLO " + value));

        // Menggunakan method reference ifPresentOrElse()
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(
//                        value -> System.out.println("HELLO " + value),
//                        () -> System.out.println("HELLO")
//                );

        // Menggunakan orElse()
//        String upperName = Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .orElse("TEMAN");
//
//        System.out.println("HELLO " + upperName);

        // Menggunakan orElseGet()
        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElseGet(() -> "TEMAN");

        System.out.println("HELLO " + upperName);
    }
}
