package sem3_constructorers;

/**
 *
 * @author iDonk
 */
public class Empleado {

    private String nombre;
    private int edad;
    private String departamento;

    public Empleado(
            String nombre,
            int edad,
            String departamento) {

        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
        
    }

    public Empleado(Empleado empleadoOld) {

        this.nombre = empleadoOld.nombre;
        this.edad = empleadoOld.edad;
        this.departamento = empleadoOld.departamento;

    }
    
    public static Empleado copiaEmpleado(Empleado empleadoOld) {
        return new Empleado(
                empleadoOld.getNombre(),
                empleadoOld.getEdad(),
                empleadoOld.getDepartamento()
        );
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
        public String getTextoImprimir() {
        return "Nombre: " 
                + this.nombre 
                + "\nEdad: " 
                + this.edad
                + "\nDeparamento: "
                + this.departamento
                + "\n------------";
    }
    
    public String getEdadComoTexto(){
        String edadTexto =  SEM3_Constructores
                                .convertirATexto(edad);
        return edadTexto;
    }

}
