package negocio;

import java.util.ArrayList;
import java.util.List;

public interface IServicioClientes {

    boolean agregarCliente(Cliente cliente);
    boolean eliminarCliente(int numero);
    Cliente consultarCliente(int numero);
    ArrayList<Cliente> obtenerClientes();
    Cliente buscarClientePorRfc(String rfc);
    void listarClientes();
}
