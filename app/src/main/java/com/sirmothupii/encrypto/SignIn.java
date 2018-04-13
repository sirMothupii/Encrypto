package com.sirmothupii.encrypto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignIn extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
    //Link to take user to the navigation screen
    public void onClickSignIn(View view)
    {
        Intent intent1 = new Intent(this, Profile.class);
        startActivity(intent1);
    }

    public void onClickRegister(View view)
    {
        Intent intent1 = new Intent(this, Profile.class);
        startActivity(intent1);
    }
}
