package ru.netology.radio;

public class Radio {
    private int currentChannel;
    private int maxChannel = 9;
    private int minChannel = 0;
    private int currentSound;
    private int maxSound = 10;
    private int minSound = 0;

    public int getCurrentChannel() {

        if (currentChannel > minChannel && currentChannel < maxChannel || currentChannel == maxChannel || currentChannel == minChannel) {
            return currentChannel;
        }
        return currentChannel;
    }


    public void setCurrentChannel(int currentChannel) {
        if (currentChannel >= minChannel) {
            this.currentChannel = currentChannel;
        }
        if (currentChannel <= maxChannel) {
            this.currentChannel = currentChannel;
        }
        if (currentChannel > maxChannel) {
            this.currentChannel = minChannel;
        }
        if (currentChannel < minChannel) {
            this.currentChannel = maxChannel;
        }
    }

    public int getCurrentSound() {
        if (currentSound < maxSound && currentSound > minSound) {
            return currentSound;
        }

        if (currentSound == maxSound) {
            return maxSound;
        }
        if (currentSound == minSound) {
            return minSound;
        }
        return currentSound;
    }


    public void setCurrentSound(int currentSound) {
        if (currentSound < maxSound) {
            this.currentSound = currentSound;
        }
        if (currentSound > minSound) {
            this.currentSound = currentSound;
        }
        if (currentSound >= maxSound) {
            this.currentSound = maxSound;
        }
        if (currentSound <= minSound) {
            this.currentSound = minSound;
        }
    }
}
