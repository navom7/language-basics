package classes.enums;

public enum AbstractMethod {
    SUNDAY {
        public void dummyMethod() {
            System.out.println("Sunday");
        }
    },
    MONDAY{
        public void dummyMethod() {
            System.out.println("Monday");
        }
    },
    TUESDAY {
        public void dummyMethod() {
            System.out.println("Tuesday");
        }
    };

    public abstract void dummyMethod();
}
