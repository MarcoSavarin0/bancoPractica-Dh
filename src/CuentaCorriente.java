import java.util.Date;

public class CuentaCorriente extends Cuenta {
    private double montoDescubierto;

    public CuentaCorriente(Cliente cliente, double montoDescubierto) {
        super(cliente);
        this.montoDescubierto = montoDescubierto;
    }

    @Override
    void depositar(double cantidad) {
        setSaldo(getSaldo() + cantidad);
    }

    @Override
    void extraer(double monto) {
        if (monto <= getSaldo() + montoDescubierto) {
            setSaldo(getSaldo() - monto);
        } else {
            System.out.println("no tienes suficiente monto!");
        }
    }

    @Override
    double informarSaldo() {
        return getSaldo();
    }

     public String efectuarCheque(double monto, String banco, String fecha){

         if(monto <= getSaldo() + montoDescubierto){
            setSaldo(getSaldo() - monto);
            System.out.println("Se efectuo un cheque exitosamente " + "Monto: " + monto + " Banco: " + banco + " Fecha: " + fecha);
            return "ESTADO OK";
        }else {
            System.out.println("no tienes suficiente monto!");
            return "ERROR, FIJESE EL SALDO EN SU CUENTA";
        }
    }



}
