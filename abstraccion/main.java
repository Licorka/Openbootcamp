public class Main {

    public static void main(String[] args) {

        /* Abstracción

        CLASE ABSTRACTA VEHICULO
            PRIVADA TIPO;
            PRIVADA SONIDO;

            FUNCION SETTERTIPO(TEXTO valor)
                ESTA_CLASE.TIPO = valor

            FUNCION GETTERTIPO(TEXTO valor)
                DEVULEVE ESTA_CLASE.TIPO;

            FUNCION ABSTRACTA SETTERSONIDO(TEXTO sonido)
                ESTA_CLASE.SONIDO = sonido
            FUNCION ABSTRACTA GETTERSONIDO() TEXTO


            CLASE COCHE
            FUNCION SETTERSONIDO(TEXTO sonido)
            FUNCION GETTERSONIDO() TEXTO

            --PROGRAMA PRINCIPAL --
            VAR unaclase INSTANCIA DE MICLASE

            unaclase.PROPIEDAD1 = valor
            IMPRIME unaclase.PROPIEDAD2

         */
    }
}

abstract class Vehiculo {
    private String tipo;
    private int velocidadMaxima;
    private String sonido;

    abstract public void setSonido(String sonido);
    abstract public String getSonido();


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
