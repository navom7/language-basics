package classes.genericclass.rawtype;

public class RawType<T> {
    T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
