/* Herencia y abstracción: Una clase nos dice que se puede hacer, pero no como

 */

public class Main {

    public static void main(String[] args) {
        //Vehiculo vehiculo = new Vehiculo(); --> una clase abstracta no se puede instanciar
        Coche coche = new Coche();
        coche.setSonido("BRRRR");
        System.out.println(coche.getSonido());

    }
}

abstract class Vehiculo {
    int velocidadMaxima;
    String matricula;
    String sonido;

    public Vehiculo(){
        System.out.println("estoy en el constructor de Vehiculo");
    }

    abstract public String getSonido(); //Una función abstracta no tiene cuerpo ya que no sabemos que va hacer, por eso hay que implementarlas en los hijos para que se sepa que va a poder hacer
    abstract public void setSonido(String sonido);
}

final class Coche extends Vehiculo{ //Va a tener que implementar las funciones ya que son abstractas.
    public String getSonido(){
        return this.sonido;
    }
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
}

class Moto extends Vehiculo{
    public String getSonido(){
        return this.sonido;
    }
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
}
