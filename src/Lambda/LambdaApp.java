package Lambda;

public class LambdaApp {
    public static void main(String[] args) {
//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "Sandy";
//            }
//        };
//
//        System.out.println(simpleAction1.action(""));
//
//        SimpleAction simpleAction2 = (String name) -> {
//            return "Sandy";
//        };
//
//        System.out.println(simpleAction2.action(""));

        SimpleAction simpleAction1 = (String value) -> {
            return "Hello " + value;
        };

        SimpleAction simpleAction2 = (value) -> {
            return "Hello " + value;
        };

        System.out.println(simpleAction1.action("Sandy"));
        System.out.println(simpleAction2.action("Dwi"));

        SimpleAction simpleAction3 = (String value) -> "Hello " + value;
        SimpleAction simpleAction4 = (value) -> "Hello " + value;
        SimpleAction simpleAction5 = value -> "Hello" + value;

        System.out.println(simpleAction3.action("Sandy"));
        System.out.println(simpleAction4.action("Dwi"));
        System.out.println(simpleAction5.action("Handoko"));
    }
}
