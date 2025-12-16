package LambdaDiCollection;

import java.util.HashMap;
import java.util.Map;

public class MapForEachApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("firstName", "Sandy");
        map.put("middleName", "Dwi");
        map.put("lastName", "Handoko");

        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
