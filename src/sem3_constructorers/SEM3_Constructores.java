package sem3_constructorers;

/**
 *
 * @author xstefano
 */
public class SEM3_Constructores {

    /*public static void main(String[] args) {
        
        Persona persona = new Persona();
        Persona juanPersona = new Persona("Juan", 25);
        
        imprimir(persona.getTextoImprimir());
        imprimir(juanPersona.getTextoImprimir());
        /*
        System.out.println("Nombre: " .concat(persona.getNombre()));
        System.out.println("Edad: " .concat(
                String.valueOf(
                        persona.getEdad()
                )));
    }*/
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Manuel", 20, "Finanzas");
        Empleado empleadoCopia = new Empleado(empleado);
        Empleado empleadoOtro = Empleado.copiaEmpleado(empleado);
        
        empleadoCopia.setDepartamento("Ventas");
        empleadoOtro.setDepartamento("Teconología");
        
        imprimir(empleado.getTextoImprimir());
        imprimir(empleadoCopia.getTextoImprimir());
        imprimir(empleadoOtro.getTextoImprimir());
    }
    
    
    public static void imprimir(String texto) {
        System.out.println(texto);
    }
    
    public static String convertirATexto(int entero){
        return String.valueOf(entero);
    }
    
}
