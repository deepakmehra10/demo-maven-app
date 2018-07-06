/*
package com.knoldus;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class FunctionalApp {
    
    public static void main(String[] args) throws Exception {
        CompletableFuture<Integer> futureValue = CompletableFuture.supplyAsync(() -> 30);
        CompletableFuture<Integer> incrementedFutureValue = futureValue.thenApply(FunctionalApp::incrementByOne);
    
        int result = incrementedFutureValue.get(10, TimeUnit.SECONDS);
    
        System.out.println("Incremented value - " + result);
    }
    
    private static int incrementByOne(int value) {
        
        return value + 1;
    }
}
*/
