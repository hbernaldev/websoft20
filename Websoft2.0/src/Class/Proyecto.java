
package Class;

import Interface.Iproyecto;
import java.util.Date;

public class Proyecto implements Iproyecto {
    private String nombre;
    private String plataforma;
    private String empresaContratante;
    private Date fechaTerminacion;
    private double valorBase;

    public Proyecto(String nombre, String plataforma, String empresaContratante, Date fechaTerminacion, double valorBase) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.empresaContratante = empresaContratante;
        this.fechaTerminacion = fechaTerminacion;
        this.valorBase = valorBase;
    }

    Proyecto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public String obtenerPlataforma() {
        return plataforma;
    }

    @Override
    public String obtenerEmpresaContratante() {
        return empresaContratante;
    }

    @Override
    public Date obtenerFechaTerminacion() {
        return fechaTerminacion;
    }

    @Override
    public double obtenerValorBase() {
        return valorBase;
    } 
}
