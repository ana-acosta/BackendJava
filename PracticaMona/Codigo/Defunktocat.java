package Herencia;

public class Defunktocat extends Mona {
    private String colorBarba;
    private  String colorBigote;

    public Defunktocat(String nombre, String colorOjos, String colorPiel, String colorCabello, int numTentaculos, String estadoAnimo , String colorBarba,String colorBigote) {
        super(nombre, colorOjos, colorPiel, colorCabello, numTentaculos, estadoAnimo);
        this.colorBarba = colorBarba;
        this.colorBigote = colorBigote;

    }

    @Override
    public void accion() {
        System.out.println("Hola soy Mona,esta es mi versión Defunktocat ");
    }
    public void descripcion(){
        accion();
        System.out.println("Me gusta Tocar la Guitarra eléctrica y vertir de negro tipo rockero");
    }

    @Override
    public String toString() {
        return
                super.toString() +
                "colorBarba='" + colorBarba + '\n' +
                "colorBigote='" + colorBigote + '\n' +

                '}';
    }
}
