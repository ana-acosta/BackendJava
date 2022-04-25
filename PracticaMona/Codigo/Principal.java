package Herencia;

public class Principal {

    public static void main(String[] args) {
        showhulatocat ();
        showDefunktocat();
        showFilmtocat();
        showMomtocat();
        showScarletteocat();

        showOriginal();
    }

      public static void showhulatocat(){
          Hulatocat hulatocat = new Hulatocat("Hulatocat","Café Claro","Blanca","Sin cabello",
                  5,"Feliz");
          hulatocat.descripción();
          System.out.println(hulatocat.toString());
      }
      public static  void showDefunktocat(){
        Defunktocat defunktocat = new Defunktocat("Defunktocat","Verdes","Beige","Rubio",
                5,"Serio","Rubia","Rubia");
        defunktocat.descripcion();
        System.out.println(defunktocat.toString());
      }

      public  static void showFilmtocat(){
         Filmtocat filmtocat = new Filmtocat(" Filmtocat","negros","Beige","NA",5
         ,"Concentrado","Si");
          filmtocat.descripcion();
          System.out.println(filmtocat.toString());
      }

      public  static void showMomtocat (){
          Momtocat momtocat = new Momtocat(" Momtocat","Café Claro","Beige","Café Oscuro",
                  5,"Relajada",3);
           momtocat.descripcion();
           System.out.println(momtocat.toString());
      }

      public static void showScarletteocat(){
         Scarletteocat scarletteocat = new Scarletteocat("Scarletteocat","Café claro","Blanca","Rubio",5,
                 "Feliz","Rosa" );
         scarletteocat.accion();
         System.out.println(scarletteocat.toString());
      }
      public static void showOriginal (){
         Original original = new Original(" Original","Café Claro","Beige","Na",5,"Feliz");
         original.accion();
         System.out.println(original.toString());
      }
}
