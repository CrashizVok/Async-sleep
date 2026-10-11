import org.junit.Test;

import java.util.concurrent.CompletableFuture;

public class AsyncTest {
    @Test
    public void testResolve() throws InterruptedException {
        Main.main(null);
    }

    public static String fail(){
        throw new RuntimeException("Test Exception");
    }

    @Test
    public void testReject(){
        CompletableFuture<String> jobToFail = CompletableFuture.supplyAsync(AsyncTest::fail);
        jobToFail.exceptionally(AsyncService::handleRejected);
    }
}
