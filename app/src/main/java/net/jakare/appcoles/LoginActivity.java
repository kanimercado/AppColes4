package net.jakare.appcoles;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;



public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void goHome(View view){


        // 0 = Profesor    1 = Padre
        int tipoCLiente = 0;

        if (tipoCLiente == 0) {

            Intent intent = new Intent(this, ListaCursosActivity.class);
            startActivity(intent);
        }
        else {
            Intent intent = new Intent(this, PadreActivity.class);
            startActivity(intent);
        }

    }
}
