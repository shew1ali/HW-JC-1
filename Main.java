import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Не дели на ноль");
        }
        calc.println.accept(c);
        /**Поскольку были использованы не математические операции, а унарные, которые могут изменять значения переменных.
         Таким образом, деление на 0 не приводит к ArithmeticException.
         Можно попробовать добавить его вручную. */
    }
}


