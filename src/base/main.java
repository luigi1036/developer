package base;

import negocio.Banco;

public class main {
    public static void main(String[] args) {
        Banco bancolombia = new Banco("Bancolombia", "Calle 1", "123", "Colonia 1",
                                    "Estado 1", 12345);

        System.out.println(bancolombia);
    }
}
