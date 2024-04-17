// La clase Zoologico gestiona una lista de animales y define métodos para interactuar con esta lista.
// Esto demuestra el principio de encapsulamiento en la programación orientada a objetos,
// ya que la lista de animales está oculta para el resto del programa
// y sólo puede ser modificada a través de los métodos proporcionados por la clase Zoologico.

import java.util.ArrayList;

public class Zoologico {

    ArrayList<Animal> listaAnimales = new ArrayList<Animal>();

    //Funcion Agregar Animales a la lista
    public void agregarAnimal(Animal animal){
        listaAnimales.add(animal);
    }

    //Mostrar lista Animales
    public void mostrarAnimales(){
        for (Animal animal : listaAnimales){
            System.out.println(" "+animal.toString());
        }
    }

    //Ejecutar acciones animales
    public void ejecutarAccion(){
        for (Animal animal : listaAnimales){
            System.out.println("|" + animal.toString() + "|");

            animal.comer();

            animal.hablar();

            animal.mover();

        }
    }

}
