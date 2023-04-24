package com.example.clase6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.example.clase6.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        if (savedInstanceState == null) {

            Bundle bundle = new Bundle();
            bundle.putString("nombre", "Jex");

            ArrayList<Estudiante> lista = new ArrayList<>();
            lista.add(new Estudiante("Jex", false));
            lista.add(new Estudiante("Niurka", true));
            lista.add(new Estudiante("Carlos", false));
            lista.add(new Estudiante("Angelo", false));
            lista.add(new Estudiante("Diego", false));
            lista.add(new Estudiante("David", false));

            EstudiantesViewModel viewModel = new ViewModelProvider(this).get(EstudiantesViewModel.class);
            viewModel.getListaEstudiantes().setValue(lista);

            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragmentContainerView2, FragmentB.class, bundle)
                    .commit();
        }


        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment fragmentById = getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView2);

                getSupportFragmentManager().beginTransaction()
                        .remove(fragmentById)
                        .commit();


            }
        });
    }
}