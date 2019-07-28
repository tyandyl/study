package thead;

/**
 * Created by tianye13 on 2019/7/19.
 */
public abstract class AbstractOwnableSynchronizerTest implements java.io.Serializable{
    private static final long serialVersionUID = 4528253068864587572L;
    protected AbstractOwnableSynchronizerTest() { }

    private transient Thread exclusiveOwnerThread;

    protected final void setExclusiveOwnerThread(Thread t) {
        exclusiveOwnerThread = t;
    }

    protected final Thread getExclusiveOwnerThread() {
        return exclusiveOwnerThread;
    }
}
