package classes.interfaces.functionalinterface.lambdaexpression.types.function;

@FunctionalInterface
public interface Function<T, R> {
    R function(T t);
}
