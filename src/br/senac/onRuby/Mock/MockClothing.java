package br.senac.onRuby.Mock;

import br.senac.onRuby.ChooseClothingSale.RegisterSaleClothes.DataRegisterClothes;
import java.util.ArrayList;
import java.util.List;

public class MockClothing {
    private static int resultClothes = 0;
    
    private static List<DataRegisterClothes> listClothes = new ArrayList<DataRegisterClothes>();
    
    public static void clothesInsert(DataRegisterClothes dataRegisterClothes) throws Exception {
        dataRegisterClothes.setIdClothes(resultClothes++);
        listClothes.add(dataRegisterClothes);
    }
    
    public static void updateClothes(DataRegisterClothes searchClothes) throws Exception {
        if (searchClothes != null && searchClothes.getIdClothes() != null && !listClothes.isEmpty()) {
            for (DataRegisterClothes clothesLi : listClothes) {
                if (clothesLi != null && clothesLi.getIdClothes() == searchClothes.getIdClothes()) {
                    clothesLi.setCategoryClothes(searchClothes.getCategoryClothes());
                    clothesLi.setNameClothes(searchClothes.getNameClothes());
                    clothesLi.setQuantityClothes(searchClothes.getQuantityClothes());
                    clothesLi.setUnitPrice(searchClothes.getUnitPrice());
                    clothesLi.setSizeClothes(searchClothes.getSizeClothes());
                    clothesLi.setNameProvider(searchClothes.getNameProvider());
                    break;
                }
            }
        }
    }
    
    public static void deleteClothes(Integer idClothes) throws Exception {
        if (idClothes != null && !listClothes.isEmpty()) {
            for (int i = 0; i < listClothes.size(); i++) {
                DataRegisterClothes clienteLi = listClothes.get(i);
                if (clienteLi != null && clienteLi.getIdClothes() == idClothes) {
                    listClothes.remove(i);
                    break;
                }
            }
        }
    }
    
    public static List<DataRegisterClothes> listar() throws Exception {       
        return listClothes;
    }
    
     public static List<DataRegisterClothes> procurar(String value) throws Exception {
        List<DataRegisterClothes> listaResult = new ArrayList<DataRegisterClothes>();
        
        if(value != null && !listClothes.isEmpty()) {
            for(DataRegisterClothes clothesLi : listClothes) {
                if(clothesLi != null && clothesLi.getCategoryClothes() != null && clothesLi.getNameClothes() != null) {
                    if (clothesLi.getNameClothes().contains(value)
                        || clothesLi.getCategoryClothes().contains(value)
                        || clothesLi.getNameProvider().contains(value)) {
                        listaResult.add(clothesLi);
                    }
                }
            }
        }
        
        return listaResult;
    }
}
