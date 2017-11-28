package nmu.prekich.Lab6;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonToFile {
    private static final String filename = "d:\\JsonToFile.json";

    public static void main(String[] args) {
        Author author = new Author("Ben", 20, Author.Sex.MALE);
        Matrix matrix = new Matrix(author);
        Matrix restoredMatrix;
        MinMax minMax = new MinMax();

        matrix.setWidth(3);
        matrix.setLength(3);

        matrix.getRandomMatrix();
        matrix.printMatrix();
        System.out.println("Name: " + matrix.getName() + "\nAge: " + matrix.getAge() +"\nSex: " + matrix.getSex()+"\n");
        minMax.getMax(matrix);
        minMax.getMin(matrix);



        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String fileJson = gson.toJson(matrix);

        File file = new File(filename, fileJson);
        restoredMatrix = file.getRestoredMatrix();
        if (matrix.equals(restoredMatrix) ){
            System.out.println("\nVariables are equal");
        } else System.out.println("\nError");
    }
}