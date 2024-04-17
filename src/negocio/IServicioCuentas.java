package negocio;

import java.util.List;

public interface IServicioCuentas {

    boolean agregarCuenta(Cuenta cuenta);
    boolean cancelarCuenta(int numero);
    void abonarCuenta(int numero, double cantidad);
    void retirarCuenta(int numero, double cantidad);
    List<Cuenta> obtenerCuentas();
}
