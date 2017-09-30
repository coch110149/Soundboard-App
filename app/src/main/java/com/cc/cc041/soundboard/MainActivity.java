package com.example.cc041.soundboard;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.HashMap;


public class MainActivity extends AppCompatActivity implements MediaPlayer.OnCompletionListener
{
    private HashMap mButtonToMediaHM = new Constants().getButtonToMediaHashMap();
    private MediaPlayer mMediaPlayer = new MediaPlayer();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMediaPlayer.setOnCompletionListener(this);
    }

    public void playBusy(View v)
    {
        if(!mMediaPlayer.isPlaying())
        {
            Uri path = Uri.parse(
                    "android.resource://"+getPackageName()+"/" + mButtonToMediaHM.get(v.getId()));
            try
            {
                mMediaPlayer.setDataSource(getApplicationContext(),path);
                mMediaPlayer.prepare();
                mMediaPlayer.start();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void onCompletion(final MediaPlayer mp)
    {
        mMediaPlayer.reset();
    }
}
