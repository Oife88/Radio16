package org.example;

public class Radio {
    private int currentStationNumber;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationsCount) {
        maxStation = stationsCount - 1;

    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < 0) {
            return;
        }
        if (currentStationNumber > maxStation) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }

        this.currentVolume = currentVolume;
    }

    public void next() {
        if (currentStationNumber != maxStation) {
            currentStationNumber++;
        } else {
            currentStationNumber = 0;
        }
    }

    public void prev() {
        if (currentStationNumber != 0) {
            currentStationNumber++;
        } else {
            currentStationNumber = maxStation;
        }
    }

    public void plus() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
    }

    public void minus() {
        if (currentVolume  > 0) {
            currentVolume = currentVolume - 1;
        } else {
            return;
        }
    }
}
