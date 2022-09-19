/* Herencia:
    Múltiple: Hereda de dos clases distintas (Java no es compatible)
    Jerárquica:
        CLASE A
            CLASE B HEREDA DE A
                CLASE UNO HEREDA DE B
                CLASE DOS HEREDA DE B
            CLASE C HEREDA DE A
                CLASE PERRO HEREDA DE C
                CLASE GATO HEREDA DE C
            CLASE D HEREDA DE A
                CLASE COCHE HEREDA DE D
                CLASE MOTO HEREDA DE D
    Híbrida:
        CLASE A
            CLASE B HEREDA DE A
            CLASE C HEREDA DE A
                CLASE D HEREDA DE B Y C
        

 */

public class Main {

    public static void main(String[] args) {

    }
}

class Vehiculo {
    int velocidadMaxima;
    String matricula;
    public Vehiculo(){
        System.out.println("estoy en el constructor de Vehiculo");
    }

}

class Motor {
    String tipoMotor;
    public Motor(){
        System.out.println("Estoy en el constructor de Motor");
    }

}

class Coche Vehiculo, Motor{

}
