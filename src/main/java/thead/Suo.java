package thead;

/**
 * Created by tianye13 on 2019/7/19.
 */
public class Suo {

    private Mutex mutex=new Mutex();

    public void SuoTest(){

        mutex.lock();
        System.out.println("锁住块,正在执行，当前线程是:"+Thread.currentThread().getName());
       // mutex.unlock();
    }
}
