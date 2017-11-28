package nmu.prekich.Lab3;

public class MaxMin {

    private int[][] mas = new int[100][100];
    private int lengthMatrix;
    private int widthMatrix;

    public void setWidth(int widthMatrix) {
        this.widthMatrix = widthMatrix;
    }

    public void setLength(int lengthMatrix) {
        this.lengthMatrix = lengthMatrix;
    }

    public void setMas(int[][] mas) {
        this.mas = mas;
    }

    public void getMaximum() {
        int getMax = mas[0][0];
        for (int i = 0; i < lengthMatrix; i++) {
            for (int j = 0; j < widthMatrix; j++)
                if (getMax < mas[i][j])
                    getMax = mas[i][j];
        }
        System.out.println("Max: " + getMax);
    }

    public void getMinimum() {
        int getMin = mas[0][0];
        for (int i = 0; i < lengthMatrix; i++) {
            for (int j = 0; j < widthMatrix; j++)
                if (getMin > mas[i][j])
                    getMin = mas[i][j];
        }
        System.out.println("Min: " + getMin);
    }
}


