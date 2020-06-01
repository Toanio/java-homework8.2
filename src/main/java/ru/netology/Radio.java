package ru.netology;

public class Radio {
    private int currentRadioStation;

    private int currentSoundVolume;


    private int prevButton;
    private int nextButton;
    private int plusButton;
    private int minusButton;
    private int minVolume = 0;
    private int maxVolume = 9;

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

    public void getPrevButton() {
        int newStation = getCurrentRadioStation() - 1;
        if (newStation<0){
            setCurrentRadioStation(10);
            return;
        }
        setCurrentRadioStation(newStation);

    }

    public void getNextButton() {
        int newStation = getCurrentRadioStation() + 1;
        if (newStation > 10) {
            setCurrentRadioStation(0);
            return;
        }
        setCurrentRadioStation(newStation);
    }

    public void getPlusButton() {
        int newVolume= getCurrentSoundVolume()+1;
        if (newVolume>9){
            return;
        }
        setCurrentSoundVolume(newVolume);
    }

    public void getMinusButton() {
        int newVolume= getCurrentSoundVolume()-1;
        if (newVolume<0){
            return;
        }
        setCurrentSoundVolume(newVolume);
    }


}
