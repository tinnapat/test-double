package com.tinnapat.testdouble.spy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.*;

class HouseTest {

    @Test
    public void close_house_windows_and_door_must_close() {
        // set up
        Door spyDoor = spy(new Door());
        Windows spyWindows = spy(new Windows());
        House house = new House(spyDoor, spyWindows);

        // given

        // when
        house.close();

        // then
        then(spyDoor).should().close();
        then(spyWindows).should().close();
        assertTrue(spyDoor.isClose());
        assertTrue(spyWindows.isClose());
    }
}