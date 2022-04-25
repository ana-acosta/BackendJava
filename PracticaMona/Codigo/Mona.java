package Herencia;

public class Mona {
    private String nombre;
    private String colorOjos;
    private String colorPiel;
    private String colorCabello;
    private int numTentaculos;
    private String estadoAnimo;

    public Mona(String nombre, String colorOjos, String colorPiel, String colorCabello, int numTentaculos, String estadoAnimo) {
        this.nombre = nombre;
        this.colorOjos = colorOjos;
        this.colorPiel = colorPiel;
        this.colorCabello = colorCabello;
        this.numTentaculos = numTentaculos;
        this.estadoAnimo = estadoAnimo;
    }

    public void accion(){
        System.out.println("Hola Soy Mona de Octocat");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public String getColorCabello() {
        return colorCabello;
    }

    public void setColorCabello(String colorCabello) {
        this.colorCabello = colorCabello;
    }

    public int getNumTentaculos() {
        return numTentaculos;
    }

    public void setNumTentaculos(int numTentaculos) {
        this.numTentaculos = numTentaculos;
    }

    public String getEstadoAnimo() {
        return estadoAnimo;
    }

    public void setEstadoAnimo(String estadoAnimo) {
        this.estadoAnimo = estadoAnimo;
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\n' +
                "colorOjos='" + colorOjos + '\n' +
                "colorPiel='" + colorPiel + '\n' +
                "colorCabello='" + colorCabello + '\n' +
                "numTentaculos=" + numTentaculos + '\n'+
                "estadoAnimo='" + estadoAnimo + '\n';
    }
}
