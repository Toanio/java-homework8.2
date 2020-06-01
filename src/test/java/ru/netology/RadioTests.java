package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTests {
    @Test
    public void shouldCreateRadioStation() {
        Radio newRadio = new Radio();
        newRadio.setCurrentRadioStation(5);
        newRadio.getPrevButton();
        assertEquals(4, newRadio.getCurrentRadioStation());


    }

    @Test
    public void shouldRadioPressNextButton() {
        Radio newRadio = new Radio();
        newRadio.setCurrentRadioStation(8);
        newRadio.getNextButton();
        assertEquals(9, newRadio.getCurrentRadioStation());
    }

    @Test
    public void shouldRadioPressPrevButton() {
        Radio newRadio = new Radio();
        newRadio.setCurrentRadioStation(5);
        newRadio.getPrevButton();
        assertEquals(4, newRadio.getCurrentRadioStation());
    }

    @Test
    public void shouldRadioPressMinusButton() {
        Radio newRadio = new Radio();
        newRadio.setCurrentSoundVolume(5);
        newRadio.getMinusButton();
        assertEquals(4, newRadio.getCurrentSoundVolume());
    }

    @Test
    public void shouldRadioPressPlusButton() {
        Radio newRadio = new Radio();
        newRadio.setCurrentSoundVolume(5);
        newRadio.getPlusButton();
        assertEquals(6, newRadio.getCurrentSoundVolume());
    }

    @Test
    public void shouldRadioVolumeNotMax() {
        Radio newRadio = new Radio();
        newRadio.setCurrentSoundVolume(9);
        newRadio.getPlusButton();
        assertEquals(9, newRadio.getCurrentSoundVolume());
    }

    @Test
    public void shouldRadioVolumeNotMin() {
        Radio newRadio = new Radio();
        newRadio.setCurrentSoundVolume(0);
        newRadio.getMinusButton();
        assertEquals(0, newRadio.getCurrentSoundVolume());
    }

    @Test
    public void shouldRadioStationOverMax() {
        Radio newRadio = new Radio();
        newRadio.setCurrentRadioStation(10);
        newRadio.getNextButton();
        assertEquals(0, newRadio.getCurrentRadioStation());
    }

    @Test
    public void shouldRadioStationOverMin() {
        Radio newRadio = new Radio();
        newRadio.setCurrentRadioStation(0);
        newRadio.getPrevButton();
        assertEquals(10, newRadio.getCurrentRadioStation());
    }
}
