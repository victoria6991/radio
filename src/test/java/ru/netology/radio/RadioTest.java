package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void getCurrentStation() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setStation8() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void switchToNextStationWhenCurrentIs0() {
        Radio radio = new Radio();
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void switchToNextStationWhenCurrentIS9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void switchToNextStationWhenCurrentIS8() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void switchToNextStationAboveLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(12);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void switchToNextStationWhenCurrentIs1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.nextStation();
        int expected = 2;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void switchToPrevStationWhenCurrentIs0() {
        Radio radio = new Radio();
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void switchToPrevStationWhenCurrentIs9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void switchToPrevStationWhenCurrentIs1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prevStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void switchToPrevStationWhenCurrentIs8() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.prevStation();
        int expected = 7;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.increaseVolume();
        int expected = 9;
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeHigherThanMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeWhenCurrentIsMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        int expected = 9;
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeToPossibleMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeLowerThanMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeWhenCurrentVolumeIsIrrelevant() {
        Radio radio = new Radio();
        radio.setCurrentVolume(12);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

}