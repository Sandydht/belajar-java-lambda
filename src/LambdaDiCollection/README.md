# Lambda di Collection
- Saat fitur lambda keluar di Java 8, ada banyak sekali default method yang ditambahkan ke Java Collection.
- Beberapa ada default method yang banyak memanfaatkan fitur Lambda.
- Di materi ini kita akan bahas beberapa method yang memanfaatkan Lambda.

## Iterable.forEach
```java
import java.util.Objects;
import java.util.function.Consumer;

default void forEach(Consumer<? super T> action) {
    Objects.requireNonNull(action);
    for (T t : this) {
        action.accept(t);
    }
}
```
- Kode: Menggunakan Iterable.forEach
```java
import java.util.List;

public static void main(String[] args) {
    List<String> names = List.of("Sandy", "Dwi", "Handoko", "Trapsilo");
    
    names.forEach(name -> System.out.println(name));
    names.forEach(System.out::println);
}
```

## Collection.removeIf
```java
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Predicate;

default boolean removeIf(Predicate<? super E> filter) {
    Objects.requireNonNull(filter);
    boolean removed = false;
    final Iterator<E> each = iterator();
    while (each.hasNext()) {
        if (filter.test(each.next())) {
            each.remove();
            removed = true;
        }
    }
    return removed;
}
```
- Kode: Menggunakan Collection.removeIf
```java
import java.util.ArrayList;
import java.util.List;

public static void main(String[] args) {
    List<String> names = new ArrayList<>();
    names.addAll(List.of("Sandy", "Dwi", "Handoko", "Trapsilo"));
    
    names.removeIf(name -> name.length() > 5);

    System.out.println(names);
}
```

## Map.forEach
```java
default void forEach(BiConsumer<? super K, ? super V> action) {
    Objects.requireNonNull(action);
    for (Map.Entry<K, V> entry : entrySet()) {
        K k;
        V v;
        try {
            k = entry.getKey();
            v = entry.getValue();
        } catch (IllegalStateException ise) {
            // this usually means the entry is no longer in the map.
            throw new ConcurrentModificationException(ise);
        }
        action.accept(k, v);
    }
}
```
- Kode: Menggunakan Map.forEach
```java
import java.util.HashMap;
import java.util.Map;

public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    
    map.put("firstName", "Sandy");
    map.put("middleName", "Dwi");
    map.put("lastName", "Handoko");
    
    map.forEach((key, value) -> System.out.println(key + " : " + value));
}
```