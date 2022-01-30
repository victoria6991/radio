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
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setStation14() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(14);
        int expected = 14;
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
    void switchToNextStationWhenCurrentIs9() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void switchToNextStationWhenCurrentIs17() {
        Radio radio = new Radio(18);
        radio.setCurrentStation(16);
        radio.nextStation();
        int expected = 17;
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
        Radio radio = new Radio(25);
        radio.setCurrentStation(1);
        radio.nextStation();
        int expected = 2;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void switchToPrevStationWhenCurrentIs0() {
        Radio radio = new Radio(30);
        radio.prevStation();
        int expected = 29;
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
    void switchToPrevStationWhenCurrentIs50() {
        Radio radio = new Radio(51);
        radio.setCurrentStation(50);
        radio.prevStation();
        int expected = 49;
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
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeWhenItsMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeWhenCurrentIsMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.decreaseVolume();
        int expected = 99;
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
        radio.setCurrentVolume(112);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

}