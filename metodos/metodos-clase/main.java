/* MÉTODOS DE CLASE:
    CLASE A
        PROPIEDAD 1
        PROPIEDAD 2

        ÁMBITO: PUBLICO(FUERA DE LA CLASE) PRIVADO(SOLO DENTRO DE LA CLASE)
        [VISIBILIDAD][NOMBRE_METODO] ([PARAMETROS]) [VALOR]
        PUBLICA leerLibros(TEXTO libro) TEXTO contenido


 */

public class Main {

    public static void main(String[] args){
        Coche coche = new Coche();
        coche.Acelerar(50);
        var resultado = suma(2, 6);
        System.out.println(resultado);
    }

    public static int suma(int operandoA, int operandoB){
        return  operandoA + operandoB;
    }
}

interface Vehiculo{

    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);
}

class Coche implements Vehiculo {
    public void Acelerar(int cuantaVelocidad){

    }
    public void Frenar(int cuantaVelocidad){

    }
}
