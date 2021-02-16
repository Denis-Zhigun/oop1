package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void currentChannelInTheRange(){
        radio.setCurrentChannel(4);
        assertEquals(4,radio.getCurrentChannel());

    }
    @Test
    public void currentChannelMoreRange(){
        radio.setCurrentChannel(11);
        assertEquals(0,radio.getCurrentChannel());

    }
    @Test
    public void currentChannelLessRange(){
        radio.setCurrentChannel(-1);
        assertEquals(9,radio.getCurrentChannel());

    }
    @Test
    public void currentChannelEqualMax(){
        radio.setCurrentChannel(9);
        assertEquals(9,radio.getCurrentChannel());

    }

    @Test
    public void currentChannelEqualMin(){
        radio.setCurrentChannel(0);
        assertEquals(0,radio.getCurrentChannel());

    }
    @Test
    public void currentSoundlInTheRange(){
        radio.setCurrentSound(5);
        assertEquals(5,radio.getCurrentSound());

    }
    @Test
    public void currentSoundMoreRange(){
        radio.setCurrentSound(12);
        assertEquals(10,radio.getCurrentSound());

    }
    @Test
    public void currentSoundLessRange(){
        radio.setCurrentSound(-1);
        assertEquals(0,radio.getCurrentSound());

    }
    @Test
    public void currentSoundlEqualMax(){
        radio.setCurrentSound(10);
        assertEquals(10,radio.getCurrentSound());

    }

    @Test
    public void currentSoundEqualMin(){
        radio.setCurrentSound(0);
        assertEquals(0,radio.getCurrentSound());

    }


}

