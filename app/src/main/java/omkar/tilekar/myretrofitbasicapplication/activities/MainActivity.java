package omkar.tilekar.myretrofitbasicapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;

import omkar.tilekar.myretrofitbasicapplication.R;
import omkar.tilekar.myretrofitbasicapplication.fragment.LoginFragment;

public class MainActivity extends AppCompatActivity {

FrameLayout container_fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container_fragment = findViewById(R.id.fragment_container);

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,new LoginFragment()).commit();
    }
}
