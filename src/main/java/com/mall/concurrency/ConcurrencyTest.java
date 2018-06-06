package com.mall.concurrency;

import com.mall.concurrency.annoations.NoThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

@Slf4j
@NoThreadSafe
public class ConcurrencyTest {
    //运行次数
    private  static int clientTotal = 5000;
    //线程总数
    private  static int threadTotal = 200;

    private  static  int count = 0;

    public static void main (String[] args) throws Exception{
        ExecutorService executorService = Executors.newCachedThreadPool();
        final Semaphore semaphore = new Semaphore(threadTotal);
        final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);
        for (int i = 0; i < clientTotal; i++) {
            executorService.execute(() -> {
                try{
                    semaphore.acquire();
                    add();
                    semaphore.release();
                } catch (Exception ex){
                    log.error("exception", ex);
                }
                countDownLatch.countDown();
            });
        }
        executorService.shutdown();
        countDownLatch.await();
        log.info("count : " + count);
    }

    private static void add(){
        count ++;
    }

}
