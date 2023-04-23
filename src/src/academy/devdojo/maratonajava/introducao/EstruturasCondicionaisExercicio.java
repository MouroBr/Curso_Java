package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionaisExercicio {
    public static void main(String[] args) {

        int age = 17;
        String category;

        if (age < 15){
            category = "Categoria Infantil";
        }else if (age >= 15 && age < 18){
            category = "Categoria Juvenil";
        }else{
            category = "Categoria Adulto";
        }
        System.out.println(category);
    }
}
