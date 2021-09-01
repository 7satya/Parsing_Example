public class ParsingExample {
    public static void main(String[] args) {
        CalculatorService service = new CalculatorService();
        Calculator calculator = new Calculator(service);

        System.out.println(calculator.performAdd(2, 3));

    }
}
