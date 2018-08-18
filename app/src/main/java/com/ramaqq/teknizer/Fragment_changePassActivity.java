package com.ramaqq.teknizer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import android.support.v7.widget.Toolbar;

/**
 * Created by ramaqq on 7/18/2018.
 */

public class Fragment_changePassActivity extends AppCompatActivity {
    private static final String TAG = "Fragment_changePassActivity";
    private EditText password1, changePassword, verifyPassword;

    @Nullable
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changepass);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        password1 = findViewById(R.id.etChangePass);

        changePassword = findViewById(R.id.etNewPass);
        verifyPassword = findViewById(R.id.etVerify);
    }
    private boolean validatePass(){
        String password = password1.getText().toString().trim();
        if (password.isEmpty()){
            password1.setError("Field can't be empty");
            return false;
        }else {
            password1.setError(null);
            return true;
        }
    }
    public void confirmInput(View v){
        if (!validatePass()){
            return;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }
}
