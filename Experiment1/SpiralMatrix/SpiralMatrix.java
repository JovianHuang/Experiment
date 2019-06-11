package SpiralMatrix;

public class SpiralMatrix extends Matrix{
  public SpiralMatrix(int n) {
    super(n, n);
    spiral();
  }

  private void spiral() {
    int rowMin, rowMax, colMin, colMax;
    rowMin = colMin = 0;
    rowMax = colMax = getRow() - 1; // row equals to column
    int element = 1;
    while (element <= getRow() * getColumn()) {
      for (int j = colMin; j <= colMax; j++) {
        setElement(element++, rowMin, j);
      }
      for (int i = rowMin + 1; i <= rowMax; i++) {
        setElement(element++, i, colMax);
      }
      for (int j = colMax - 1; j >= colMin; j--) {
        setElement(element++, rowMax, j);
      }
      for (int i = rowMax - 1; i > rowMin; i--) {
        setElement(element++, i, colMin);
      }
      rowMin++;
      rowMax--;
      colMin++;
      colMax--;
    }
  }

  public static void main(String[] args) {
    SpiralMatrix matrix = new SpiralMatrix(5);
    matrix.printMatrix();
  }
}
