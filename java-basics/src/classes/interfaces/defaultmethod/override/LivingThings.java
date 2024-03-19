package classes.interfaces.defaultmethod.override;

public interface LivingThings {
    default boolean canBreath() {
        return true;
    }
}
