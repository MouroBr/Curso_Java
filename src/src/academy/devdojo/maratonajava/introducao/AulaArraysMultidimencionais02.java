package academy.devdojo.maratonajava.introducao;

public class AulaArraysMultidimencionais02 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[4];

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4}};

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n-----");
            for (int num : arrayBase) {
                System.out.println(num+" ");

            }

        }

      //for (int[] arrayBase: arrayInt) {
       //    for (int num : arrayBase) {
        //        System.out.println(num + " ");
            }

        }


