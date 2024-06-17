package repositorio;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Usuario;

public class Repositorio {
    public static List<Usuario> usuarios = new ArrayList<>();
    public static List<Cliente> clientes = new ArrayList<>();
    
    public static void init() {
        clientes.add(new Cliente("Joao"));
        clientes.add(new Cliente("Maria"));
    }
}

