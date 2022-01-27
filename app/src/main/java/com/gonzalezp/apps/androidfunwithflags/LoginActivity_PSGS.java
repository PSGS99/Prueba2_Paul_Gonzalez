package com.gonzalezp.apps.androidfunwithflags;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LoginActivity_PSGS extends AppCompatActivity {

    private EditText user;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_psgs);

        user = findViewById(R.id.textbox_usuario);
        pass = findViewById(R.id.textbox_clave);

        /*Context ctx = getApplicationContext();
        FileInputStream file = ctx.openFileInput();
        InputStreamReader input = new InputStreamReader(file);
        BufferedReader buff = new BufferedReader(input);
        String line = buff.readLine();*/
    }

    public void onClickIngresar(View view) {

        String usr = user.getText().toString();
        String pas = pass.getText().toString();

        if ((usr == "usr1" && pas == "usr1") || (usr == "usr2" && pas == "usr2") || (!usr.isEmpty() && !pas.isEmpty())) {

            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("key_user", usr);
            startActivity(intent);
        }

    }

}
