package HarryPotter;

public class Main {
    public static void main(String[] args) {
        Personaje harryPotter = new Personaje("Harry James Potter", "Verdes Esmeralda",
                "Negro", "Masculino", "Meztizo", "Dementor", "Ciervo", "Gryffindor", "Lily Evans", "James Potter I", "Potter", "30-08-1999");
            System.out.println(harryPotter.toString());
        Personaje hermioneJeanGranger = new Personaje("Hermione Jean Granger", "Marrone",
                "Castaño", "Femenino", "Hija de muggles", "La profesora McGonagall",
                "Nutria", "Gryffindor", "Sra. Granger", "Sr. Granger", "NA", "19-09-1979");
            System.out.println(hermioneJeanGranger.toString());
        Personaje ronaldWeasley = new Personaje("Ronald Weasley","Azul","Rojo","Maculino",
                "Sangre Pura","Aragog", "terrier jack russe","Gryffindor", "Molly Weasley"
                ,"Arturo Weasley","Weasley","01-03-1980");
            System.out.println(ronaldWeasley.toString());
        Personaje dracoLuciusMalfoy = new Personaje("Draco Lucius Malfoy","Gris claro","Rubio Blanco","Masculino",
                "SangrePura","Señor Voldemort","Ninguno","Slytherin","Narcissa Malfoy", "Lucius Malfoy","Malfoy",
                "05-06-1980");
            System.out.println(dracoLuciusMalfoy.toString());
        Personaje severusSnape = new Personaje("severusSnape","negro","Negro","Masculino","Mestizo",
                "Señor Voldemort","Cierva","Slytherin","Eileen Snape","Tobias Snape","Snape","09-01-196Ma");
    }

}