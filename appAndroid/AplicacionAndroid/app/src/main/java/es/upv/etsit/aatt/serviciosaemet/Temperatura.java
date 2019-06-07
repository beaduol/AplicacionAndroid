package es.upv.etsit.aatt.serviciosaemet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Temperatura extends AppCompatActivity {

    Bundle temper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        temper=getIntent().getExtras();
        int temp_max = temper.getInt("temp_max");
        int temp_min = temper.getInt ("temp_min");
        int sens_max = temper.getInt("sens_max");
        int sens_min = temper.getInt("sens_min");

        TextView TempMin = (TextView)findViewById(R.id.textView32);
        TempMin.setText(""+temp_min+"ºC");

        TextView TempMax = (TextView)findViewById(R.id.textView33);
        TempMax.setText(""+temp_max+"ºC");

        TextView sensMin = (TextView)findViewById(R.id.textView35);
        sensMin.setText(""+sens_min+"ºC");

        TextView sensMax = (TextView)findViewById(R.id.textView36);
        sensMax.setText(""+sens_max+"ºC");
    }

}
