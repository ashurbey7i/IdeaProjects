package lesson14.task7;

import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class OMatrix<T extends Number>{
  private T[][] matrix;
  private int rowsQ;
  private int colQ;

    public OMatrix(T[][] matrix) {
        this.matrix = matrix;
        this.rowsQ = matrix.length;
        this.colQ = matrix[0].length;
    }

    public OMatrix add(OMatrix a) {
        if (rowsQ != a.getRowsQ() || colQ != a.getColQ()) return null;
        Double[][] m = new Double[rowsQ][colQ];
        for (int i = 0; i < rowsQ; i++) {
            for (int j = 0; j < colQ; j++) {
                m[i][j] = matrix[i][j].doubleValue() + a.getMatrix()[i][j].doubleValue();
            }
        }
        return new OMatrix(m);
    }

    public OMatrix sub(OMatrix a) {
        return this.add(a.multiply(-1));
    }

    public <T extends Number> OMatrix multiply(T a) {
        Double[][] m = new Double[rowsQ][colQ];
        for (int i = 0; i < rowsQ; i++) {
            for (int j = 0; j < colQ; j++) {
                m[i][j] = a.doubleValue() * matrix[i][j].doubleValue();
            }
        }
        return new OMatrix(m);
    }

    public <T extends Number> OMatrix divide(T a) {
        return this.multiply(1 / a.doubleValue());
    }

    public OMatrix multiply(OMatrix a) {
        if (this.getColQ() != a.getRowsQ()) return null;
        Double[][] m = new Double[rowsQ][a.getColQ()];
        for (int i = 0; i < rowsQ; i++) {
            for (int j = 0; j < a.getColQ(); j++) {
                m[i][j] = 0.0;
            }
        }
        for (int i = 0; i < rowsQ; i++) {
            for (int j = 0; j < a.getColQ(); j++) {
                for (int k = 0; k < colQ; k++) {
                    m[i][j] += matrix[i][k].doubleValue() * a.getMatrix()[k][j].doubleValue();
                }
            }
        }
        return new OMatrix(m);
    }

    public int getRowsQ() {
        return rowsQ;
    }

    public int getColQ() {
        return colQ;
    }

    public T[][] getMatrix() {
        return matrix;
    }

    private NumberFormat getNumberFormat(Locale locale) {
        NumberFormat nf = NumberFormat.getInstance(locale);
        nf.setMinimumFractionDigits(3);
        nf.setMaximumFractionDigits(3);
        return nf;
    }

    public void toFile(FileWriter fw, String matrixName) throws IOException {
        NumberFormat nf = getNumberFormat(Locale.ROOT);
        fw.write("Matrix " + matrixName + ":\n");
        for (int i = 0; i < rowsQ; i++) {
            for (int j = 0; j < colQ; j++) {
                fw.write(nf.format(matrix[i][j]) + "\t");
            }
            fw.write("\n");
        }
        fw.write("\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OMatrix)) return false;

        OMatrix<?> oMatrix = (OMatrix<?>) o;

        if (rowsQ != oMatrix.rowsQ) return false;
        if (colQ != oMatrix.colQ) return false;
        return Arrays.deepEquals(matrix, oMatrix.matrix);
    }

    @Override
    public int hashCode() {
        int result = Arrays.deepHashCode(matrix);
        result = 31 * result + rowsQ;
        result = 31 * result + colQ;
        return result;
    }

}
