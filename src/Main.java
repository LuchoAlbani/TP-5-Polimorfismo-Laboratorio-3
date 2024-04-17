// En el método main, se crean instancias de Perro, Gato y Pajaro y
// se añaden a la lista de animales del Zoologico.
// Luego, se invocan los métodos de la clase Zoologico para mostrar los animales y
// hacer que realicen acciones.
// Aunque las referencias a los animales son de tipo Animal,
// los métodos específicos de cada subclase se invocan gracias al polimorfismo.
public class Main {
    public static void main(String[] args) {

        Zoologico zoologico = new Zoologico();
        Animal animal1 = new Perro();
        Animal animal2 = new Gato();
        Animal animal3 = new Pajaro();

        zoologico.agregarAnimal(animal1);
        zoologico.agregarAnimal(animal2);
        zoologico.agregarAnimal(animal3);

        zoologico.mostrarAnimales();

        zoologico.ejecutarAccion(); //muestra y ejecuta los metodos
    }
}