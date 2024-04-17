package base;

import negocio.Banco;
import negocio.Cliente;
import negocio.Cuenta;
import negocio.CuentaAhorros;

public class main {
    public static void main(String[] args) {

        Banco bancolombia = new Banco("Bancolombia", "Calle 1", "123", "Colonia 1",
                                    "Estado 1", 12345);

        System.out.println(bancolombia);

        Cliente cliente1 = new Cliente(27, "Luis", "serna", 280833, "calle", "42c",
                "Sabaneta", "Antioquia", 5000);
        Cliente cliente2 = new Cliente(37, "Melisa", "bernal", 27833, "carrera", "92a",
                "Medellin", "Antioquia", 5000);
        Cliente cliente3 = new Cliente(31, "Samuel", "Mejia", 87965, "calle", "89d",
                "Medellin", "Antioquia", 5000);


        Cuenta cuenta = new CuentaAhorros(25896, "01/26/2023", 0.0, 5.2);
        Cuenta cuenta1 = new CuentaAhorros(96352, "06/20/2024", 100.0, 7.2);
        Cuenta cuenta2 = new CuentaAhorros(47125, "12/07/2022", 50.0, 4.2);
        Cuenta cuenta3 = new CuentaAhorros(85241, "03/01/2021", 25.0, 3.2);

        cliente1.agregarCuenta(cuenta1);
        cliente1.agregarCuenta(cuenta2);
        cliente2.agregarCuenta(cuenta);
        cliente3.agregarCuenta(cuenta3);


        bancolombia.agregarCliente(cliente1);
        bancolombia.agregarCliente(cliente2);
        bancolombia.agregarCliente(cliente3);

        cliente1.abonarCuenta(96352, 2500.0);
        cliente3.retirarCuenta(85241, 55.0);

        bancolombia.listarClientes();
    }


}
