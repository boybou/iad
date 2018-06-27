package ding;

/**
 * Created by boybo on 31-5-2018.
 */
public interface Stack {
    public void push(Object o);
    public Object pop();
    public Object peek();
    public int size();
    public boolean isEmpty();
}

