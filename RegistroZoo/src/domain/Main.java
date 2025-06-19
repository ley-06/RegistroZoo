
package domain;

import views.Home;

public class Main {
    public static void main (String[]args){
        Home home = new Home();
        home.setVisible(true);
        
        
        Zoo z = new Zoo();
    
        Animal a1 = new Animal("1", "animal 1", "especie 1", "dieta 1", 1, "habitad 1");
        Animal a2 = new Animal("2", "animal 2", "especie 2", "dieta 1", 2, "habitad 2");
        
        z.addAnimal(home.listadoAnimales, a1);
        z.addAnimal(home.listadoAnimales, a2);
        
        
    }
}
