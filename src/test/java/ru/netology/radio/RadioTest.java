package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void getCurrentChannelConsole() {
        radio.setCurrentChannelConsole(5);
        assertEquals(5,radio.getCurrentChannel());

    }
    @Test
    void getCurrentChannelConsoleMin() {
        radio.setCurrentChannelConsole(0);
        assertEquals(0,radio.getCurrentChannel());

    }
    @Test
    void getCurrentChannelConsoleMax() {
        radio.setCurrentChannelConsole(9);
        assertEquals(9,radio.getCurrentChannel());

    }

    @Test
    void getCurrentChannelNext() {
        radio.setCurrentChannelNext(5);
        assertEquals(6, radio.getCurrentChannel());

    }
    @Test
    void getCurrentChannelPrev() {
        radio.setCurrentChannelPrev(8);
        assertEquals(7, radio.getCurrentChannel());

    }
    @Test
    void getCurrentChannelNextMax() {
        radio.setCurrentChannelNext(10);
        assertEquals(0, radio.getCurrentChannel());

    }
    @Test
    void getCurrentChannelPrevMin() {
        radio.setCurrentChannelPrev(-1);
        assertEquals(9, radio.getCurrentChannel());

    }
    @Test
    void getCurrentSoundPlus() {
        radio.setCurrentSoundPlus();
        radio.setCurrentSoundPlus();
        radio.setCurrentSoundPlus();
        assertEquals(3,radio.getCurrentSound());
    }
    @Test
    void getCurrentSoundPlusMax() {
        for(int i = 0;i < 11; i ++) {
            radio.setCurrentSoundPlus();
        }
        assertEquals(10,radio.getCurrentSound());
    }
    @Test
    void getCurrentSoundMinus() {
        radio.setCurrentSoundPlus();
        radio.setCurrentSoundPlus();
        radio.setCurrentSoundMinus();
        assertEquals(1,radio.getCurrentSound());
    }
    @Test
    void getCurrentSoundMinusMin() {
        radio.setCurrentSoundPlus();
        radio.setCurrentSoundPlus();
        radio.setCurrentSoundMinus();
        radio.setCurrentSoundMinus();
        radio.setCurrentSoundMinus();
        assertEquals(0,radio.getCurrentSound());
    }
}

