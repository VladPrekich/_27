package nmu.prekich.Lab4;

public class LabFourth {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        MinMax minMax =new MinMax();

        matrix.setLength(5);
        matrix.setWidth(5);
        matrix.getRandomLists();
        matrix.printList();
        minMax.getMaximum(matrix);
        minMax.getMinimum(matrix);
    }
}
