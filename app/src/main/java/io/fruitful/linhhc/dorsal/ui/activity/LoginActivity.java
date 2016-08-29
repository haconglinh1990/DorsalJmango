package io.fruitful.linhhc.dorsal.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import io.fruitful.linhhc.dorsal.R;

public class LoginActivity extends AppCompatActivity {

    TextView tvForgotPassword;
    EditText etEmail, etPassword;
    Button btnLogIn, btnLogInFb, btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();

        action();

    }

    private void init() {
        etEmail = (EditText) findViewById(R.id.et_email);
        etPassword = (EditText) findViewById(R.id.et_password);
        tvForgotPassword = (TextView) findViewById(R.id.tv_forgotPassword);
        btnLogIn = (Button) findViewById(R.id.btn_login);
        btnSignUp = (Button) findViewById(R.id.btn_signUp);
    }

    private void action() {

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logIn();
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signUp();
            }
        });
    }

    private void logIn() {

    }

    private void signUp() {
    }
}
