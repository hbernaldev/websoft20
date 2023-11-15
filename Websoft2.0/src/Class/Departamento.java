
package Class;

import Interface.Idepartamento;


public class Departamento implements Idepartamento {
     private String nombre;
    private String especialidad;
    private int cantidadTrabajadores;

    public Departamento(String nombre, String especialidad, int cantidadTrabajadores) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cantidadTrabajadores = cantidadTrabajadores;
    }

    Departamento() {
       
    }

     @Override
    public String obtenerNombre() {
        return nombre;
    }
    @Override
    public String obtenerEspecialidad() {
        return especialidad;
    }
    @Override
    public int obtenerCantidadTrabajadores() {
        return cantidadTrabajadores;
    } 
}
