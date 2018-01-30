package com.example.eth_nick.fitnessapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by eth_nick on 1/25/2018.
 */

public class login extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        // DON"T RETURN RIGHT AWAY
        final View myView = inflater.inflate(R.layout.login_fragment, container, false);

        final Button btnLogin = (Button) myView.findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                EditText etUsername = (EditText) myView.findViewById(R.id.etUsername);
                String username = (etUsername.getText().toString());

                EditText etPassword = (EditText) myView.findViewById(R.id.etPassword);
                String password = (etPassword.getText().toString());

                // check if username is within database
                if (username.equals("username")){
                    // check if password is within database
                    if (password.equals("password")){

                        Toast.makeText(getContext(), "*personal info will be displayed below*", Toast.LENGTH_LONG).show();

                    } else {
                        Toast.makeText(getContext(), "Invalid Username/Password, try again", Toast.LENGTH_LONG).show();
                    }

                } else {
                    Toast.makeText(getContext(), "Invalid Username/Password, try again", Toast.LENGTH_LONG).show();
                }



            }
        });

        return myView;
    }
}