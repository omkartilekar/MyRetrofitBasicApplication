package omkar.tilekar.myretrofitbasicapplication.fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import omkar.tilekar.myretrofitbasicapplication.R;

public class LoginFragment extends Fragment {
    Button loginBtn_op;
    EditText emailInput_op,passInput_op;
    TextView registerTV_op;
    public LoginFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_login, container, false);

        //Login
        emailInput_op = view.findViewById(R.id.emailInput);
        passInput_op = view.findViewById(R.id.passwordInput);
        loginBtn_op = view.findViewById(R.id.loginBtn);
        loginBtn_op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Login", Toast.LENGTH_SHORT).show();
            }
        });

        // Register

        registerTV_op = view.findViewById(R.id.registerTV);
        registerTV_op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Register", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}