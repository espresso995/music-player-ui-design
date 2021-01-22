package com.android.trungnh2.musicplayeruidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.makeramen.roundedimageview.RoundedImageView;

public class MainActivity extends AppCompatActivity {

    RoundedImageView imageAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageAlbum = findViewById(R.id.imageAlbum);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);
        imageAlbum.setAnimation(animation);
    }
}
