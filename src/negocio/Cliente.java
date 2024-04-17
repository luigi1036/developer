package negocio;

import java.util.ArrayList;
import java.util.List;

public class Cliente implements IServicioCuentas{

    private int num;
    private String nombre;
    private String apellido;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    private int numeroCuenta;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;

    private ArrayList<Cuenta> cuentas;

    private String fechaNacimiento;

    public Cliente(int num, String nombre, String apellido, int numeroCuenta, Domicilio domicilio, String rfc, String telefono, String fechaNacimiento) {
        this.num = num;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCuenta = numeroCuenta;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.cuentas = new ArrayList<>();
    }

    public Cliente(int num, String nombre, String apellido, int numeroCuenta, String calle, String numero, String colonia, String estado, int codigoPostal) {
        this.num = num;
        this.nombre = nombre;
        this.apellido = apellido;
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
                "numero='" + num + '\'' +
                "nombre='" + nombre + '\'' +
                "apellido='" + apellido + '\'' +
                ", numeroCuenta=" + numeroCuenta +
                ", domicilio=" + domicilio +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cuentas=" + cuentas +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }

    @Override
    public boolean agregarCuenta(Cuenta cuenta) {
        this.cuentas.add(cuenta);
        return true;
    }

    @Override
    public boolean cancelarCuenta(int numero) {
        for (Cuenta c: this.cuentas){
            if(c.getNumero() == numero){
                this.cuentas.remove(c);
                return true;
            }
        }
        System.out.println("La cuenta con el # " + numero + " no existe");
        return false;
    }

    @Override
    public void abonarCuenta(int numero, double cantidad) {
        for(Cuenta c: this.cuentas){
            if(c.getNumero() == numero){
                c.abono(cantidad);
                System.out.println("el nuevo saldo de la cuenta es: " + c.getSaldo());
            }
        }

    }

    @Override
    public void retirarCuenta(int numero, double cantidad) throws RuntimeException {
        for(Cuenta c: this.cuentas){
            if(c.getNumero() == numero){
                c.retiro(cantidad);
                System.out.println("el nuevo saldo de la cuenta es: " + c.getSaldo());
            }
        }
    }

    @Override
    public List<Cuenta> obtenerCuentas() {
        return this.cuentas;
    }
}
