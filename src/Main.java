import java.util.LinkedList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
//        int[] numeros = {1,2,3,4,5};
//        int[] numeros2 = new int[5];
//        for (int i = 0; i < numeros2.length; i++) {
//            numeros2[i] = (i*2)+1;
//        }
//        //Soma do array
//        int sum = 0;
//        for (int i = 0; i < numeros2.length; i++) {
//            sum+=numeros2[i];
//        }
//
//        System.out.println("Soma do array: "+sum);
//        //Maior valor do array
//        int max = numeros2[0];
//        for (int i = 0; i < numeros2.length; i++) {
//            if(max<numeros2[i]){
//                max = numeros2[i];
//            }
//        }
//        System.out.println("Maior valor do array: "+max);
//
//        //Inverter o array
//        int[] numeros3 = new int[5];
//        for (int i = 0; i < numeros2.length; i++) {
//            numeros3[i] = numeros2[(numeros2.length-1)-i];
//        }
//        for (int i = 0; i < numeros2.length; i++) {
//            numeros2[i] = numeros3[i];
//        }
//        System.out.println("Array invertido: ");
//        System.out.println(Arrays.toString(numeros2));
//
//        //adiconar um elmento no array
//        System.out.println("Informe o valor a ser inserido: ");
//        int valor = leitura.nextInt();
//
//        int[] auxiliar = new int[6];
//        for (int i = 0; i < auxiliar.length; i++) {
//            if(i<numeros2.length){
//                auxiliar[i] = numeros2[i];
//            }
//            if(i==auxiliar.length-1){
//                auxiliar[i] = valor;
//            }
//        }
//        numeros2 = new int[6];
//        for (int i = 0; i < numeros2.length; i++) {
//            numeros2[i] = auxiliar[i];
//        }
//        System.out.println("Vetor com valor adicionado: "+Arrays.toString(numeros2));
//        //Removendo elemento do Array
//        System.out.println("Informe o valor que deseja remover: ");
//        int valorRemover = leitura.nextInt();
//        for (int i = 0; i < numeros2.length; i++) {
//            if(valorRemover==numeros2[i]){
//                numeros2[i] = 0;
//            }
//        }
//        int[] auxiliarRemocao = new int[5];
//        int j = 0;
//        for (int i = 0; i < numeros2.length; i++) {
//            if(numeros2[i]!=0){
//                auxiliarRemocao[j] = numeros2[i];
//                j++;
//            }
//        }
//        numeros2 = new int[5];
//
//        for (int i = 0; i < numeros2.length; i++) {
//           numeros2[i] = auxiliarRemocao[i];
//        }
//
//        System.out.println("Vetor com elemento removido: "+Arrays.toString(numeros2));
//
//        //Buscar elemento no array
//        System.out.println("Informe o valor a ser buscado: ");
//        int valorBuscado = leitura.nextInt();
//        boolean encontrado = false;
//        for (int i = 0; i < numeros2.length; i++) {
//            if(valorBuscado==numeros2[i]){
//                encontrado = true;
//            }
//        }
//        if(encontrado){
//            System.out.println("Valor encontrado no array");
//        }else{
//            System.out.println("Valor não encontrado");
//        }

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for(int[] row:matrix){
            for(int value : row){
                System.out.println(value);
            }
            System.out.println("--------");
        }

        //soma dos elementos da matriz

        int sum = 0;
        for(int[] row:matrix){
            for(int value : row){
                sum+=value;
            }
            System.out.println("--------");
        }

        //soma da diagonal princiapl
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i==j){
                    somaDiagonalPrincipal +=matrix[i][j];
                }
            }
        }

        System.out.println("Soma diagonal princiapal: "+somaDiagonalPrincipal);

        //soma diagonal secundária
        int somaDiagonalSecunadaria = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix.length-i-1);
                if(j == matrix.length-i-1){
                    somaDiagonalSecunadaria +=matrix[i][j];
                }
            }
        }
        System.out.println("Soma da diagonal secundária: "+somaDiagonalSecunadaria);

        //rotacionar matriz 90 graus
        int n =  matrix.length;
        int[][] rotacionada = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotacionada[j][n-1-i] = matrix[i][j];
            }
        }
        System.out.println("Matriz rotaionada em 90 graus");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(rotacionada[i][j]);
            }
            System.out.println("------");
        }

    }

}