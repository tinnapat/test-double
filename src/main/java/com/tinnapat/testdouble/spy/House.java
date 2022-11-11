package com.tinnapat.testdouble.spy;

public class House {

    public House(Door door, Windows windows) {
        this.door = door;
        this.windows = windows;
    }

    private Door door;
    private Windows windows;

    public void close() {
        door.close();
        windows.close();
    }

}
