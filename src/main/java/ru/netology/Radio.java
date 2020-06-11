package ru.netology;

public class Radio {
    private int currentRadioStation;

    private int currentSoundVolume;


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
        if (currentRadioStation < 0) {
            currentRadioStation = 10;
            return;
        }

    }

    public void getNextRadioStationButton() {
        currentRadioStation++;
        if (currentRadioStation > 10) {
            currentRadioStation = 0;
            return;
        }
    }

    public void getIncreaseVolumeButton() {
        currentSoundVolume++;
        if (currentSoundVolume > 9) {
            currentSoundVolume = 0;
            return;
        }
    }

    public void getDecreaseVolumeButton() {
        currentSoundVolume--;
        if (currentSoundVolume < 0) {
            currentSoundVolume = 9;
            return;
        }
    }


}
