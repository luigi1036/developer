package negocio;

import java.util.ArrayList;
import java.util.List;

public class Banco implements IServicioClientes{

    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cliente> clientes;

    public Banco(String nombre, String calle, String numero, String colonia, String estado, int codigoPostal) {
        this.nombre = nombre;
        this.domicilio = new Domicilio(calle, numero, colonia, estado, codigoPostal);
        this.clientes = new ArrayList<>();
    }

    public Banco(String nombre, Domicilio domicilio, String rfc, String telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.clientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", rfc='" + rfc + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        return true;
    }

    @Override
    public boolean eliminarCliente(int numero) {
        Cliente cliente = consultarCliente(numero);
        if(cliente != null){
            clientes.remove(cliente);
            return true;
        }
        return false;
    }

    @Override
    public Cliente consultarCliente(int numero) {
        for(Cliente cli: clientes){
            if(cli.getNum() ==numero ){
                return cli;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Cliente> obtenerClientes() {
        return clientes;
    }

    @Override
    public Cliente buscarClientePorRfc(String rfc) {
        for(Cliente cli: clientes){
            if(cli.getRfc() ==rfc ){
                return cli;
            }
        }
        return null;
    }

    @Override
    public void listarClientes() {
        for (Cliente cli: clientes){
            System.out.println("cli = " + cli);
        }
    }
}
