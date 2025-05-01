/*
Haz un programa que muestre 
la siguiente matriz de numeros

    2   4  6  8
    10 12 14 16
    18 20 22 24
    26 28 30 32

 */

public class matrices{
    public static void main(String[] args){

        //Creamos una matriz de 4 x 4
        int[][] myMatrix = new int[4][4];

        int i, j, count = 2;

        for(i = 0; i < 4; i++){
            for(j = 0; j < 4; j++){
                myMatrix[i][j] = count;
                count += 2;
            }
        }

        for(i = 0; i < 4; i++){
            System.out.println("\n");
            for(j = 0; j < 4; j++){
                System.out.print(myMatrix[i][j] + "\t");
            }
        }

    }
}
