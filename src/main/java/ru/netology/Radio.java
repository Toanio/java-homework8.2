package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {

    private int currentRadioStation;
    private int currentSoundVolume;
    private int minRadioStation = 0;
    private int maxRadioStation = 10;
    private int minRadioVolume = 0;
    private int maxRadioVolume = 100;


    public void setRemoteControlButtons(int remoteControlButtons) {
        setCurrentRadioStation(remoteControlButtons);
    }

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public void getPreviousRadioStationButton() {
        currentRadioStation--;
        if (currentRadioStation < minRadioStation) {
            currentRadioStation = maxRadioStation;
            return;
        }

    }

    public void getNextRadioStationButton() {
        currentRadioStation++;
        if (currentRadioStation > maxRadioStation) {
            currentRadioStation = minRadioStation;
            return;
        }
    }

    public void getIncreaseVolumeButton() {
        currentSoundVolume++;
        if (currentSoundVolume > maxRadioVolume) {
            currentSoundVolume = maxRadioVolume;
            return;
        }
    }

    public void getDecreaseVolumeButton() {
        currentSoundVolume--;
        if (currentSoundVolume < minRadioVolume) {
            currentSoundVolume = minRadioVolume;
            return;
        }
    }


}
