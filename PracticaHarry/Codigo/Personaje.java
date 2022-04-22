package HarryPotter;

import java.util.Date;

public class Personaje {
    private String nombre, colorOjos, colorPelo, sexo ,EstSangre, boggart, patronus, casa, madre,padre,familia;
    private String fechaNacimiento;

    public Personaje(String nombre, String colorOjos, String colorPelo, String sexo, String estSangre, String boggart, String patronus, String casa,
                     String madre, String padre, String familia, String fechaNacimiento) {
        this.nombre = nombre;
        this.colorOjos = colorOjos;
        this.colorPelo = colorPelo;
        this.sexo = sexo;
        EstSangre = estSangre;
        this.boggart = boggart;
        this.patronus = patronus;
        this.casa = casa;
        this.madre = madre;
        this.padre = padre;
        this.familia = familia;
        this.fechaNacimiento = fechaNacimiento;
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

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstSangre() {
        return EstSangre;
    }

    public void setEstSangre(String estSangre) {
        EstSangre = estSangre;
    }

    public String getBoggart() {
        return boggart;
    }

    public void setBoggart(String boggart) {
        this.boggart = boggart;
    }

    public String getPatronus() {
        return patronus;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public String getMadre() {
        return madre;
    }

    public void setMadre(String madre) {
        this.madre = madre;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + "\n" +
                "colorOjos='" + colorOjos + "\n" +
                "colorPelo='" + colorPelo + "\n" +
                "sexo='" + sexo + "\n" +
                "EstSangre='" + EstSangre + "\n" +
                "boggart='" + boggart + "\n" +
                "patronus='" + patronus + "\n" +
                "casa='" + casa + "\n" +
                "madre='" + madre + "\n" +
                "padre='" + padre + "\n" +
                "familia='" + familia + "\n" +
                "fechaNacimiento='" + fechaNacimiento + "\n" +
                '}';
    }
}
