
package Class;

import Interface.Irol;



public class Analista extends Trabajador implements Irol{
     private String titulo;
    private String universidad;
    private int añoGraduacion;
    private String metodologia;
    private int clasesDiseñadasPorDia;

    public Analista(String titulo, String universidad, int añoGraduacion, String metodologia, int clasesDiseñadasPorDia, int codigo, String nombre, String direccion, String telefono, double salarioBasico, Rol rol) {
        super(codigo, nombre, direccion, telefono, salarioBasico, rol);
        this.titulo = titulo;
        this.universidad = universidad;
        this.añoGraduacion = añoGraduacion;
        this.metodologia = metodologia;
        this.clasesDiseñadasPorDia = clasesDiseñadasPorDia;
    }

    

    public String obtenerTitulo() {
        return titulo;
    }

    public String obtenerUniversidad() {
        return universidad;
    }

    public int obtenerAñoGraduacion() {
        return añoGraduacion;
    }

    public String obtenerMetodologia() {
        return metodologia;
    }

    public int obtenerClasesDiseñadasPorDia() {
        return clasesDiseñadasPorDia;
    }

    public String obtenerNombre() {
        return "Analista";
    }

}
