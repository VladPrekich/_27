package nmu.prekich.Lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Matrix {
    private int lengthMatrix;
    private int widthMatrix;
    private List<List<Integer>> matrix = new ArrayList();
    public Author author;

    public void setLength(int lengthMatrix) {
        this.lengthMatrix = lengthMatrix;
    }

    public void setWidth(int widthMatrix) {
        this.widthMatrix = widthMatrix;
    }

    public int getLength() {
        return lengthMatrix;
    }

    public int getWidth() {
        return widthMatrix;
    }

    public Matrix(Author author) {
        this.author = author;
    }

    public int getAge() {
        return author.getAge();
    }

    public String getName() {
        return author.getName();
    }

    public Author.Sex getSex() {
        return author.sex;
    }

    public void getRandomMatrix() {
        Random rand = new Random();

        for (int i = 0; i < lengthMatrix; i++) {
            List<Integer> newList = new ArrayList();
            for (int j = 0; j < widthMatrix; j++) {
                newList.add(rand.nextInt(1000)-200);
            }
            this.matrix.add(newList);
        }
    }

    public void printMatrix() {
        matrix.forEach(System.out::println);
    }

    public List<List<Integer>> getMatrix() {
        return matrix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matrix matrix1 = (Matrix) o;

        if (lengthMatrix != matrix1.lengthMatrix) return false;
        if (widthMatrix != matrix1.widthMatrix) return false;
        if (!matrix.equals(matrix1.matrix)) return false;
        return author.equals(matrix1.author);
    }
}
