package Threading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        //Mocking a service call
        CompletableFuture<Void> cf = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "Order service returned response now";
        }).thenApply(x -> "Adding to "+x).thenAccept(result -> System.out.println("Order service response complete"));




        List<Integer> myList = List.of(10,20,30,40,50);
        System.out.println(myList.stream().reduce(0,Integer::sum));


        Thread.sleep(15000);
    }
}
