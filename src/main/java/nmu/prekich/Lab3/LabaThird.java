package nmu.prekich.Lab3;

public class LabaThird {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        MaxMin MinMax = new MaxMin();

        matrix.setLength(5);
        matrix.setWidth(5);
        matrix.getRandom();
        MinMax.setLength(matrix.getLength());
        MinMax.setWidth(matrix.getWidth());
        MinMax.setMas(matrix.getMas());
        MinMax.getMaximum();
        MinMax.getMinimum();

    }
}

