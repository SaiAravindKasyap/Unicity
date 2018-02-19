package com.example.applemacbookpro.unicity;

/**
 * Created by applemacbookpro on 08/09/16 AD.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class settings extends Fragment {
    @Override

    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState){
        View View= inflater.inflate(R.layout.settings,container,false);
        return View;
    }



}
