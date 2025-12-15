# Apa Itu Lambda ?
- Lambda berasal dari lambda calculus, yang mengacu pada anonymous function (function tanpa nama).
- Di Java, function / method tidak bisa berdiri sendiri.
- Jadi kemungkinan pada prakteknya, lambda di Java dan di bahasa pemrograman lain akan berbeda.

# Anonymous Class
- Di Java kita hanya mengenal Anonymous Class.
- Lambda di Java sebenarnya adalah versi sederhana membuat sebuah anonymous class.

# Syarat Lambda
- Berupa Interface
- Memiliki 1 method abstract.
- Ditambahkan annotation @FunctionlInterface di Interface-nya.
- Minimal menggunakan Java 8
- Kode: Membuat Lambda Interface
```java
@FunctionalInterface
public interface SimpleAction {
    String action();
}
```