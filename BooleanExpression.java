// Terminal Expression
package iter4_reverse_context;

public class BooleanExpression implements Expression<Boolean> {
    private boolean booValue;
    public BooleanExpression(boolean Boolean) {
        this.booValue = booValue;
    }
    @Override
    public Boolean interpret(Context context) {
        if (context.isReverse() == ContextType.REVERSE) {
            return !booValue;
        }
        return booValue;
    }
}
