public class ParsingExample {
    public static void main(String[] args) {
        Object a = 23;
        Double d = 24.25;
        String str = "123";

        System.out.println("Type of the object a = " + a.getClass().getSimpleName());
        System.out.println("Type of d = " + d.getClass().getSimpleName());

        try {
//            Integer number = Integer.parseInt(str);
            Double number = Double.parseDouble(str);
            System.out.println(number.getClass().getSimpleName());
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
