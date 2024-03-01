//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente nuevo = new Cliente("Savarino","Marco","45266459", "24-45266459-10");
        CajaDeAhorro cuentaNueva = new CajaDeAhorro(nuevo,0.020f);
        cuentaNueva.depositar(500000.00);
        cuentaNueva.cobrarIntereses();
        System.out.println(nuevo.getNumeroCliente());
        System.out.println(cuentaNueva.informarSaldo());
    }
}