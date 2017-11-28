package nmu.prekich.Lab4_1;

public class MinMax {
    private int lengthLists;

    public void setLength(Matrix listOfNum) {
        this.lengthLists = listOfNum.getLength();
    }

    public Integer getMaximum(Matrix matrix) {
        lengthLists =matrix.getLength();
        for (int i = 1; i < lengthLists; i++){
            matrix.getRandomLists().get(0).addAll(matrix.getRandomLists().get(i));
        }
        Integer max = matrix.getRandomLists().get(0).stream().max(Integer::compareTo).get();
        System.out.println("Max: " + max);
        return max;
    }

    public Integer getMinimum(Matrix matrix) {
        lengthLists =matrix.getLength();
        for (int i = 1; i < lengthLists; i++){
            matrix.getRandomLists().get(0).addAll(matrix.getRandomLists().get(i));
        }
        Integer min = matrix.getRandomLists().get(0).stream().min(Integer::compareTo).get();
        System.out.println("Min: " + min);
        return min;
    }
}
