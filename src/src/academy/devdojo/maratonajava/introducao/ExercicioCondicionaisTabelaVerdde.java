package academy.devdojo.maratonajava.introducao;

public class ExercicioCondicionaisTabelaVerdde {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixaImposto = 0.097;
        double segundaFaixaImposto = 0.3735;
        double terceiraFaixaImposto = 0.495;
        double valorImposto;
        if (salarioAnual <= 34712)
        {
            valorImposto = salarioAnual * primeiraFaixaImposto;
        }
        else if (salarioAnual >= 34713 && salarioAnual <= 68507)
        {
            valorImposto = salarioAnual * segundaFaixaImposto;
        }
        else
        {
            valorImposto =  salarioAnual * terceiraFaixaImposto;
        }
        System.out.println(valorImposto);
    }
}
