public class Cliente {
    private String numeroCliente;
    private String apellido;
    private String nombre;
    private String dni;
    private String cuit;

    public Cliente(String apellido, String nombre, String dni, String cuit) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.cuit = cuit;
        this.numeroCliente = dni + cuit;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }
}
