package com.example.sunshine;

public class Weather {

    private int NO_IMAGE_PROVIDED = -1;
    private String mDay;
    private int  mResourceImageId = NO_IMAGE_PROVIDED;
    private String mStatus;
    private String mDegrees1;
    private String mDegrees2;

    public Weather(String day, String status, String degrees1, String degrees2, int ImageResource) {
        mDay = day;
        mStatus = status;
        mDegrees1 = degrees1;
        mDegrees2 = degrees2;
        mResourceImageId = ImageResource;
    }

    public String getmDay() {
        return mDay;
    }

    public String getmStatus() {
        return mStatus;
    }

    public String getmDegrees1() {
        return mDegrees1;
    }

    public String getmDegrees2() {
        return mDegrees2;
    }

    public Integer getmResourceImageId() {
        return mResourceImageId;
    }
}
