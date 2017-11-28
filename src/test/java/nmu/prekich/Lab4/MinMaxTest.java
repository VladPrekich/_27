package nmu.prekich.Lab4;

import static org.junit.Assert.*;

public class MinMaxTest {
    @org.junit.Test
    public void getMaximum() throws Exception {
        Matrix matrix = new Matrix();
        MinMax minMax =new MinMax();

        matrix.setLength(10);
        matrix.setWidth(10);
        matrix.getRandomLists();
        matrix.printList();

        assertNotSame(minMax.getMaximum(matrix), minMax.getMinimum(matrix));

    }

    @org.junit.Test
    public void getMinimum() throws Exception {
        Matrix matrix = new Matrix();
        MinMax minMax =new MinMax();

        matrix.setLength(10);
        matrix.setWidth(10);
        matrix.getRandomLists();
        matrix.printList();

        assertNotSame(minMax.getMaximum(matrix), minMax.getMinimum(matrix));

    }

}