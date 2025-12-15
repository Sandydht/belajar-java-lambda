package JavaUtilFunction;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        Supplier<String> suplier = () -> "Sandy Dwi Handoko Trapsilo";

        String name = suplier.get();

        System.out.println(name);
    }
}
