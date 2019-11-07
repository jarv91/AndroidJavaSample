package com.jarv.javasample.presentation.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.jarv.javasample.R;
import com.jarv.javasample.presentation.home.HomeActivity;

public class WelcomeActivity extends AppCompatActivity {

    private Button btnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btnContinue = findViewById(R.id.btnContinue);
    }

    @Override
    protected void onStart() {
        super.onStart();
        btnContinue.setOnClickListener(v -> {
            startActivity(HomeActivity.newIntent(WelcomeActivity.this));
            finish();
        });
    }
}
