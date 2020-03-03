package com.example.instaslam;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.example.instaslam", appContext.getPackageName());
    }

    public static class LoginActivity extends AppCompatActivity
    {
        public static final String TAG  = "com.example.instaslam.ExampleInstrumentedTest.LoginActivity";
        private EditText etUsername;
        private EditText etPassword;
        private Button btnLogin;

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            etUsername = findViewById(R.id.etUsername);
            etPassword = findViewById(R.id.etPassword);
            btnLogin = findViewById(R.id.btnLogin);
            btnLogin.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Log.i(TAG, "onClick login button");
                    String username = etUsername.getText().toString();
                    String password = etPassword.getText().toString();
                    loginUser(username, password);
                }
            });
        }

        private void loginUser(String username, String password)
        {
            Log.i(TAG, "Attempting to login user" + username);
        }
    }
}
