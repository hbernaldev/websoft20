
package Domain;

import Interface.Irol;

public class Programador extends Trabajador implements Irol{
        private int lineasCodigoPorHora;
    private String plataformaEspecializada;
    private boolean aprobadoDisenoGrafico;

    public Programador(int lineasCodigoPorHora, String plataformaEspecializada, boolean aprobadoDisenoGrafico, int codigo, String nombre, String direccion, String telefono, double salarioBasico, Rol rol) {
        super(codigo, nombre, direccion, telefono, salarioBasico, rol);
        this.lineasCodigoPorHora = lineasCodigoPorHora;
        this.plataformaEspecializada = plataformaEspecializada;
        this.aprobadoDisenoGrafico = aprobadoDisenoGrafico;
    }

    

    public int obtenerLineasCodigoPorHora() {
        return lineasCodigoPorHora;
    }

    public String obtenerPlataformaEspecializada() {
        return plataformaEspecializada;
    }

    public boolean obtenerAprobadoDisenoGrafico() {
        return aprobadoDisenoGrafico;
    }

    public String obtenerNombre() {
        return "Programador";
    }

}
