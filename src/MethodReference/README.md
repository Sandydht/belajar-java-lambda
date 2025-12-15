# Method Reference
- Kadang saat membuat lambda, isi lambda-nya hanya mengakses method lain atau mengakses method yang ada di parameter method lambda-nya.
- Kita bisa mempersingkat pembuatan lambda tersebut dengan method reference.
- Kode: Static Method
```java
public class StringUtil {
    public static boolean isLowerCase(String value) {
        for (char c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) return false;
        }
        
        return true;
    }
}
```
- Kode: Method Reference Static
```java
import util.StringUtil;

import java.util.function.Predicate;

public static void main(String[] args) {
    Predicate<String> predicate1 = value -> StringUtil.isLowerCase(value);
    Predicate<String> predicate2 = StringUtil::isLowerCase;

    System.out.println(predicate1.test("Sandy"));
    System.out.println(predicate2.test("Dwi"));
}
```
- Kode: Method Reference Object
```java
import java.util.function.Predicate;

public static void main(String[] args) {
    StringApp stringApp = new StringApp();

    Predicate<String> predicate1 = value -> stringApp.isLowerCase(value);
    Predicate<String> predicate2 = stringApp::isLowerCase;

    System.out.println(predicate1.test("Sandy"));
    System.out.println(predicate2.test("Dwi"));
}
```
- Kode: Method Reference Parameter
```java
import java.util.function.Function;

public static void main(String[] args) {
    Function<String, String> function1 = value -> value.toUpperCase();
    Function<String, String> function2 = String::toUpperCase;

    System.out.println(function1);
    System.out.println(function2);
}
```