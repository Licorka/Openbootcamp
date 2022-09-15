
/* Herencia: Una clase hereda métodos y propiedades de otra clase (Clase base/principal/Superclase - Hija)
CLASE VEHICULO
    PRIVADA VELOCIDADMAXIMA;
    PRIVADA TIPOGASOLINA;

    FUNCION diHola()
        IMPRIME "Hola"

CLASE COCHE HEREDA DE VEHICULO "Y NO QUIERO QUE PUEDAN HEREDAR DE MI";
        (heredada) VELOCIDADMAXIMA
        (heredada) TIPOGASOLINA
        NUMERO_DE_PUERTAS;
        (heredada) FUNCION diHola()
            IMPRIME "Hola"

    FUNCION SETTERNUMERODEPUERTAS(INT puertas)
        ESTA_CLASE.NUMERO_DE_PUERTAS = puertas

    FUNCION GETTERNUMERODEPUERTAS() INT
        DEVUELVE ESTA_CLASE.NUMERO_DE_PUERTAS

 CLASE COUPE HEREDA DE COCHE;
        (heredada) VELOCIDADMAXIMA
        (heredada) TIPOGASOLINA
        NUMERO_DE_PUERTAS;
        (heredada) FUNCION diHola()
            IMPRIME "Hola"

    (heredada) FUNCION SETTERNUMERODEPUERTAS(INT puertas)
        ESTA_CLASE.NUMERO_DE_PUERTAS = puertas

    (heredada) FUNCION GETTERNUMERODEPUERTAS() INT
        DEVUELVE ESTA_CLASE.NUMERO_DE_PUERTAS

 */

public class Main {

    public static void main(String[] args) {
        Coche coche = new Coche();
        cocheElectrico cocheE = new cocheElectrico();
        coche.velocidadMaxima = 14;
        coche.matricula = "545858JDG";
        cocheE.velocidadMaxima = 16;

        System.out.println(cocheE.compruebaMatricula("XXX"));

    }
}

class Vehiculo {
    int velocidadMaxima;
    String matricula;

    public boolean compruebaMatricula(String matricula){
        if (matricula == "XXX"){
            return true;
        }
            return false;
    }

}

class Coche extends Vehiculo{ //inherit otros lenguajes

}

final class cocheElectrico extends Coche{ //No se puede heredar

}
