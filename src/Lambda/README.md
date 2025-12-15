# Membuat Lambda
- Di materi sebelumnya kita sudah mencoba membuat lambda.
- Sekarang kita akan bahas beberapa cara membuat lambda lainnya.
- Kode: Lambda Interface dengan Parameter
```java
@FunctionalInterface
public interface SimpleAction {
    String action(String name);
}
```
- Kode: Lambda dengan Parameter
```java
public static void main(String[] args) {
    SimpleAction simpleAction1 = (String name) -> {
        return "Hello" + name;
    };
    
    SimpleAction simpleAction2 = (name) -> {
        return "Hello" + name;
    };
}
```
- Kode: Lambda Tanpa Blok
```java
public static void main(String[] args) {
    SimpleAction simpleAction1 = (String name) -> "Hello " + name;
    SimpleAction simpleAction2 = (name) -> "Hello " + name;
    SimpleAction simpleAction3 = name -> "Hello " + name;
}
```