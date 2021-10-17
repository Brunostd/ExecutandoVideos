package com.example.executandovideos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        videoView = findViewById(R.id.videoView);

        // ESCONDE BARRA DE NAVEGAÇÃO E STATUS BAR
        View decorView = getWindow().getDecorView();
        int uiOpcions = View.SYSTEM_UI_FLAG_FULLSCREEN;

        decorView.setSystemUiVisibility( uiOpcions );

        //ESCONDER ACTION BAR
        getSupportActionBar().hide();

        // EXECUTAR O VIDEO
        videoView.setMediaController( new MediaController(this));
        videoView.setVideoPath("android.resource://"+ getPackageName()+ "/"+ R.raw.video);
        videoView.start();
    }
}