package photgraphy.com.google.phtography;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mediaPlayer=MediaPlayer.create( MainActivity.this , R.raw.mysound);
        mediaPlayer.start();

        Button b1=(Button)findViewById(R.id.btn1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Types.class);
                startActivity(i);
                Toast.makeText(getBaseContext(), "Mohammad Qushair", Toast.LENGTH_LONG).show();
            }
        });



    }
}
