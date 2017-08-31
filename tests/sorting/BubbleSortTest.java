package sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class BubbleSortTest {

  @Test
  public void bubbleSort() throws Exception {
    int[] intArr = {4, 9, 1, 34, 12, 6, 5, 18, 51, 21, -5, -3, 89, -2};
    int[] sortedIntArr = {-5, -3, -2, 1, 4, 5, 6, 9, 12, 18, 21, 34, 51, 89};
    assertArrayEquals(sortedIntArr, BubbleSort.bubbleSort(intArr));
    intArr = new int[]{0, 1, 2, 3, 4, 5};
    sortedIntArr = new int[]{0, 1, 2, 3, 4, 5};
    assertArrayEquals(sortedIntArr, BubbleSort.bubbleSort(intArr));
    intArr = new int[]{5, 4, 3, 2, 1, 0};
    sortedIntArr = new int[]{0, 1, 2, 3, 4, 5};
    assertArrayEquals(sortedIntArr, BubbleSort.bubbleSort(intArr));
    intArr = new int[]{0};
    sortedIntArr = new int[]{0};
    assertArrayEquals(sortedIntArr, BubbleSort.bubbleSort(intArr));
  }

}