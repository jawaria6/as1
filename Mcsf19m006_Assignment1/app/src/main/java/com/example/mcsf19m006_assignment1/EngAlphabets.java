package com.example.mcsf19m006_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class EngAlphabets extends AppCompatActivity {
    MediaPlayer player;

 String [] AlphabetsPics;
    String [] Pictures;
    ImageView alphabets;
    ImageView words;

    AnimationDrawable runingAlphabets;
    AnimationDrawable runingWords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng_alphabets);
      alphabets =findViewById(R.id.v1);

      alphabets.setImageResource(R.drawable.runingalphabets);
        words =findViewById(R.id.v2);
        words.setImageResource(R.drawable.runinigpics);
      runingAlphabets=(AnimationDrawable)alphabets.getDrawable();
        runingWords=(AnimationDrawable)words.getDrawable();





    }
    public  void play(View v){
        if(player == null){
            player=MediaPlayer.create(this,R.raw.childeren);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        runingAlphabets.start();
        runingWords.start();
        player.start();
    }

    public  void stop(View v)
    {
        stopPlayer();
        runingAlphabets.stop();
        runingWords.stop();
    }
    public  void stopPlayer(){
        if(player!=null){
            player.release();
            player=null;
            Toast.makeText(this, "MediaPlayer Realeased", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }
}