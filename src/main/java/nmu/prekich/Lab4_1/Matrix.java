package nmu.prekich.Lab4_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Matrix {
    private int lengthMatrix;
    private int widthMatrix;
    private List<List<Integer>> lists = new ArrayList();

    public void setLength(int lengthList) {
        this.lengthMatrix = lengthList;
    }

    public int getLength() {
        return lengthMatrix;
    }

    public void setWidth(int widthList) {
        this.widthMatrix = widthList;
    }

    public int getWidth() {
        return widthMatrix;
    }

    public List<List<Integer>> getRandomLists() {
        Random rand = new Random();

        for (int i = 0; i < lengthMatrix; i++) {
            List<Integer> insideList = new ArrayList();
            for (int j = 0; j < widthMatrix; j++) {
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