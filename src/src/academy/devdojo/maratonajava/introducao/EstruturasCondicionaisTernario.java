package academy.devdojo.maratonajava.introducao;

import java.lang.ref.SoftReference;

public class EstruturasCondicionaisTernario {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 6000;

        // ( condição ) ? verdadeiro : falso
        String resultado = salario > 5000 ? "Esse mês você pode doar R$500" : "Esse mês você não tem condições de doar R$500";

        System.out.println(resultado);
    }
}
