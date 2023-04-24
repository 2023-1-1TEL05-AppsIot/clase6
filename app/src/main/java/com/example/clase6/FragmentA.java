package com.example.clase6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.clase6.databinding.FragmentABinding;

public class FragmentA extends Fragment {

    FragmentABinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentABinding.inflate(inflater,container,false);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("msg-test","btn del fragmento presioando");
            }
        });


        return binding.getRoot();
    }
}