 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

import domain.Animal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class UtilsAnimal {
    
    //verificar id en uso
    public boolean idEnUso(ArrayList<Animal> listado, String id){
        for(Animal a: listado){
            if(a.getId().equals(id)){
                JOptionPane.showMessageDialog(null, "ID: " + id + " ya esta en uso");
                return true;
            }
        }
        return false;
    }
    
    //obtener posicion en lista
    public int obtenerPosicionPorId(ArrayList<Animal> listado, String id){
        int posicion = -1;
        
        for(Animal a: listado){
            if(a.getId().equals(id)){
                return listado.indexOf(a);
            }
        }
        return posicion;
    }
    
    //public boolean enLista(ArrayList<Animal> listado, String especie)
}
