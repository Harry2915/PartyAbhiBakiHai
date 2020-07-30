package harish.hibare.partyabhibakihai;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener, View.OnLongClickListener {
    MediaPlayer mediaPlayer,mediaPlayer1;
    SoundPool soundPool;
    public static int dhamaka;
    Random random_crazy=new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view=new View(this);
        view.setOnClickListener(this);
        view.setOnTouchListener(this);
        view.setOnLongClickListener(this);
        setContentView(view);
        view.setBackgroundColor(Color.rgb(random_crazy.nextInt(200),random_crazy.nextInt(255),random_crazy.nextInt(255)));

        mediaPlayer=MediaPlayer.create(this,R.raw.backgroundmusic);
        mediaPlayer1=MediaPlayer.create(this,R.raw.soundtrack);
        soundPool=new SoundPool(5, AudioManager.STREAM_MUSIC,0);
        soundPool.load(this,R.raw.explosion,1);


    }

    @Override
    public void onClick(View v) {
        mediaPlayer1.start();
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        view.setBackgroundColor(Color.rgb(random_crazy.nextInt(200),random_crazy.nextInt(255),random_crazy.nextInt(255)));

        soundPool.play(1,1,1,0,0,1);
        return false;
    }

    @Override
    public boolean onLongClick(View v) {
        mediaPlayer.start();
        return false;
    }
}