package nmu.prekich.Lab4;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Matrix {
    private int lengthMatrixx;
    private int widthMatrixx;
    private List<List<Integer>> lists = new ArrayList();

    public void setLength(int lengthList) {
        this.lengthMatrixx = lengthList;
    }

    public int getLength() {
        return lengthMatrixx;
    }

    public void setWidth(int widthList) {
        this.widthMatrixx = widthList;
    }

    public int getWidth() {
        return widthMatrixx;
    }

    public List<List<Integer>> getRandomLists() {
        Random rand = new Random();

        for (int i = 0; i < lengthMatrixx; i++) {
            List<Integer> insideList = new ArrayList();
            for (int j = 0; j < widthMatrixx; j++) {
                insideList.add(rand.nextInt(100) - 30);
            }
            lists.add(insideList);
        }

        return lists;
    }

    public void printList() {
        lists.forEach(System.out::println);
    }
}
