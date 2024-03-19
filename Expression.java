package iter4_reverse_context;

// Abstract Expression
interface Expression<Object> {
    Object interpret(Context context);
}