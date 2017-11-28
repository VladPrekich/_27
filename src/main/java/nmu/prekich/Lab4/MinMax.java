package nmu.prekich.Lab4;

import java.util.List;

public class MinMax {
    private int lengthMatrix;
    private int widthMatrix;

    public void setLength(Matrix matrix) {
        this.lengthMatrix = matrix.getLength();
    }

    public void setWidth(Matrix matrix) {
        this.widthMatrix = matrix.getWidth();
    }

    public int getMaximum(Matrix matrix) {
        int max = matrix.getRandomLists().get(0).get(0);
        lengthMatrix = matrix.getLength();
        widthMatrix = matrix.getWidth();
        for (List<Integer> lists : matrix.getRandomLists()) {
            for (Integer num : lists) {
                if (max < num)
                    max = num;
            }
        }
        System.out.println("Max: " + max);
        return max;
    }

    public int getMinimum(Matrix matrix) {
        int min = matrix.getRandomLists().get(0).get(0);
        lengthMatrix = matrix.getLength();
        widthMatrix = matrix.getWidth();
        for (List<Integer> lists : matrix.getRandomLists()) {
            for (Integer num : lists) {
                if (min > num)
                    min = num;
            }
        }
        System.out.println("Min: " + min);
        return min;

    }
}

