package com.dn.crashreporter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class SendMailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_mail);
        String email = getIntent().getStringExtra("email");
        String password = getIntent().getStringExtra("password");
        String message = getIntent().getStringExtra("message");
        Info info = (Info)getIntent().getSerializableExtra("info");

    }
}
