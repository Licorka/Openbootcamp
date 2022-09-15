public class Main {
            //Encapsulación
        /*
        CLASE MICLASE
            PRIVADA PROPIEDAD1;
            PRIVADA PROPIEDAD2;

            FUNCION SETTERPROPIEDAD1(TEXTO valor)
                ESTA_CLASE.PROPIEDAD1 = valor

            FUNCION GETTERPROPIEDAD1() TEXTO
                DEVUELVE EL VALOR DE ESTA_CLASE.PROPIEDAD1

            -PROGRAMA PRINCIPAL-
            VAR unaclase INSTANCIA DE MICLASE

            unaclase.PROPIEDAD1 = valor
            IMPRIME unaclase.PROPIEDAD2
         */
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo moto = new Vehiculo();
        vehiculo.setTipo("Coupe");
        vehiculo.setVelocidadMaxima(120);
        vehiculo.setRapido(true);
        moto.setTipo("Scooter");

        System.out.println(vehiculo.getTipo());
        System.out.println(moto.getTipo());
        System.out.println(vehiculo.getVelocidadMaxima());
        System.out.println(vehiculo.isRapido());
    }
}

class Vehiculo {
    private String tipo;
    private int velocidadMaxima;
    private boolean rapido;

    public void setRapido(boolean rapido){
        this.rapido = rapido;
    }

    public boolean isRapido(){
        return  this.rapido;
    }
    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima(){ return this.velocidadMaxima;}
    public void setTipo(String tipo){
        this.tipo   = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }
}
