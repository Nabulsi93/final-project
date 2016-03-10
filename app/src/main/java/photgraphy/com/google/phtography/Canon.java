package photgraphy.com.google.phtography;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Nabulsi on 10-Mar-16.
 */
public class Canon extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.canon);




        Button b1=(Button)findViewById(R.id.bbc1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Canon.this,Types.class);
                startActivity(i);
                Toast.makeText(getBaseContext(), "ALAA MOHAMMAD", Toast.LENGTH_LONG).show();
            }
        });


        Button b2=(Button)findViewById(R.id.bbh1);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Canon.this,MainActivity.class);
                startActivity(i);
                Toast.makeText(getBaseContext(), "Main page", Toast.LENGTH_LONG).show();
            }
        });
    }
}