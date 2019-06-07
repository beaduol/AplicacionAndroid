package es.upv.etsit.aatt.serviciosaemet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class precipitacion extends AppCompatActivity {
Bundle pre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_precipitacion);

        pre=getIntent().getExtras();
        String cielo_str = pre.getString("cielo_str");
        int precip_int = pre.getInt("precip_int");

        TextView precip = (TextView)findViewById(R.id.textView42);
        precip.setText(""+precip_int+ "%");

        TextView cielo = (TextView)findViewById(R.id.textView44);
        cielo.setText(cielo_str);


    }
}
