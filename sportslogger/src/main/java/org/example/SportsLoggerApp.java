package org.example;

public class SportsLoggerApp {

    private String activity;
    private int duration;

    public SportsLoggerApp(String activity, int duration) {
        this.activity = activity;
        this.duration = duration;
    }

    public String getActivity() {
        return activity;
    }

    public int getDuration() {
        return duration;
    }

    public void logActivity() {
        System.out.println("Activity: " + activity + ", Duration: " + duration + " minutes.");
    }

    public static void main(String[] args) {
        SportsLoggerApp logger = new SportsLoggerApp("Running", 30);
        logger.logActivity();
    }
}
