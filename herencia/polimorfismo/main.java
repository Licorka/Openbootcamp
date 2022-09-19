/*
    Polimorfismo: Las clases hijas implementan la misma función pero hacen cosas diferentes
    Existe a nivel de clase y función (Muchas funciones en la misma clase que haga cosas diferentes
 */

public class Main {

    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.diHola();

        coche.sumaNumeros(4,5);
        coche.sumaNumeros((float)5, (float)4);
        coche.sumaNumeros(4.5, 5.5);

    }
}

class Vehiculo {
    public void diHola(){
        System.out.println("Hola");
    }

}

class Coche extends Vehiculo{
    public void diHola(){
        System.out.println("Soy un coche");
    }

    public int sumaNumeros(int a, int b){
        System.out.println("Soy el sumaNumeros de INT");
        return a + b;
    }
    public float sumaNumeros(float a, float b){
        System.out.println("Soy el sumaNumeros de FLOAT");
        return a + b * (float)9.0;


    }
    public void sumaNumeros(double a, double b){
        System.out.println("Soy el sumaNumeros de DOUBLE");
        System.out.println("El resultado es: " + (a + b));
    }
}
