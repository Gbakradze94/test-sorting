package com.epam.rd.autotasks;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;


public class SortingTest {

    Sorting sorting = new Sorting();
    int[] array = new int[]{};

    //@test
    @Test(expected = IllegalArgumentException.class)
    public void testNullCase(){
        if(array.length == 0){
            throw new IllegalArgumentException();
        }
    }

    @Test
    public void testEmptyCase(){
    int[] array = new int[]{};
        sorting.sort(array);
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testSingleElementArrayCase() {
        int[] array = new int[]{1};
        sorting.sort(array);
        assertArrayEquals(new int[]{1}, array);

        array = new int[]{5};
        sorting.sort(array);
        assertArrayEquals(new int[]{5}, array);

        array = new int[]{0};
        sorting.sort(array);
        assertArrayEquals(new int[]{0}, array);

        array = new int[]{24};
        sorting.sort(array);
        assertArrayEquals(new int[]{24}, array);

        array = new int[]{10};
        sorting.sort(array);
        assertArrayEquals(new int[]{10}, array);
    }

    @Test
    public void testSortedArraysCase() {
        int[] array = new int[]{1, 3, 2, 7, 4};
        sorting.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 7}, array);
    }

    @Test
    public void testOtherCases() {
        int[] array = new int[]{1, -3, 2, 4};
        sorting.sort(array);
        assertArrayEquals(new int[]{-3, 1, 2, 4}, array);
    }

}
