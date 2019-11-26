package br.senac.onRuby.db;

import br.senac.onRuby.ChooseClientView.Client;

public class DaoClient {
    
    public static void inserir(Client client) throws Exception {
        String sql = "INSERT INTO cliente (nome, sobrenome, data_nasc, cpf, rg, celular, enabled) "
                + " VALUES (?, ?, ?, ?, ?, ?)";
    }
}
