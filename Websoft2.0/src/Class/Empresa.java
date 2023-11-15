
package Class;

import Interface.Iproyecto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Empresa {
    private String nombre;
    private List<Departamento> departamentos;
    private List<Proyecto> proyectos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
        this.proyectos = new ArrayList<>();
    }

    public void crearEmpresa(String nombre){
    
    }
    
    public void adicionarTrabajador(Trabajador trabajador) {
        // Lógica para agregar un trabajador a la empresa
    }

    public void adicionarProyecto(Proyecto proyecto) {
        // Lógica para agregar un proyecto a la empresa
    }

    public Trabajador obtenerTrabajadorMayorSalario() {
        // Lógica para obtener el trabajador con el salario más alto
        return null;
    }

    public double obtenerSalarioTotal() {
        // Lógica para obtener el salario total de todos los trabajadores de la empresa
        return 0.0;
    }

    public void darBajaTrabajador(Trabajador trabajador) {
        // Lógica para dar de baja a un trabajador de la empresa
    }

    public void sustituirTrabajador(Trabajador trabajadorExistente, Trabajador nuevoTrabajador) {
        // Lógica para sustituir un trabajador existente por un nuevo trabajador en la empresa
    }

    public double obtenerSalarioPorRol(String rol) {
        // Lógica para obtener el salario total de los trabajadores con un rol específico
        return 0.0;
    }

    public Proyecto obtenerProyectoMayorAporte() {
        // Lógica para obtener el proyecto con el mayor aporte
        return null;
    }

    public List<String> obtenerListadoJabaAseo() {
        // Lógica para obtener el listado de trabajadores de Jaba Aseo
        return new ArrayList<>();
    }

    public Map<Trabajador, Integer> obtenerAusenciasPorTrabajador() {
        // Lógica para obtener el número de ausencias por trabajador
        return new HashMap<>();
    }

    public List<Trabajador> obtenerTrabajadoresConDescuento(double descuento) {
        // Lógica para obtener la lista de trabajadores con un descuento específico
        return new ArrayList<>();
    } 
    
    public static void main(String[] args){
            Empresa em;
        em = new  Departamento(DFDFDF, nDFDFD, 45);
        System.out.println(em.);
    
    }
}
