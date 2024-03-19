// Composite Expression
package iter4_reverse_context;

public class XORExpression implements Expression<Boolean> {
    private BooleanExpression lexpr;
    private BooleanExpression rexpr;
    public XORExpression(BooleanExpression lexpr, BooleanExpression rexpr) {
        this.lexpr = lexpr;
        this.rexpr = rexpr;
    }

    @Override
    public Boolean interpret(Context context) {
        if (context.isReverse() == ContextType.REVERSE) {
            return !((lexpr.interpret(context)) ^ (rexpr.interpret(context)));
        }
        // making convenience use if the bitwise XOR operator (^) here
        return (lexpr.interpret(context)) ^ (rexpr.interpret(context));
    }
}
