package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTests {
    Radio newRadio = new Radio();

    @Test
    public void shouldRadioPressNextRadioStationButton() {

        newRadio.getNextRadioStationButton();

        assertEquals(6, newRadio.getCurrentRadioStation());
    }

    @Test
    public void shouldRadioPressPreviousButton() {

        newRadio.getPreviousRadioStationButton();

        assertEquals(4, newRadio.getCurrentRadioStation());
    }

    @Test
    public void shouldRadioPressDecreaseVolumeButton() {

        newRadio.getDecreaseVolumeButton();

        assertEquals(19, newRadio.getCurrentSoundVolume());

    }

    @Test
    public void shouldRadioPressIncreaseVolumeButton() {


        newRadio.getIncreaseVolumeButton();

        assertEquals(21, newRadio.getCurrentSoundVolume());
    }

    @Test
    public void shouldRadioVolumeNotMax() {

        newRadio.setCurrentSoundVolume(100);
        newRadio.getIncreaseVolumeButton();
        assertEquals(100, newRadio.getCurrentSoundVolume());
    }

    @Test
    public void shouldRadioVolumeNotMin() {

        newRadio.setCurrentSoundVolume(0);
        newRadio.getDecreaseVolumeButton();
        assertEquals(0, newRadio.getCurrentSoundVolume());
    }

    @Test
    public void shouldRadioStationOverMax() {

        newRadio.setCurrentRadioStation(100);
        newRadio.getNextRadioStationButton();
        assertEquals(0, newRadio.getCurrentRadioStation());
    }

    @Test
    public void shouldRadioStationOverMin() {

        newRadio.setCurrentRadioStation(0);
        newRadio.getPreviousRadioStationButton();
        assertEquals(10, newRadio.getCurrentRadioStation());
    }
    @Test
    public void shouldSettingNumberRadioStation(){
        Radio radio2=new Radio(100);
        radio2.setRemoteControlButtons(100);
        radio2.getNextRadioStationButton();
        assertEquals(0, radio2.getCurrentRadioStation());
    }


    @Test
    public void shouldSettingViaRemoteControlButtons() {

        newRadio.setRemoteControlButtons(7);
        assertEquals(7, newRadio.getCurrentRadioStation());
    }

}
