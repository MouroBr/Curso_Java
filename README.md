# Curso_Java

**Aula 01 - 08**

Instalação do JDK e javac 

configuração do ambiente de trabalho 

utilizando o javac pelo CMD

criação da primeira classe 

**Aula 09**

Como adicionar comentários em Java

// -> cria um comentário em linha

/* */ -> cria um comentário em múltiplas linhas

/** -> cria um comentário em javadoc



**Aula 10**

Tipos primitivos e convenção de código e declaração de variáveis

* int, dooble, float, char, byte, short, long, boolean

* forma de nomenclatura :

   para classes primeira letra maiúscula

   para métodos e variáveis primeira letra da primeira palavra minúscula e as demais maiúscula [para nomes compostos] ; bananaPreta

**Aula 15**

Operadores Aritméticos (soma, subtração, multiplicação e divisão)

ter cuidado com o operador 2 se ele for posto após uma string ele faz uma concatenação dos valores e se for posto antes da string ele vai funcionar como soma.

O resultado da operação entre 2 números inteiros é um outro numero inteiro(ficar atendo a isso)



**Aula 16**

Operadores relacionais (< >, <= >=, == !=)



**Aula 17 - 18**

Operadores Lógicos 

* && semelhante ao **and** do python utilizado para conjunção entre  condições 
* || representa o operador **or** utilizado para confirmar se pelo menos 1 das condições são validas 

**Aula 19**

Operadores de Atribuição ( =, +=, -=, *=, /=, %=)

utilizados para abreviar códigos



**Aula 20 - 22**

Estruturas condicionais (if, else ) 

o else sempre deve estar ligado a um if.

* todas as variáveis que estão dentro de métodos, tem um escopo local e todas elas devem ser inicializadas antes de serem executadas;



* Operador Ternário : criado para simplificar condições if, else, usado quando necessário para fazer associação diretamente a uma variável;"Pode-se usar um operador ternário dentro de outro operador ternário".(não recomendado).

 

**Aula 23**

Tabela da verdade

* o operador && apenas true se todas as condições forem verdadeiras;
* Operador || só é false se todas as condições forem falsas;



**Aula 24**

Exercício condicionais 02

Qual o valor do imposto que devo pagar baseado na faixa salarial. 



**Aula 25**

*  Switch Stateman : a estrutura Switch é uma construção de controle de fluxo que permite testar o valor de uma expressão e executar um bloco de código correspondente a um dos casos possíveis. (utilizado apenas paras as variáveis: char, int, byte, short, enum e String)

**Aula 26 **

Exercicio estrutura Switch

**Aula 27 - 30**

Estruturas de repetição ( while, do while e fo):

* **while**: Assim como o if o valor de verificação(condição) do laço while tem que ser um valor booleano e será executado quando for **True**;

* **do while**: ele irá executar o laço pelo menos 1 unica vez independento se o valor booleano for **False**;

* **for**: composto por 3 instruções:

  1. *Inicialização*: instrução que é executada uma vez no inicio do loop. Geralmente, é usada para definir um contador ou variável de controle que será usada para controlar o loop.

  2. *condição*: é a condição que é verificada a cada iteração do loop. Se a condição for verdadeira, as instruções dentro do loop serão executadas. Se a condição for falsa, o loop terminará e o controle será transferido para a instrução após o loop.

  3. *atualização*: é a instrução que é executada no final de cada iteração do loop. Geralmente, é usada para incrementar ou decrementar o contador ou variável de controle.

     Dentro do corpo do "for", você pode colocar qualquer instrução ou bloco de código que desejar. Isso pode incluir instruções condicionais, chamadas de métodos e outras estruturas de controle de fluxo, como "if" ou "switch".

​				

​			**exercício:**

​				Fazer um código que imprima todos os números pares de 0 até 1.000.000.





* **break**: usado para sair de um loop(*laço*) ou de um switch(*seleção múltipla*).

    Dentro de um loop(por exemplo, um "*for*" ou um "*while*" ), o "break" é usado para interromper a execução do loop antes que a condição de termino seja alcançada. Isso é util quando uma determinada condição é encontrada e não há necessidade de continuar a execução do loop.

    O break deve sempre estar dentro de um "*if*", "*for*",, "*while*"; 									

​		**exercício:**

​			Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.

​			imprima todos os valores









​		



