package eu.chrost.javatraining.day2.exercises.arrays;

/*
* Zadanie 11: Transponowanie macierzy
Utwórz dwuwymiarową tablicę int[3][2] (np. {{1, 2}, {3, 4}, {5, 6}}).
Zamień wiersze na kolumny, tworząc nową tablicę int[2][3].
Wyświetl pierwotną i transponowaną tablicę.
* */
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] rootMatrix = {{1, 2}, {3, 4}, {5, 6}};
        int[][] transposeMatrix = new int[rootMatrix[0].length][rootMatrix.length];
        for (int i = 0; i < rootMatrix.length; i++) {
            for (int j = 0; j < rootMatrix[0].length; j++) {
                transposeMatrix[j][i] = rootMatrix[i][j];
            }
        }
        System.out.println("done");
    }
}
