

package Interface;

import Class.Proyecto;
import Class.Trabajador;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public interface Iempresa {
  
    public void crearEmpresa(String nombre);

    public void adicionarTrabajador(Trabajador trabajador);
  
    public void adicionarProyecto(Proyecto proyecto); 
  
    public Trabajador obtenerTrabajadorMayorSalario(); 
   
    public double obtenerSalarioTotal() ;
    
    public void darBajaTrabajador(Trabajador trabajador) ;
    
    public void sustituirTrabajador(Trabajador trabajadorExistente, Trabajador nuevoTrabajador);
     
    public double obtenerSalarioPorRol(String rol);
   
    public Proyecto obtenerProyectoMayorAporte();
     
    public List<String> obtenerListadoJabaAseo();
     
    public Map<Trabajador, Integer> obtenerAusenciasPorTrabajador();
    
    public List<Trabajador> obtenerTrabajadoresConDescuento(double descuento);
    
}
