

package Class;


import java.util.ArrayList;
import java.util.List;


public class Trabajador {
    protected int codigo;
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected double salarioBasico;
    protected List<Proyecto> proyectos;
    protected Rol rol;

    public Trabajador(int codigo, String nombre, String direccion, String telefono, double salarioBasico, Rol rol) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salarioBasico = salarioBasico;
        this.rol = rol;
        this.proyectos = new ArrayList<>();
    }

    public int obtenerCodigo() {
        return codigo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerDireccion() {
        return direccion;
    }

    public String obtenerTelefono() {
        return telefono;
    }

    public double obtenerSalarioBasico() {
        return salarioBasico;
    }

    public List<Proyecto> obtenerProyectos() {
        return proyectos;
    }

    public Rol obtenerRol() {
        return rol;
    }

    public void asignarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public void desasignarProyecto(Proyecto proyecto) {
        proyectos.remove(proyecto);
    }

    public double obtenerSalario() {
        double salario = salarioBasico;
        for (Proyecto proyecto : proyectos) {
            salario += proyecto.obtenerValorBase();
        }
        return salario;
    }

    public double obtenerCreditos() {
        double creditos = 0.0;
        for (Proyecto proyecto : proyectos) {
            creditos += proyecto.obtenerValorBase() * 0.1;
        }
        return creditos;
    }

    public List<Double> obtenerDescuentos() {
        List<Double> descuentos = new ArrayList<>();
        for (Proyecto proyecto : proyectos) {
            descuentos.add(proyecto.obtenerValorBase() * 0.05);
        }
        return descuentos;
    }

}
