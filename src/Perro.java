// Las clases Perro, Gato y Pajaro son subclases de Animal.
// Cada una de estas clases sobrescribe los métodos hablar(), mover() y comer().
// Esto es un ejemplo de polimorfismo, ya que aunque los métodos tienen el mismo
// nombre en todas las clases, su comportamiento varía dependiendo de la clase del objeto
// que los invoca.
public class Perro extends Animal{

    @Override
    public void comer() {
        System.out.println("Perro comiendo huesos");
    }

    @Override
    public void mover() {
        System.out.println("Perro corriendo");
    }

    @Override
    public void hablar() {
        System.out.println("Perro ladrando");
    }

    @Override
    public String toString() {
        return "Perro";
    }
}
