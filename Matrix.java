package oops;


class Matrix {
    int[][] mat;

    // Constructor to initialize matrix
    Matrix(int[][] mat) {
        this.mat = mat;
    }

    // Method to multiply with another matrix
    Matrix multiply(Matrix other) {
        int r1 = this.mat.length;
        int c1 = this.mat[0].length;
        int c2 = other.mat[0].length;

        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += this.mat[i][k] * other.mat[k][j];
                }
            }
        }

        return new Matrix(result);
    }

    // Method to print matrix
    void print() {
        for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }



    public static void main(String[] args) {
        int[][] a = { {2, 4}, {3, 1} };
        int[][] b = { {1, 2}, {5, 6} };

        Matrix m1 = new Matrix(a);
        Matrix m2 = new Matrix(b);

        Matrix result = m1.multiply(m2);

        System.out.println("Matrix Multiplication Result:");
        result.print();
    }
}

