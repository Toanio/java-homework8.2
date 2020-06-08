package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTests {


    @Test
    public void shouldRadioPressNextRadioStationButton() {
        Radio newRadio = new Radio();
        newRadio.setCurrentRadioStation(8);
        newRadio.getNextRadioStationButton();
        assertEquals(9, newRadio.getCurrentRadioStation());
    }

    @Test
    public void shouldRadioPressPreviousButton() {
        Radio newRadio = new Radio();
        newRadio.setCurrentRadioStation(5);
        newRadio.getPreviousRadioStationButton();
        assertEquals(4, newRadio.getCurrentRadioStation());
    }

    @Test
    public void shouldRadioPressDecreaseVolumeButton() {
        Radio newRadio = new Radio();
        newRadio.setCurrentSoundVolume(5);
        newRadio.getDecreaseVolumeButton();
        assertEquals(4, newRadio.getCurrentSoundVolume());

    }

    @Test
    public void shouldRadioPressIncreaseVolumeButton() {
        Radio newRadio = new Radio();
        newRadio.setCurrentSoundVolume(5);
        newRadio.getIncreaseVolumeButton();
        assertEquals(6, newRadio.getCurrentSoundVolume());
    }

    @Test
    public void shouldRadioVolumeNotMax() {
        Radio newRadio = new Radio();
        newRadio.setCurrentSoundVolume(9);
        newRadio.getIncreaseVolumeButton();
        assertEquals(0, newRadio.getCurrentSoundVolume());
    }

    @Test
    public void shouldRadioVolumeNotMin() {
        Radio newRadio = new Radio();
        newRadio.setCurrentSoundVolume(0);
        newRadio.getDecreaseVolumeButton();
        assertEquals(9, newRadio.getCurrentSoundVolume());
    }

    @Test
    public void shouldRadioStationOverMax() {
        Radio newRadio = new Radio();
        newRadio.setCurrentRadioStation(10);
        newRadio.getNextRadioStationButton();
        assertEquals(0, newRadio.getCurrentRadioStation());
    }

    @Test
    public void shouldRadioStationOverMin() {
        Radio newRadio = new Radio();
        newRadio.setCurrentRadioStation(0);
        newRadio.getPreviousRadioStationButton();
        assertEquals(10, newRadio.getCurrentRadioStation());
    }
}
