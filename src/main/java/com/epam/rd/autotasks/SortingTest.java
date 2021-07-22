package com.epam.rd.autotasks;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;


public class SortingTest {

    Sorting sorting = new Sorting();
    int[] array = new int[]{};


    @Test(expected = IllegalArgumentException.class)
    public void testNullCase(){

        sorting.sort(null);
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
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] sameArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
        sorting.sort(sameArray);
        assertArrayEquals(sameArray, array);
    }

    @Test
    public void testOtherCases() {
        int[] afterSorting = new int[]{ -3, 1, 2, 4};
        int[] beforeSorting = new int[] {1, -3, 2, 4 };
        sorting.sort(beforeSorting);
        assertArrayEquals(afterSorting, beforeSorting);

    }

}
