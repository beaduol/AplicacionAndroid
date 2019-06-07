package es.upv.etsit.aatt.serviciosaemet;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class menu extends AppCompatActivity {
    Button siguiente1,siguiente2,siguiente3;
    Bundle valores;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        valores=getIntent().getExtras();
        final String direccion_str = valores.getString("direccion_str");
        final String cielo_str = valores.getString("cielo_str");
        final int temp_max = valores.getInt("temp_max");
        final int temp_min = valores.getInt ("temp_min");
        final int sens_max = valores.getInt("sens_max");
        final int sens_min = valores.getInt("sens_min");
        final int precip_int =valores.getInt("precip_int");
        final int velocidad_int = valores.getInt("velocidad_int");




    siguiente1 = (Button)findViewById(R.id.button21);
        siguiente1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){

            Intent siguiente1 = new Intent(menu.this, Temperatura.class);
            Bundle temper = new Bundle();
            temper.putInt("temp_max", temp_max);
            temper.putInt("temp_min", temp_min);
            temper.putInt("sens_max", sens_max);
            temper.putInt("sens_min", sens_min);
            siguiente1.putExtras(temper);
            startActivity(siguiente1);
        }
    }
        );

     siguiente2 = (Button)findViewById(R.id.button22);
     siguiente2.setOnClickListener(new View.OnClickListener(){
         @Override
          public void onClick(View v){
             Intent siguiente2 = new Intent(menu.this, precipitacion.class);
             Bundle pre = new Bundle();
             pre.putInt("precip_int", precip_int);
             pre.putString("cielo_str", cielo_str);
             siguiente2.putExtras(pre);
             startActivity(siguiente2);
          }
     }
     );


    siguiente3 = (Button)findViewById(R.id.button23);
     siguiente3.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent siguiente3 = new Intent(menu.this, viento.class);
            Bundle vient = new Bundle();
            vient.putInt("velocidad_int", velocidad_int);
            vient.putString("direccion_str", direccion_str);
            siguiente3.putExtras(vient);
            startActivity(siguiente3);



        }
    }
    );

}
    }

