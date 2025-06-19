/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.util.ArrayList;
import javax.swing.JList;
import javax.swing.JOptionPane;
import utils.UtilsAnimal;

/**
 *
 * @author PC
 */
public class Zoo {
    
    //instancias
    UtilsAnimal utils = new UtilsAnimal();
    
    
    //------------metodos--------------------
    
    //agregar nuevo animal
    public boolean addAnimal(ArrayList<Animal> listado, Animal a){
        
        if(listado.isEmpty() || !utils.idEnUso(listado, a.getId())){
            listado.add(a);
            JOptionPane.showMessageDialog(null, "Animal agregado correctamente");
            return true;
        }
        JOptionPane.showMessageDialog(null, "Error al agregar al animal");
        return false;
    }
    
    //editar info animal
    
    //eliminar animal
    public Animal eliminarAnimal(ArrayList<Animal> listado, String id){
        listado.remove(utils.obtenerPosicionPorId(listado, id));
         return null;
    }
    
    //listar animales por especie
    
    //obtener lista de especies
//    public [] String obtenerListadoEspecies(ArrayList<Animal> listado){
//    
//        [] String listaEspecies = newString
//    }
    //listar todos animales
    public void obtenerListadoAnimales(ArrayList<Animal> listado, JList lista){
        
        Animal [] listData = new Animal[listado.size()];
        for (int i = 0; i < listado.size(); i++) {
            listData[i] = listado.get(i);
            
        }
        lista.setListData(listData);
    }
}
