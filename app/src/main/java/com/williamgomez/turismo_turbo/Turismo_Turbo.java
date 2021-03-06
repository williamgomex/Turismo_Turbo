package com.williamgomez.turismo_turbo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Turismo_Turbo extends Activity {
    ImageView portada;
    Button acerca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turismo_turbo);
        portada = (ImageView) findViewById(R.id.portada);
        acerca = (Button) findViewById(R.id.acercab);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_turismo__turbo, menu);
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

    public void menufunction(View view){
        Intent k = new Intent(this,Principal.class);
        startActivity(k);
    }

    public void acercadeb(View view){
        Intent k = new Intent(this,Acercade.class);
        startActivity(k);
    }
}
