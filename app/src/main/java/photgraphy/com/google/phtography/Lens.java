package photgraphy.com.google.phtography;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

/**
 * Created by Nabulsi on 10-Mar-16.
 */
public class Lens extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lens);

        ImageView image1=(ImageView)findViewById(R.id.aa);

        Button back=(Button)findViewById(R.id.btnl1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Lens.this,Types.class);
                startActivity(i);
            }
        });




    }


}
