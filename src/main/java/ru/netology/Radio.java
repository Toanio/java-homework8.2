package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
public class Radio {

    private int currentRadioStation;
    private int currentSoundVolume;
    private int minRadioStation = 0;
    private int maxRadioStation = 10;
    private int minRadioVolume = 0;
    private int maxRadioVolume = 100;

    public void Radio() {

    }

    public void setRemoteControlButtons(int remoteControlButtons) {
        currentRadioStation = remoteControlButtons;

    }


    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        this.currentSoundVolume = currentSoundVolume;
    }

    public void clickPreviousRadioStationButton() {

        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
            return;
        }
        currentRadioStation--;
    }

    public void clickNextRadioStationButton() {

        if (currentRadioStation >= maxRadioStation) {
            currentRadioStation = minRadioStation;
            return;
        }
        currentRadioStation++;
    }

    public void clickIncreaseVolumeButton() {
        if (currentSoundVolume == maxRadioVolume) {
            return;
        }
        currentSoundVolume++;
    }

    public void clickDecreaseVolumeButton() {

        if (currentSoundVolume == minRadioVolume) {
            return;
        }
        currentSoundVolume--;
    }


}
