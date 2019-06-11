package SpiralMatrix;

public class Matrix {
  private int row;
  private int column;
  private int[][] matrix;

  public Matrix(int row, int column) {
    this.row = row;
    this.column = column;
    this.matrix = new int[row][column];
  }

  public void setElement(int element, int row, int column) {
    this.matrix[row][column] = element;
  }

  public int getRow() {
    return row;
  }

  public int getColumn() {
    return column;
  }

  public void printMatrix() {
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.printf("%5d", matrix[i][j]);
      }
      System.out.println();
    }
    System.out.println();
  }
}
