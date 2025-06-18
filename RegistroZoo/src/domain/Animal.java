
package domain;

public class Animal {
    private String id;
    private String nombre;
    private String especie;
    private String dieta;
    private int edad;
    private String habitad;

    public Animal() {
    }

    public Animal(String id, String nombre, String especie, String dieta, int edad, String habitad) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.dieta = dieta;
        this.edad = edad;
        this.habitad = habitad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nombre=" + nombre + ", especie=" + especie + ", dieta=" + dieta + ", edad=" + edad + ", habitad=" + habitad + '}';
    }
    
    
    
}
