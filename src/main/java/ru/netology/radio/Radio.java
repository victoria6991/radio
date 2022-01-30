package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationAmount = 10;

    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > stationAmount - 1) {
            return;
        } else {
            currentStation = newCurrentStation;
        }
    }

    public void nextStation() {
        if (currentStation == stationAmount - 1) {
            this.currentStation = 0;
            return;
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            this.currentStation = stationAmount - 1;
            return;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 101) {
            currentVolume = newCurrentVolume;
        } else {
           return;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
       ///     currentVolume = 0;
            return;
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
