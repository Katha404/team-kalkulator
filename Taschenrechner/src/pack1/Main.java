package pack1;

public class Main {
    public static void main(String[] args) {
        int[][] array1 = {
            {1, 2},
            {3, 4}
        };

        int[][] array2 = {
            {5, 6},
            {7, 8}
        };

        Matrix matrix1 = new Matrix(array1);
        Matrix matrix2 = new Matrix(array2);

       
        Matrix summe = matrix1.matrixAddieren(matrix2);
        summe.ausgeben();
    }
}
		
	


