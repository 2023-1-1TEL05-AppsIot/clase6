package com.example.clase6;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class EstudiantesViewModel extends ViewModel {

    private MutableLiveData<ArrayList<Estudiante>> listaEstudiantes = new MutableLiveData<>();

    public MutableLiveData<ArrayList<Estudiante>> getListaEstudiantes() {
        return listaEstudiantes;
    }

}
