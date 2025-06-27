package test;

import domain.Animal;
import domain.Zoo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.UtilsAnimal;
/**
 *
 * @author Leydi
 */
public class ZooTest {
  private Zoo zoo;
  private ArrayList<Animal> animalList;
  private JTable table;
  
  @Before
  public void setUP(){
    zoo = new Zoo();
    animalList = new ArrayList<>();
    table = new JTable();
  }
  
  @Test
  public void testAddAnimal(){
    Animal animal = new Animal ("09A", "Tigre", "Felino","Carnivoro",2, "Selva");
     
    zoo = new Zoo(){
        @Override
        public boolean addAnimal(ArrayList <Animal>listado,Animal a){
          return listado.add(a);
        }
    };
    
    boolean resultado = zoo.addAnimal(animalList, animal);
    
    assertTrue(resultado);
    assertEquals(1, animalList.size());
     
  }
  
  @Test
  public void testAddAnimalIdDuplicado(){
    Animal animal1 = new Animal ("09A", "Tigre", "Felino", "Carnívoro", 2, "Selva");
    Animal animal2 = new Animal ("09A", "León", "felino", "Carnívoro", 4, "Sabana");
    animalList.add(animal1);
    
    zoo = new Zoo(){
        @Override
        public boolean addAnimal(ArrayList <Animal>listado,Animal a){
           return false;
        }
    };
    
    boolean resultado = zoo.addAnimal(animalList, animal2);
    
    assertFalse(resultado);
    assertEquals(1, animalList.size());
  }
  
  @Test
  public void testEliminarAnimal(){
    Animal animal = new Animal ("09A", "Tigre", "Felino", "Carnívoro", 2, "Selva");
    animalList.add(animal);
      
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("ID");
    model.addRow(new Object[]{"09A"});
    table.setModel(model);
    table.setRowSelectionInterval(0, 0);
      
    zoo.eliminarAnimal(animalList, table);
      
    assertTrue(animalList.isEmpty());
    }
  }
  
  