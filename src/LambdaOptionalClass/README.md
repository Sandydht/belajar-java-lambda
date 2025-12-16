# Optional Class
- Di Java 8, Java menyediakan sebuah class baru bernama Optional yang berada di package java.util.
- Class ini digunakan sebagai wrapper untuk value yang bisa bernilai null.
- Optional di desain agar kita lebih mudah ketika beroperasi dengan object yang bisa null.
- Karena NullPointerException adalah salah satu hal yang sering sekali ditemuai oleh Programmer Java.
- Kode: Problem NullPointerException
```java
public static void main(String[] args) {
    sayHello("Sandy");
    sayHello(null);
}

public static void sayHello(String name) {
    String upperName = name.toUpperCase();
    System.out.println("HELLO " + upperName);
}
```
- Kode: Menggunakan Optional
```java
import java.util.Optional;

public static void sayHello(String name) {
    Optional<String> optionalName = Optional.ofNullable(name);
    Optional<String> upperName = optionalName.map(value -> value.toUpperCase());
    upperName.ifPresent(value -> System.out.println("HELLO " + value));
}
```
- Kode: Mengambil Data di Optional
```java
import java.util.Optional;

public static void sayHello(String name) {
    String upperName = Optional.ofNullable(name)
            .map(String::toUpperCase)
            .orElseGet(() -> "");

    System.out.println("HELLO " + upperName);
}
```