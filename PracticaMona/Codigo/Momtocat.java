package Herencia;

public class Momtocat  extends Mona{
    private  int numHijos ;

    public Momtocat(String nombre, String colorOjos, String colorPiel, String colorCabello, int numTentaculos, String estadoAnimo , int numHijos) {
        super(nombre, colorOjos, colorPiel, colorCabello, numTentaculos, estadoAnimo);
        this.numHijos = numHijos;
    }

    public void accion() {
        System.out.println("Hola soy Mona,esta es mi versión Momtocat");
    }
    public  void descripcion(){
        accion();
        System.out.println(" Tengo"+  numHijos + "hijas y trabajo desde mi casa");
    }
}
