package com.gonzalezp.apps.androidfunwithflags;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity_PSGS extends AppCompatActivity {

    private EditText user;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_psgs);

        user = findViewById(R.id.textbox_usuario);
        pass = findViewById(R.id.textbox_clave);
    }

    public void onClickIngresar(View view) {

        String usr = user.getText().toString();
        String pas = pass.getText().toString();

        if ((usr == "usr1" && pas == "usr1") || (usr == "usr2" && pas == "usr2") || (!usr.isEmpty() && !pas.isEmpty())){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        /*if (!nom.isEmpty() && !ape.isEmpty()) {
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("key_nombre", nom);
            intent.putExtra("key_apellido", ape);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Nombre y Apellido requeridos", Toast.LENGTH_LONG).show();
        }*/

    }

}