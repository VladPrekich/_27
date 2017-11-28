package nmu.prekich.Lab6;

import java.util.List;

public class MinMax {
    private int lengthMatrix;
    private int widthMatrix;

    public void setWidth(Matrix matrix) {
        this.widthMatrix = matrix.getWidth();
    }

    public void setLength(Matrix matrix) {
        this.lengthMatrix = matrix.getLength();
    }

    public int getMax(Matrix matrix) {
        int max = matrix.getMatrix().get(0).get(0);
        lengthMatrix= matrix.getLength();
        widthMatrix = matrix.getWidth();
        for (List<Integer> lists : matrix.getMatrix()) {
            for (Integer num : lists) {
                if (max < num)
                    max = num;
            }
        }
        System.out.println("Max: " + max);
        return max;
    }

    public int getMin(Matrix matrix) {
        int min = matrix.getMatrix().get(0).get(0);
        lengthMatrix= matrix.getLength();
        widthMatrix = matrix.getWidth();
        for (List<Integer> lists : matrix.getMatrix()) {
            for (Integer num : lists) {
                if (min > num)
                    min = num;
            }
        }
        System.out.println("Min: " + min);
        return min;
    }
}
