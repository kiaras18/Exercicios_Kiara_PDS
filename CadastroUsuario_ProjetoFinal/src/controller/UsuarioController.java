package controller;

import java.util.ArrayList;
import model.Usuario;

public class UsuarioController {

    private ArrayList<Usuario> lista = new ArrayList<>();

    public void adicionar(Usuario usuario) {
        lista.add(usuario);
    }

    public ArrayList<Usuario> listar() {
        return lista;
    }

    public void atualizar(int indice, Usuario usuario) {
        lista.set(indice, usuario);
    }

    public void remover(int indice) {
        lista.remove(indice);
    }
}