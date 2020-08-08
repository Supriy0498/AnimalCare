package com.example.animalcare;

import com.google.firebase.Timestamp;
import com.google.firebase.database.ServerValue;
import com.google.firebase.firestore.ServerTimestamp;

import java.io.Serializable;

public class AnimalHelpCase implements Serializable {

    private String userName,desc,userNo;
    private String animalType,cityType;
    private String userLocation;
    private String photourl;
    private double latitude;
    private String rescueStatus;
    private double longitude;
    private boolean accepted;
    public @ServerTimestamp
    Timestamp timestamp;

    public AnimalHelpCase() {
    }

    public AnimalHelpCase(String userName, String animalType, String cityType, String userLocation, double latitude, double longitude, String photourl, Boolean accepted, String desc) {
        this.animalType = animalType;
        this.cityType = cityType;
        this.userName = userName;
        this.userLocation = userLocation;
        this.latitude = latitude;
        this.longitude = longitude;
        this.photourl=photourl;
        this.accepted=accepted;
        this.desc=desc;
        this.rescueStatus = "Waiting for rescue";
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRescueStatus() {
        return rescueStatus;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public String getDesc() {
        return desc;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public String getCityType() {
        return cityType;
    }

    public String getUserName() {
        return userName;
    }

    public String getAnimalType() {
        return animalType;
    }


    public String getUserLocation() {
        return userLocation;
    }

    public String getPhotourl() {
        return photourl;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
