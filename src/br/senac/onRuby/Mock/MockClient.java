package br.senac.onRuby.Mock;

import br.senac.onRuby.ChooseClientView.Client;

import java.util.ArrayList;
import java.util.List;

public class MockClient {
    private static int scoreClient = 0;
    
    private static List<Client> listClient = new ArrayList<Client>();
    
    public static void insertClient(Client client) throws Exception {
        client.setIdClient(scoreClient++);
        listClient.add(client);
    }
    
    public static void update(Client clientSearch) throws Exception {
        if (clientSearch != null && clientSearch.getIdClient() != null && !listClient.isEmpty()) {
            for (Client clienteLi : listClient) {
                if (clienteLi != null && clienteLi.getIdClient() == clientSearch.getIdClient()) {
                    clienteLi.setFirstName(clientSearch.getFirstName());
                    clienteLi.setLastName(clientSearch.getLastName());
                    break;
                }
            }
        }
    }
    
    public static void delete(Integer id) throws Exception {
        if (id != null && !listClient.isEmpty()) {
            for (int i = 0; i < listClient.size(); i++) {
                Client clienteLi = listClient.get(i);
                if (clienteLi != null && clienteLi.getIdClient() == id) {
                    listClient.remove(i);
                    break;
                }
            }
        }
    }
    
    public static List<Client> list() throws Exception {  
        return listClient;
    }
    
    public static List<Client> search(String value) throws Exception {
        List<Client> listResult = new ArrayList<Client>();
        
        if (value != null && !listClient.isEmpty()) {
            for (Client clienteLi : listClient) {
                if (clienteLi != null && clienteLi.getFirstName() != null &&
                    clienteLi.getLastName() != null) {
                    if (clienteLi.getFirstName().contains(value) || clienteLi.getLastName().contains(value)) {
                        listResult.add(clienteLi);
                    }
                }
            }
        }
        
        return listResult;
    }
    
    public static Client obter(Integer id) throws Exception {
        if (id != null && !listClient.isEmpty()) {
            for (int i = 0; i < listClient.size(); i++) {
                if (listClient.get(i) != null && listClient.get(i).getIdClient() == id) {
                    return listClient.get(i);
                }                
            }
        }
        return null;
    }
    
}
