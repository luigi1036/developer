package negocio;

public class CuentaCheque extends Cuenta{

    private double costoManejoMensual;
    public CuentaCheque(int numero, String fechaApertura, double saldo, double costoManejoMensual) {
        super(numero, fechaApertura, saldo);
        this.costoManejoMensual = costoManejoMensual;
    }

    public double getCostoManejoMensual() {
        return costoManejoMensual;
    }

    public void setCostoManejoMensual(double costoManejoMensual) {
        this.costoManejoMensual = costoManejoMensual;
    }

    @Override
    public boolean abono(double cantidad) {
        this.setSaldo(cantidad);
        return true;
    }

    @Override
    public boolean retiro(double cantidad) {
        if(this.getSaldo() < cantidad){
            new RuntimeException("el saldo es insuficiente");
        }else{
            this.setSaldo(this.getSaldo()- cantidad);
        }
        return true;
    }

    @Override
    public String toString() {
        return "cuenta de cheques{" +
                "numero=" + getNumero() +
                ", fechaApertura='" + getFechaApertura() + '\'' +
                ", saldo=" + getSaldo() +
                ", costoManejoMensual=" + costoManejoMensual +
                '}';
    }
}
