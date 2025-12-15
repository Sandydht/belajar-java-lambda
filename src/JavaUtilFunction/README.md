# Java Util Function
- Saat Java 8 keluar dengan fitur Lambda-nya.
- Java juga menyediakan sebuah package baru bernama java.util.function.
- Package ini berisikan banyak sekali functional interface yang bisa kita gunakan untuk kebutuhan membuat lambda.
- Dengan menggunakan interface-interface yang ada di package ini, kita mungkin tidak perlu lagi membuat sendiri functional interface secara manual. 

## Interface Consumer
```java
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
```
- Kode: Menggunakan Consumer
```java
import java.util.function.Consumer;

public static void main(String[] args) {
    Consumer<String> consumer = value -> System.out.println(value);
    consumer.accept("Sandy Dwi Handoko Trapsilo");
}
```

## Interface Function
```java
@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
```
- Kode: Menggunakan Function
```java
import java.util.function.Function;

public static void main(String[] args) {
    Function<String, Integer> function = value -> value.length();
    
    Integer length = function.apply("Sandy Dwi Handoko Trapsilo");

    System.out.println(length);
}
```

## Interface Predicate
```java
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
```
- Kode: Menggunakan Interface
```java
import java.util.function.Predicate;

public static void main(String[] args) {
    Predicate<String> predicate = value -> value.isBlank();
    
    boolean blank = predicate.test("Sandy");

    System.out.println(blank);
}
```

## Interface Supplier
```java
@FunctionalInterface
public interface Supplier<T> {
    T get();
}
```
- Kode: Menggunakan Supplier
```java
import java.util.function.Supplier;

public static void main(String[] args) {
    Supplier<String> supplier = () -> "Sandy Dwi Handoko Trapsilo";
    
    String name = supplier.get();

    System.out.println(name);
}
```
