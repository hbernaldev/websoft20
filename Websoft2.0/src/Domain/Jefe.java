

package Domain;

import Interface.Irol;

public class Jefe  extends Trabajador implements Irol{
    private int añosExperiencia;
    private int proyectosDirigidos;

    public Jefe(int añosExperiencia, int proyectosDirigidos, int codigo, String nombre, String direccion, String telefono, double salarioBasico, Rol rol) {
        super(codigo, nombre, direccion, telefono, salarioBasico, rol);
        this.añosExperiencia = añosExperiencia;
        this.proyectosDirigidos = proyectosDirigidos;
    }

    public int obtenerAñosExperiencia() {
        return añosExperiencia;
    }

    public int obtenerProyectosDirigidos() {
        return proyectosDirigidos;
    }

    public String obtenerNombre() {
        return "Jefe";
    }

}
