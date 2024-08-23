package com.example.testevideo;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.videoView);

        // Obtém o URI do vídeo na pasta raw
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.testevideo);

        videoView.setVideoURI(videoUri);

        // Adiciona um MediaController para controles de reprodução
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        // Configura o vídeo para preencher a tela
        videoView.setLayoutParams(new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT
        ));

        videoView.start();//deu bom?
    }
}
