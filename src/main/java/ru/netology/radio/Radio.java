package ru.netology.radio;

public class Radio {
    private int currentChannel;
    private int maxChannel = 9;
    private int minChannel = 0;
    private int currentSound;
    private int maxSound = 10;
    private int minSound = 0;

    public void setCurrentChannelConsole(int currentChannel) {
        if (currentChannel >= minChannel && currentChannel <= maxChannel) {
            this.currentChannel = currentChannel;
        }
    }

    public void setCurrentChannelNext(int currentChannel) {
        if (currentChannel < maxChannel) {
            this.currentChannel = currentChannel + 1;
        } else if (currentChannel > maxChannel) {
            this.currentChannel = minChannel;
        }
    }

    public void setCurrentChannelPrev(int currentChannel) {
        if (currentChannel > minChannel) {
            this.currentChannel = currentChannel - 1;
        } else if (currentChannel < minChannel) {
            this.currentChannel = maxChannel;
        }
    }

    public int getCurrentChannel() {
        return currentChannel;
    }


    public int getCurrentSound() {
        return currentSound;
    }

    public void setCurrentSoundPlus() {
        if (currentSound < maxSound) {
            this.currentSound = currentSound + 1;
        } else if (currentSound == maxSound) {
            this.currentSound = maxSound;

        }
    }

    public void setCurrentSoundMinus() {
        if (currentSound > minSound) {
            this.currentSound = currentSound - 1;
        } else if (currentSound == minSound) {
            this.currentSound = minSound;
        }
    }
}
