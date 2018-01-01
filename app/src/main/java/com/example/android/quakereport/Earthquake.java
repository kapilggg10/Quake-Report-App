package com.example.android.quakereport;

/**
 * Created by KAPIL on 7/26/2017.
 */

public class Earthquake {
    /** Magnitude of the earthquake */
    private double mMagnitude;
    private String mLocation;
    /** Time of the earthquake */
    private long mTimeInMilliseconds;
    private String mUrl;

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds,String Url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = Url;
    }


    /**
     * Returns the magnitude of the earthquake.
     */
    public double getMagnitude() {
        return mMagnitude;
    }
    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    public String getUrl(){return mUrl;}
}
