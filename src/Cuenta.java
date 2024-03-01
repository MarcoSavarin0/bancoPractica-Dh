public abstract class Cuenta {
    private Cliente cliente;
   private double saldo;
    public Cuenta (Cliente cliente){
        this.cliente = cliente;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    abstract void depositar(double monto);
    abstract void extraer(double monto);
    abstract double informarSaldo();
}
