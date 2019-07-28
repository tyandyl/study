package thead;

import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by tianye13 on 2019/7/19.
 */
public class TheadTest {

    public static void main(String[] agrs){
        final Suo suo=new Suo();
        new Thread(new Runnable() {
            public void run() {
                Thread.currentThread().setName("线程1");
                Thread.currentThread().interrupt();
                suo.SuoTest();
            }

        }).start();
        new Thread(new Runnable() {
            public void run() {
                Thread.currentThread().setName("线程2");
                suo.SuoTest();
            }

        }).start();

        ReentrantLock reentrantLock=new ReentrantLock(true);
    }



}
