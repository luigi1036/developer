package negocio;

import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private int numeroCuenta;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;

    private ArrayList<Cuenta> cuentas;

    private String fechaNacimiento;

    public Cliente(String nombre, int numeroCuenta, Domicilio domicilio, String rfc, String telefono, String fechaNacimiento) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cuentas = new ArrayList<>();
    }

    public Cliente(String nombre, int numeroCuenta, String calle, String numero, String colonia, String estado, int codigoPostal) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.domicilio = new Domicilio(calle, numero, colonia, estado, codigoPostal);
        this.cuentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", numeroCuenta=" + numeroCuenta +
                ", domicilio=" + domicilio +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cuentas=" + cuentas +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}
