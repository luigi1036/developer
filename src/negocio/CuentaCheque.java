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
    public String toString() {
        return "cuenta de cheques{" +
                "numero=" + getNumero() +
                ", fechaApertura='" + getFechaApertura() + '\'' +
                ", saldo=" + getSaldo() +
                ", costoManejoMensual=" + costoManejoMensual +
                '}';
    }
}
