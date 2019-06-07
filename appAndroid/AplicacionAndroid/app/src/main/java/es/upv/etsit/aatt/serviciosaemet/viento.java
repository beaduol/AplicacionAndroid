package es.upv.etsit.aatt.serviciosaemet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class viento extends AppCompatActivity {
    Bundle vient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viento);

        vient=getIntent().getExtras();
        String direccion_str = vient.getString("direccion_str");
        int velocidad_int = vient.getInt("velocidad_int");

     TextView vent = (TextView)findViewById(R.id.textView55);
     vent.setText(""+velocidad_int+"m/s");

      TextView direc = (TextView)findViewById(R.id.textView54);
      direc.setText(direccion_str);
    }
}
