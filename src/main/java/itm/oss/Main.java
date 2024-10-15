package itm.oss;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("This is my calculator. 5 + 5 = " + calc.add(5,5));
        System.out.println("This is my calculator. 5 + 5 = " + calc.subtract(5,5));
    }
}