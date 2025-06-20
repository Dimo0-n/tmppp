package patterns.behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        //(10 + 20) * 2
        Expression expr = new Multiply(
                new Add(
                new Number(10),
                new Number(20)),
                new Number(2)
        );

        int result = expr.interpret();
        System.out.println(result);
    }
}
