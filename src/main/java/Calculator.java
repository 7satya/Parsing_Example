public class Calculator {
    CalculatorService service;
    public Calculator(CalculatorService service) {
        this.service = service;
    }

    public int performAdd(int x, int y) {
        int addition = service.add(x, y);
        return addition*x;
    }
}
