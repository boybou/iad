package week4;

/**
 * Created by boybo on 26-6-2018.
 */
public interface Queue {
    public void enqueue(Object o);
    public Object dequeue();
    public Object front();
    public int size();
    public boolean isEmpty();
}

