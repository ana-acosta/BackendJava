package Herencia;

public class Hulatocat extends Mona{
    private  String habilidad = "ukulele";
    public Hulatocat(String nombre, String colorOjos, String colorPiel, String colorCabello, int numTentaculos, String estadoAnimo) {
        super(nombre, colorOjos, colorPiel, colorCabello, numTentaculos, estadoAnimo);
    }

    @Override
    public void accion() {
        System.out.println("Hola soy Mona,esta es mi versión Hulatocat");
    }

    public  void descripción(){
        accion();
        System.out.println("Me gusta Tocar el"+ habilidad + ", cantar  y bailar");
    }

}
