package photgraphy.com.google.phtography;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Nabulsi on 10-Mar-16.
 */
public class Types extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.types);

Button canon=(Button)findViewById(R.id.bb2);
        canon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String url = "http://www.canon.com";
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
            }
        });

Button b1 =(Button)findViewById(R.id.btnt1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Types.this,MainActivity.class);
                startActivity(i);
            }
        });


        Button b2=(Button)findViewById(R.id.btn2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Types.this,Lens.class);
                startActivity(i);
            }
        });
Button b3=(Button)findViewById(R.id.btnt3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Types.this,Canon.class);
                startActivity(i);
                Toast.makeText(getBaseContext(), "Mohammad Qushair", Toast.LENGTH_LONG).show();
            }
        });

        Button video =(Button)findViewById(R.id.bbv1);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Types.this,Video.class);
                startActivity(i);
                Toast.makeText(getBaseContext(), "Youtube Videos", Toast.LENGTH_LONG).show();
            }
        });

    }
}
