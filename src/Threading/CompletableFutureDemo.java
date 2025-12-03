package Threading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Void> future = CompletableFuture.runAsync(()->{
            try {
                Thread.sleep(5000);
                System.out.println("run async completed");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });




        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(()-> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "mian uth gaya";
        }).thenApply(supplyResult -> supplyResult + "ab main isme add karta jaunga");


        System.out.println(future1.get());
        System.out.println(future.get());



    }
}
