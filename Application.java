package iter4_reverse_context;

// Client
public class Application {
    public static void main(String[] args) {
        // Create the expression: (2 + 3) + 4
        Expression expression = new AddExpression(
                new AddExpression(new NumberExpression(2), new NumberExpression(3)),
                new NumberExpression(4)
        );
        // Create the expression: 1++
        Expression expression2 = new PlusPlusExpression(new NumberExpression(10));
        // Random [0,5]
        Expression expression3 = new RandomExpression(new NumberExpression(6));
        // Random [3,5]
        Expression expression4 = new RandomExpression(new NumberExpression(3), new NumberExpression(6));
        // XOR
        Expression expression5 = new XORExpression(new BooleanExpression(false), new BooleanExpression(true));
        // Create the context, if needed
        Context context = new Context();
        // Interpret the expression
        // int result = expression.interpret(context);
        // int result2 = expression2.interpret(context);
        //System.out.println("Result: " + result); // Output: Result: 9
        System.out.println("Result: " + expression.interpret(context)); // Output: Result: 9
        System.out.println(expression2.interpret(context));
        System.out.println(expression3.interpret(context));
        System.out.println(expression4.interpret(context));
        System.out.println(expression5.interpret(context));

        Context contextR = new Context(ContextType.REVERSE);
        System.out.println("Result: " + expression.interpret(contextR)); // Output: Result: 9
        System.out.println(expression2.interpret(contextR));
        System.out.println(expression3.interpret(contextR));
        System.out.println(expression4.interpret(contextR));
        System.out.println(expression5.interpret(contextR));
    }
}
