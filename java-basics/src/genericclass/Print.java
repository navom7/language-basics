package genericclass;

public class Print<T> {
    T value;
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
