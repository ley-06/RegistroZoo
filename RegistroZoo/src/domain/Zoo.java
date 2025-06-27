/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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
    public void editarAnimal(ArrayList<Animal> listado, Animal animalNuevo){
        //obtener posicion animal antiguo
        int pos = utils.obtenerPosicionPorId(listado, animalNuevo.getId());
        
        //modificar informacion antigua
        listado.set(pos, animalNuevo);
    }
    
    //eliminar animal
    public void eliminarAnimal(ArrayList<Animal> listado, JTable tabla){
        int fila = tabla.getSelectedRow();
        if(fila >= 0){
            String id = tabla.getValueAt(fila, 0).toString();
            listado.remove(utils.obtenerPosicionPorId(listado, id));
            JOptionPane.showMessageDialog(tabla, "Eliminado correctamente");
        }else{
            JOptionPane.showMessageDialog(tabla, "Animal no seleccionado");
        }    
    }
    
    //listar todos animales
    public void obtenerListadoAnimales(ArrayList<Animal> listado, JTable tabla){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Especie");
        modelo.addColumn("Dieta");
        modelo.addColumn("Edad");
        modelo.addColumn("Habitat");
        
        tabla.setModel(modelo);
        
        String [] data = new String[6];
        
        for (int i = 0; i < listado.size(); i++) {
            data[0] = listado.get(i).getId();
            data[1] = listado.get(i).getNombre();
            data[2] = listado.get(i).getEspecie();
            data[3] = listado.get(i).getDieta();
            data[4] = String.valueOf(listado.get(i).getEdad());
            data[5] = listado.get(i).getHabitad();
            modelo.addRow(data);
        }
        
        tabla.setModel(modelo);
    }
    
    
    //obtener listado especies Jcvombobox, arrayList, Jtable
    public void obtenerListaEspecies(JComboBox combo, ArrayList<Animal> listado){
        ArrayList<String> especies = new ArrayList<>();
        
        if(!listado.isEmpty()){
            for(Animal a: listado){
                if(!especies.contains(a.getEspecie())){
                    especies.add(a.getEspecie());
                }
            }
        }
        if(!especies.isEmpty()){
            DefaultComboBoxModel modelo = new DefaultComboBoxModel(especies.toArray());
            combo.setModel(modelo);
        }
    }
    
    //metodo obtener listado de especies String [] listaEspecies
    
    public void listarPorEspecie(ArrayList<Animal> listado, JTable tabla, String especie){
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Especie");
        modelo.addColumn("Dieta");
        modelo.addColumn("Edad");
        modelo.addColumn("Habitat");
        
        tabla.setModel(modelo);
        
        String [] data = new String[6];
        
        for (int i = 0; i < listado.size(); i++) {
            if(listado.get(i).getEspecie().equals(especie)){
                data[0] = listado.get(i).getId();
                data[1] = listado.get(i).getNombre();
                data[2] = listado.get(i).getEspecie();
                data[3] = listado.get(i).getDieta();
                data[4] = String.valueOf(listado.get(i).getEdad());
                data[5] = listado.get(i).getHabitad();
                modelo.addRow(data);
            }
        }
        
        tabla.setModel(modelo);
    }
}
