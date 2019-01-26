package com.example.student.earthquake_stp;

/**
 * Created by Student on 26-01-2019.
 */

public class Earthquake {


    private String mMagnitude;
    private String mLocation;
    private String mDate;
public Earthquake(String mag,String loc,String date){
    mMagnitude=mag;
    mLocation=loc;
    mDate=date;
}

public String getMagnitude(){
    return mMagnitude;
}
public String getLocation(){
    return mLocation;
}
public String getDate(){
    return mDate;
}

}
