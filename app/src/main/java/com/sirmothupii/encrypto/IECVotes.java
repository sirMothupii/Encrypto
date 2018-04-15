package com.sirmothupii.encrypto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IECVotes extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iecvotes);

    }
    public void onClickOnlineVotes(View view)
    {
        Intent intent1 = new Intent(this, CryptoBallot.class);
        startActivity(intent1);
    }
}
