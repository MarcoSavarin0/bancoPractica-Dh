
public class CajaDeAhorro extends Cuenta{
    private float interes;

    public CajaDeAhorro(Cliente cliente, float interes) {
        super(cliente);
        this.interes = interes;
    }

    @Override
    public void depositar(double cantidad) {
        setSaldo(getSaldo() + cantidad);
    }

    @Override
    public void extraer(double monto) {
        if (monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
        } else {
            System.out.println("no tienes suficiente monto!");
        }
    }

    @Override
    public double informarSaldo() {
        return Math.round(getSaldo() * 100.0) / 100.0;
    }

    public void cobrarIntereses(){
        setSaldo(getSaldo() * ( 1 +interes));
    }
}
