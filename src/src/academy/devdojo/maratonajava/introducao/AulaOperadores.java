package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class AulaOperadores {
    public static void main(String args[])
    {
        // + - *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero02 / (double)numero01;
        System.out.println(resultado);

        // %
        int resto = 23 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte" +isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte" +isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte" +isDezIgualVinte);
        System.out.println("isDezIgualQueDez" +isDezIgualDez);
        System.out.println("iisDezDiferenteDez" +isDezDiferenteDez);

        // && (and) || (or)
        int idade = 37;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrete = 200;
        double valorTotalContaPoupanca = 1000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrete > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // =, +=, -=, *=, /=, %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador += 1; // pode usar tbm contador ++(--)

        System.out.println(contador);
    }
}