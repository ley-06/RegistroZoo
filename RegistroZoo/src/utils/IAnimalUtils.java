package utils;

import java.util.ArrayList;
import domain.Animal;

public interface IAnimalUtils {
    boolean idEnUso(ArrayList<Animal> listado, String id);
    int obtenerPosicionPorId(ArrayList<Animal> listado, String id);
}