package ru.netology;

public class Radio {

    private int currentRadioStation = 5;
    private int currentSoundVolume = 20;
    private int minRadioStation = 0;
    private int maxRadioStation = 10;
    private int minRadioVolume = 0;
    private int maxRadioVolume = 100;


    public void setRemoteControlButtons(int remoteControlButtons) {
        setCurrentRadioStation(remoteControlButtons);
    }

    public Radio() {

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
