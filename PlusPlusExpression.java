// Composite Expression
package iter4_reverse_context;

public class PlusPlusExpression implements Expression<Integer> {
    private Expression<Integer> baseExpression;
    //private Expression rightExpression;
    public PlusPlusExpression(Expression<Integer> baseExpression) {
        this.baseExpression = baseExpression;
    }
    @Override
    public Integer interpret(Context context) {
        if (context.isReverse() == ContextType.REVERSE) {
            return baseExpression.interpret(context) - 1;
        }
        return baseExpression.interpret(context) + 1;
    }
}
