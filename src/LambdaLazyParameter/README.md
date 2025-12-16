# Lazy Parameter
- Java tidak memiliki fitur parameter lazy seperti di bahasa pemrograman seperti Scala.
- Lazy parameter artinya, parameter tersebut hanya akan dieksekusi ketika diakses.
- Untungnya, dengan menggunakan Lambda, kita bisa membuat parameter layaknya lazy parameter.
- Kode: Bukan Lazy Parameter
```java
public static void testScore(int value, String name) {
    if (value > 80) {
        System.out.println("Selamat " + name + ", Anda lulus");
    } else {
        System.out.println("Coba lagi tahun depan");
    }
}

public static String getName() {
    System.out.println("getName() dipanggil");
    return "Sandy";
}
```
- Kode: Lazy Parameter
```java
import java.util.function.Supplier;

public static void main(String[] args) {
    testScore(90, () -> getName());
}

public static void testScore(int value, Supplier<String> name) {
    if (value > 80) {
        System.out.println("Selamat " + name.get() + ", Anda lulus");
    } else {
        System.out.println("Coba lagi tahun depan");
    }
}

public static String getName() {
    System.out.println("getName() dipanggil");
    return "Sandy";
}
```