package com.tinnapat.testdouble.spy;

public class Door {

    private boolean close;

    public boolean isClose() {
        return close;
    }

    public void close() {
        this.close = true;
    }

    public void open() {
        this.close = false;
    }
}
