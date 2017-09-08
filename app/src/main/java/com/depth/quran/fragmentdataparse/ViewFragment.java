package com.depth.quran.fragmentdataparse;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by emon on 6/25/2017.
 */

public class ViewFragment extends Fragment {
    TextView name,pass;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.view_layout_fragment, container, false);
        Bundle bundle=getArguments();
        String userName=bundle.getString("name");
        String userPass=bundle.getString("pass");
        name=(TextView)view.findViewById(R.id.username);
        pass=(TextView)view.findViewById(R.id.pass);
        name.setText(userName);
        pass.setText(userPass);
        return view;
    }

}
