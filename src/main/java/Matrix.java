import java.util.ArrayList;

public class Matrix {

    public Matrix() {
    }

    public static int countNumbersDivisibleBySeven(int[][] matrix) {
        int p = 0;
        ArrayList<Integer> all = new ArrayList<>();
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                all.add(anInt);
            }
        }
        for (int i = 0; i < all.size(); i++) {
            if ((all.get(i) % 7) == 0)
                p += 1;
        }

        return p;
    }

    public static ArrayList<Integer> columnsWithMax(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int maxNumber = 0;
        Integer resultOfMax = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] >= maxNumber) {
                    maxNumber = matrix[i][j];
                    resultOfMax = j;
                }
            }
        }
        result.add(resultOfMax);
        return result;
    }
}