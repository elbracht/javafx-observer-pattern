package observerPattern;

import java.util.Observable;

public class Counter extends Observable {
    private int counter;

    public int getCounter() {
        return this.counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
        setChanged();
        notifyObservers();
    }
}
