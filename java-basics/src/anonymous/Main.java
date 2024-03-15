package anonymous;

public class Main {
    public static void main(String[] args) {
        AnonymousClass ac = new AnonymousClass() {
            @Override
            public void printAnonymous() {
                System.out.println("Anonymous");
            }
        };
        ac.printAnonymous();
    }
}
