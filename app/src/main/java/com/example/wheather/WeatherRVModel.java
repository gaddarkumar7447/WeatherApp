package com.example.wheather;

import com.google.android.material.expandable.ExpandableWidgetHelper;

public class WeatherRVModel {
    private String time;
    private String temperature;
    private String icon;
    private String widSpeed;

    public WeatherRVModel(String time, String temperature, String icon, String widSpeed){
        this.icon = icon;
        this.temperature = temperature;
        this.time = time;
        this.widSpeed = widSpeed;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getWidSpeed() {
        return widSpeed;
    }

    public void setWidSpeed(String widSpeed) {
        this.widSpeed = widSpeed;
    }
}
