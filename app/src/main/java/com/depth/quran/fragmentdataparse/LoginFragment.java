package com.depth.quran.fragmentdataparse;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by emon on 6/25/2017.
 */

public class LoginFragment extends Fragment {
    EditText nameEditText,passwordEditText;
    Button submitButton;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.login_layout_fragment, container, false);
        nameEditText=(EditText)view.findViewById(R.id.user_name);
        passwordEditText=(EditText)view.findViewById(R.id.user_pass);
        submitButton=(Button)view.findViewById(R.id.loginButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=nameEditText.getText().toString();
                String userpassword=passwordEditText.getText().toString();
                Bundle bundle=new Bundle();
                bundle.putString("name",username);
                bundle.putString("pass",userpassword);
                FragmentManager fragmentManager=getFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                ViewFragment viewFragment=new ViewFragment();
                viewFragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.framLayout,viewFragment);
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}
