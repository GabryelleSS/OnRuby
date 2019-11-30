package br.senac.onRuby.db;

import br.senac.onRuby.ChooseClientView.Client;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DaoClient {
    
    public static void inserir(Client client) throws Exception {
        String sql = "INSERT INTO cliente (nome, sobrenome, data_nasc, cpf, rg, celular, enabled) "
                + " VALUES (?, ?, ?, ?, ?, ?)";
        
        Connection connection = null;
        
        PreparedStatement preparedStatement = null;
        
        connection = ConnectionUtils.getConnection();

        preparedStatement = connection.prepareStatement(sql);
        
        preparedStatement.setString(1, client.getCPF());
        preparedStatement.setString(2, client.getFirstName());
        preparedStatement.setString(3, client.getLastName());
        preparedStatement.setDate(4, Date.valueOf(client.getDateBirth()));
        
        if("Feminino".equals(client.getGender())) {
            preparedStatement.setString(5, "F");
        } 
        else {
            preparedStatement.setString(5, "M");
        }
        
        preparedStatement.setBoolean(6, true);

        preparedStatement.execute();

        preparedStatement.close();

        connection.close();
    }
    
    public static void excluir(Integer id) throws Exception {
        String sql = "UPDATE cliente SET enabled=? WHERE (cliente_id=?)";

        Connection connection = null;
        
        PreparedStatement preparedStatement = null;

        connection = ConnectionUtils.getConnection();
    
    
        preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setBoolean(1, false);
        
        preparedStatement.setInt(2, id);

        preparedStatement.execute();

        preparedStatement.close();

        connection.close();
    }
    
    public static List<Client> listar() throws Exception {

        String sql = "SELECT * FROM cliente WHERE (enabled=?)";

        List<Client> listClient = null;

        Connection connection = null;
        
        PreparedStatement preparedStatement = null;
        
        ResultSet result = null;

        connection = ConnectionUtils.getConnection();
        
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setBoolean(1, true);

        result = preparedStatement.executeQuery();
        
        while(result.next()) {
            
            if(listClient == null) {
                listClient = new ArrayList<Client>();
            }
            
            Client client = new Client();
            client.setIdClient(result.getInt("cliente_id"));
            client.setCPF(result.getString("cpf"));
            client.setFirstName(result.getString("nome"));
            client.setLastName(result.getString("sobrenome"));
            client.setDateBirth(result.getDate("data_nasc").toLocalDate());
            
            String gender = result.getString("genero");

            if("F".equals(gender)) {
                client.setGender("Feminino");
            } 
            else {
                client.setGender("Masculino");
            }
            
            listClient.add(client);

        }
     
        result.close();

        preparedStatement.close();

        connection.close();

        return listClient;
    }
    
    public static List<Client> procurar(String valor) throws Exception {

        String sql = "SELECT * FROM cliente WHERE (nome LIKE ? AND enabled=?)";

        List<Client> listClient = null;
        
        Connection connection = null;
        
        PreparedStatement preparedStatement = null;
        
        ResultSet result = null;

        connection = ConnectionUtils.getConnection();

        preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, "%" + valor + "%");
        preparedStatement.setBoolean(2, true);
        
        result = preparedStatement.executeQuery();
        
        while(result.next()) {

            if(listClient == null) {
                listClient = new ArrayList<Client>();
            }

            Client client = new Client();
            client.setIdClient(result.getInt("cliente_id"));
            client.setCPF(result.getString("cpf"));
            client.setFirstName(result.getString("nome"));
            client.setLastName(result.getString("sobrenome"));
            client.setDateBirth(result.getDate("data_nasc").toLocalDate());
            String gender = result.getString("genero");

            if("F".equals(gender)) {
                client.setGender("Feminino");
            } 
            else {
                client.setGender("Masculino");
            }
            
            listClient.add(client);

        }
        
        result.close();

        preparedStatement.close();

        connection.close();

        return listClient;
    }
    
    public static Client obter(Integer id) throws Exception {
        
        String sql = "SELECT * FROM cliente WHERE (cliente_id=? AND enabled=?)";

        Connection connection = null;
        
        PreparedStatement preparedStatement = null;
        
        ResultSet result = null;
        
        connection = ConnectionUtils.getConnection();
        
        preparedStatement = connection.prepareStatement(sql);
        
        preparedStatement.setInt(1, id);
        preparedStatement.setBoolean(2, true);
        
        result = preparedStatement.executeQuery();

        if(result.next()) {
            Client client = new Client();
            client.setIdClient(result.getInt("client"));
            client.setCPF(result.getString("cpf"));
            client.setFirstName(result.getString("nome"));
            client.setLastName(result.getString("sobrenome"));
            client.setDateBirth(result.getDate("data_nasc").toLocalDate());
            String gender = result.getString("genero");

            if("F".equals(gender)) {
                client.setGender("Feminino");
            } 
            else {
                client.setGender("Masculino");
            }
            
            result.close();
            
            preparedStatement.close();
            
            connection.close();
            
            return client;
        }
        
        result.close();

        preparedStatement.close();
        
        connection.close();

        return null;
    }
}
