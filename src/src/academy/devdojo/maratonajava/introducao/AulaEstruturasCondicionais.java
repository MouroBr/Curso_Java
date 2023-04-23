package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class AulaEstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 20;
        boolean isAutorizado = idade >= 18;

        if (isAutorizado) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não autorizado a comprar bebida alcólica.");}

        if (!isAutorizado) {
            System.out.println("Não autorizado a comprar bebida alcólica.");
        }
    }
}