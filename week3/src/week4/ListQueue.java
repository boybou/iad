package week4;

import ding.Lijst;

/**
 * Created by boybo on 26-6-2018.
 */
public class ListQueue implements Queue {
    Lijst lijst = new Lijst();
    @Override
    public void enqueue(Object o) {
        lijst.addFirst(o);
    }

    @Override
    public Object dequeue() {
        return lijst.removeLast();
    }

    @Override
    public Object front() {
        return lijst.getLast();
    }

    @Override
    public int size() {
        return lijst.getSize();
    }

    @Override
    public boolean isEmpty() {
        return lijst.getSize() == 0;
    }
}
