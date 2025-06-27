package domain;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTable;

public interface IZooOperations {
    boolean addAnimal(ArrayList<Animal> listado, Animal a);
    void editarAnimal(ArrayList<Animal> listado, Animal animalNuevo);
    void eliminarAnimal(ArrayList<Animal> listado, JTable tabla);
    void obtenerListadoAnimales(ArrayList<Animal> listado, JTable tabla);
    void obtenerListaEspecies(JComboBox<String> combo, ArrayList<Animal> listado);
    void listarPorEspecie(ArrayList<Animal> listado, JTable tabla, String especie);
}