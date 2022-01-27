package com.gonzalezp.apps.androidfunwithflags;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LoginActivity_PSGS extends AppCompatActivity {

    private EditText user;
    private EditText pass;
    public InputStream is;

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
        String data = "";
        StringBuffer sbuff = new StringBuffer();
        BufferedReader read = new BufferedReader(new InputStreamReader(is));

        if ((usr == "usr1" && pas == "usr1") || (usr == "usr2" && pas == "usr2") || (!usr.isEmpty() && !pas.isEmpty())) {

            if (usr == "usr1"){
                try{

                }catch (Exception ex){
                    ex.getMessage();
                }
            }else{

            }



            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("key_user", usr);
            startActivity(intent);
        }
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
