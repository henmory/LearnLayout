package com.henmory.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.henmory.AppAccountManager.AppAccountManager;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    AppAccountManager accManager;
    Button btn_login, btn_Register;
    TextView txt_forgetPassword;
    EditText edt_account;
    EditText edt_password;
    RadioButton radioBtn_savePassword;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = (Button)findViewById(R.id.btn_Login);
        btn_login.setOnClickListener(this);
        btn_Register = (Button) findViewById(R.id.btn_Regster);
        btn_Register.setOnClickListener(this);
        txt_forgetPassword = (TextView) findViewById(R.id.txt_forgetPassword);
        txt_forgetPassword.setOnClickListener(this);
        radioBtn_savePassword = (RadioButton) findViewById(R.id.radioBtn_savePassword);
        radioBtn_savePassword.setOnClickListener(this);
        edt_account = (EditText) findViewById(R.id.edit_account);
        edt_password = (EditText) findViewById(R.id.edit_password);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_Login:
                accManager.loginAppAccount(edt_account.getText().toString(), edt_password.getText().toString());
                break;
            case R.id.btn_Regster:
                intent = new Intent(this, RegisterActivity.class);
                startActivity(intent);
//                accManager.registerAppAccount();
                break;
            case R.id.txt_forgetPassword:
                intent = new Intent(this, FindPasswordActivity.class);
                startActivity(intent);
//                accManager.forgetAppPassword();
                break;
            case R.id.radioBtn_savePassword:
                accManager.saveAppPassword(edt_account.getText().toString(), edt_password.getText().toString());
        }
    }
}
