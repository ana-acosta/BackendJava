package Herencia;

public class Filmtocat extends  Mona{
    private String lentes;

    public Filmtocat(String nombre, String colorOjos, String colorPiel, String colorCabello, int numTentaculos, String estadoAnimo, String lentes) {
        super(nombre, colorOjos, colorPiel, colorCabello, numTentaculos, estadoAnimo);
        this.lentes = lentes;
    }

    public void accion() {
        System.out.println("Hola soy Mona,esta es mi versión Filmtocat");
    }
    public void descripcion(){
        accion();
        System.out.println("Me gusta filmar todo lo que pasa en cualquier momento, mi camara es mi mejor amiga");
    }

    @Override
    public String toString() {
        return  super.toString()+
                "lentes='" + lentes + '\n' +
                '}';
    }
}
