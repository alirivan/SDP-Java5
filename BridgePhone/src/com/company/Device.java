package com.company;

public interface Device {

    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    String getApp();

    void setApp(String app);

    void printStatus();
}
