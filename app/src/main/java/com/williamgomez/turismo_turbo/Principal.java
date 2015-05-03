package com.williamgomez.turismo_turbo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Principal extends Activity {
    Button turbom1;
    Button turbom2;
    Button turbom3;
    Button turbom4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        turbom1 = (Button) findViewById(R.id.boton1);
        turbom2 = (Button) findViewById(R.id.boton2);
        turbom3 = (Button) findViewById(R.id.boton3);
        turbom4 = (Button) findViewById(R.id.boton4);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void boton1function(View view){
        Intent k = new Intent(this,Hoteles.class);
        startActivity(k);
    }

    public void boton2function(View view){
        Intent k = new Intent(this,Bares.class);
        startActivity(k);
    }

    public void boton3function(View view){
        Intent k = new Intent(this,Informacion.class);
        startActivity(k);
    }

    public void boton4function(View view){
        Intent k = new Intent(this,Demografia.class);
        startActivity(k);
    }
}