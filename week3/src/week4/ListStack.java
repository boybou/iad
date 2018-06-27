package week4;

import ding.Lijst;

/**
 * Created by boybo on 26-6-2018.
 */
public class ListStack implements Stack {
    private Lijst lijst =  new Lijst();

    @Override
    public void push(Object o) {
        lijst.addFirst(o);
    }

    @Override
    public Object pop() {
        return lijst.removeFirst();
    }

    @Override
    public Object peek() {
        return lijst.getFirst();
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
