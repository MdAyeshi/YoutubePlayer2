package com.example.mdjubairayeshi.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

/**
 * Created by Md Jubair Ayeshi on 04-08-2017.
 */

public class StandaloneActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);
        Button btnplayVideo=(Button)findViewById(R.id.btnPlayVideo);
        Button btnPlayList=(Button)findViewById(R.id.btnPlayList);

        btnplayVideo.setOnClickListener(this);
        btnPlayList.setOnClickListener(this);
//Second Way
//        View.OnClickListener ourListener= new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        };
//Third way
//        btnPlayList.setOnClickListener(ourListener);
//        btnplayVideo.setOnClickListener(ourListener);
//
//        btnplayVideo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
    }

    @Override
    public void onClick(View view) {
        Intent intent=null;
        switch (view.getId()){
            case R.id.btnPlayVideo:
                intent= YouTubeStandalonePlayer.createVideoIntent(this,YoutubeActivity.GOOGLE_API_KEY,YoutubeActivity.YOUTUBE_VIDEO_ID,0,true,false);
                break;
            case R.id.btnPlayList:
                intent= YouTubeStandalonePlayer.createPlaylistIntent(this,YoutubeActivity.GOOGLE_API_KEY,YoutubeActivity.YOUTUBE_PLAYLIST,0,0,true,true);
                break;
            default:
        }
        if(intent!=null)
        {
            startActivity(intent);
        }

    }
}
