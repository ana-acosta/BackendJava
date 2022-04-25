package Herencia;

public class Scarletteocat  extends Mona {
    private String colorFavorito;

    public Scarletteocat(String nombre, String colorOjos, String colorPiel, String colorCabello, int numTentaculos, String estadoAnimo, String colorFavorito) {
        super(nombre, colorOjos, colorPiel, colorCabello, numTentaculos, estadoAnimo);
        this.colorFavorito = colorFavorito;
    }
    public void accion() {
        System.out.println("Hola soy Mona,esta es mi versión Scarletteocat ");
    }

    @Override
    public String toString() {
        return super.toString() +
                "colorFavorito='" + colorFavorito + '\'' +
                '}';
    }
}

