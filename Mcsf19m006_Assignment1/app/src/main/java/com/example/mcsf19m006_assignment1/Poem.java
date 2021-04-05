package com.example.mcsf19m006_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class Poem extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onDestroy() {
        super.onDestroy();
        stopPlayer();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poem);
         videoView=findViewById(R.id.vedio_view);
        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.poem;
        Uri uri=Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController=new MediaController(Poem.this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }
    public  void stopPlayer(){
        if(videoView!=null){
            videoView=null;
            Toast.makeText(this, "MediaPlayer Realeased", Toast.LENGTH_SHORT).show();
        }
    }
}