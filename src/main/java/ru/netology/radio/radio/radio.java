package ru.netology.radio.radio;

public class radio {

    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }

        this.currentStation = currentStation;
    }

    public void setNextStation() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }

    }

    public void setPrevStation() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        }
    }

}
