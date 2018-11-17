package lesson14.task7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("src\\lesson14\\task7\\TestFile.txt")) {
            OMatrix<Double> a = new OMatrix<>(getDoubleArray());
            System.out.println("Matrix A:\n" + a);
            a.toFile(fw, "A");

            OMatrix<Integer> b = new OMatrix<>(getIntArray());
            System.out.println("Matrix B:\n" + b);
            a.toFile(fw, "B");

            OMatrix c = b.add(a);
            System.out.println("Matrix C = A + B:\n" + c);
            a.toFile(fw, "C = A + B");

            OMatrix d = a.multiply(2);
            System.out.println("Matrix D = A * 2:\n" + d);
            a.toFile(fw, "D = A * 2");

            OMatrix e = b.sub(a);
            System.out.println("Matrix E = B - A:\n" + e);
            a.toFile(fw, "E = B - A");

            OMatrix<Short> f = new OMatrix<>(new Short[][]{{1, 2}, {3, 4}});
            System.out.println("Matrix F:\n" + f);
            a.toFile(fw, "F");
            System.out.println("Matrix G = F * F:\n" + f.multiply(f));
            a.toFile(fw, "G = F * F");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Double[][] getDoubleArray() {
        return new Double[][]{
                {Math.random(), Math.random(), Math.random()},
                {Math.random(), Math.random(), Math.random()},
                {Math.random(), Math.random(), Math.random()}
        };
    }

    public static Integer[][] getIntArray() {
        return new Integer[][]{
                {new Random().nextInt(7), new Random().nextInt(1), new Random().nextInt(8)},
                {new Random().nextInt(7), new Random().nextInt(1), new Random().nextInt(8)},
                {new Random().nextInt(7), new Random().nextInt(1), new Random().nextInt(8)}
        };
    }
}
