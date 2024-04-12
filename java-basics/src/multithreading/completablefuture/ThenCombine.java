package multithreading.completablefuture;

import java.util.concurrent.CompletableFuture;

public class ThenCombine {
    public static void main(String[] args) {
        try{
            CompletableFuture<Integer> astask1 = CompletableFuture.supplyAsync(() -> {
                return 10;
            });
            CompletableFuture<String> astask2 = CompletableFuture.supplyAsync(() -> {
                return "K";
            });

            CompletableFuture<String> combinedFutureObj = astask1.thenCombine(astask2, (Integer a, String b) -> a + b);

            System.out.println(combinedFutureObj.get());

            String a = "abc";
            Integer b = 10;
            String c = a+b;
            System.out.println(c);
        } catch (Exception e) {

        }
    }
}
