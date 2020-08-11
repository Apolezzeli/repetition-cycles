package ar.com.ada.online.second.repetitioncycles;

public class Extra {
    public static void main(String[] args) {
        //Array
        int[] intArray = {1, 4, 6, 10, 100};
        String[] stringArray = {"Maria", "Pedro", "Julia"};

        //Matriz
        int[][] intMatriz = {
                {3, 4, 8, 20}, //F0
                {5, 7, 18, 200}, //F1
                {400, 1, 20, 500} //F2
        };

        String[][] stringMatriz = {
                {"uno", "dos"}, //F0
                {"ocho", "trece"} //F1
        };

        System.out.print("\n");

        //for array
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("intArray [" + i + "] = " + intArray[i]);
        }

        System.out.print("\n");

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("intArray [" + i + "] = " + stringArray[i]);
        }

        System.out.print("\n");

        //for matriz
        for (int i = 0; i < intMatriz.length; i++) {
            for (int j = 0; j < intMatriz[i].length; j++) {
                System.out.println("intMatriz [" + i + "][" + j + "] = " + intMatriz[i][j]);
            }

        }

        System.out.print("\n");

        for (int i = 0; i < stringMatriz.length; i++) {
            for (int j = 0; j < stringMatriz[i].length; j++) {
                System.out.println("intMatriz [" + i + "][" + j + "] = " + stringMatriz[i][j]);
            }

        }

    }
}
