package academy.devdojo.maratonajava.introducao;

public class AulaArraysTipos {
    public static void main(String[] args) {

        String[] names = new String[4];
        names[0] = "Sócrates";
        names[1] = "Platão";
        names[2] = "Sartre";



       for (int i = 0; i < names.length; i++){
           System.out.println(names[i]);
       }
    }
}
