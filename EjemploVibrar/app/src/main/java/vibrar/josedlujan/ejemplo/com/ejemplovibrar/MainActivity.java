package vibrar.josedlujan.ejemplo.com.ejemplovibrar;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button vibrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vibrar = (Button) findViewById(R.id.boton);
        final Vibrator vibrator = (Vibrator) this.getSystemService(Context.VIBRATOR_SERVICE);


        vibrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //****vibrar normal
                //vibrator.vibrate(600);



               //*****Verificar si nuestro telefono puede vibrar
                // Get instance of Vibrator from current Context
                //Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                // Output yes if can vibrate, no otherwise
                //if (v.hasVibrator()) {
                //    Log.v("Can Vibrate", "YES");
                //} else {
                 //   Log.v("Can Vibrate", "NO");
                //}


                //****patron vibrar indefinido
                //long[] pattern = {0,100,1000};
                //vibrator.vibrate(pattern,0);


                //****patrones de vibracion
                // Each element then alternates between vibrate, sleep, vibrate, sleep...
                //long[] pattern = {0, 100, 1000, 300, 200, 100, 500, 200, 100};
                // The '-1' here means to vibrate once, as '-1' is out of bounds in the pattern array
                //vibrator.vibrate(pattern, -1);






                long[] pattern = {0,50,100,50,100,50,100,400,100,300,100,350,50,200,100,100,50,600};
                vibrator.vibrate(pattern, -1);


            }
        });
    }
}
