package negocio;

public class CuentaAhorros extends Cuenta{

    private double tasaInteres;
    public CuentaAhorros(int numero, String fechaApertura, double saldo, double tasaInteres) {
        super(numero, fechaApertura, saldo);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    @Override
    public String toString() {
        return "cuenta de ahorros{" +
                "numero=" + getNumero() +
                ", fechaApertura='" + getFechaApertura() + '\'' +
                ", saldo=" + getSaldo() +
                ", tasaInteres=" + tasaInteres +
                '}';
    }
}
