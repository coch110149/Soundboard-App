package com.example.cc041.soundboard;
import java.util.HashMap;
public class Constants
{
    private static HashMap<Integer,Integer> mButtonToMediaHashMap = new HashMap<>();

    Constants()
    {
        mButtonToMediaHashMap.put(R.id.busy_button,R.raw.busy);
        mButtonToMediaHashMap.put(R.id.nothing_button,R.raw.yougetnothing);
        mButtonToMediaHashMap.put(R.id.felicia_button,R.raw.felicia);
        mButtonToMediaHashMap.put(R.id.manual_button,R.raw.manual);
        mButtonToMediaHashMap.put(R.id.senate_button,R.raw.senate);
        mButtonToMediaHashMap.put(R.id.trouble_button,R.raw.trouble);
        mButtonToMediaHashMap.put(R.id.disconnected_button,R.raw.disconnected);
    }

    public HashMap getButtonToMediaHashMap()
    {
        return mButtonToMediaHashMap;
    }

}
