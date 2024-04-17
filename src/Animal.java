/*
 La clase Animal es la clase base en este programa.
Define tres métodos: hablar(), mover() y comer().
 Estos métodos representan acciones que cualquier animal podría realizar,
 pero no especifican cómo se realizan estas acciones.
 */
public class Animal {

    public void hablar(){
        System.out.println("Animal hablando");
    }

    public void mover(){
        System.out.println("Animal moviendose");
    }


    public void comer(){
        System.out.println("Animal cominedo");
    }

    public String toString(){
        return "Animal";
    }

}
