/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Services;

import Domain.Departamento;
import java.util.ArrayList;

/**
 *
 * @author auz83
 */
public class DepartamentosService {
    private ArrayList<Departamento> departamentos = new ArrayList<>();

    public boolean addDepartamento(Departamento d){
        return departamentos.add(d);
    }
    
    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }
    
    public Departamento findDepartamentoPorNombre(String nombreDepartamento){
        for(Departamento d: departamentos)
            if (d.obtenerNombre().equals(nombreDepartamento))
                return d;
        return null;
    }
}
