/*
    Interfaces:
    INTERFACE COCHE
        FUNCION ACELERAR(NUMERO CUANTAVELOCIDAD)
        FUNCION FRENAR(NUMERO CUANTAVELOCIDAD)
 */

public class Main {

    public static void main(String[] args) {

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
