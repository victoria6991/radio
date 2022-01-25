package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        } else {
            currentStation = newCurrentStation;
        }
    }

    public void nextStation() {
        if (currentStation == 9) {
            this.currentStation = 0;
            return;
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            this.currentStation = 9;
            return;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 11) {
            currentVolume = newCurrentVolume;
        } else {
            currentVolume = 0;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 0;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }
}
