package com.programacion.movil.estemanp.androidmvcapplication.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.programacion.movil.estemanp.androidmvcapplication.Controller.ApplicationController;
import com.programacion.movil.estemanp.androidmvcapplication.Domain.User;
import com.programacion.movil.estemanp.androidmvcapplication.R;

public class LoginActivity extends AppCompatActivity {

    EditText userName;
    EditText password;
    ApplicationController appController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        appController =(ApplicationController)getApplication();

        userName=(android.widget.EditText) this.findViewById(R.id.editUsername);
        password=(android.widget.EditText) this.findViewById(R.id.editPassword);
    }

    public void login(View view) {
        if(appController.isValidUser(userName.getText().toString(),password.getText().toString())) {
            User logUser = appController.getUser(userName.getText().toString());
            Intent intent;
            if (logUser.getRol().equals("admin")) {
                intent = new Intent(this, AdminActivity.class);
            }else{
                intent = new Intent(this, EventListActivity.class);
            }
            startActivity(intent);
        }else{
            Toast.makeText(this, "El usuario y contraseña no coinciden", Toast.LENGTH_SHORT).show();
        }
    }
}
