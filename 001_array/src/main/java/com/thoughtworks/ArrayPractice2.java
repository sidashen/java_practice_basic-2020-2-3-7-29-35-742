package com.thoughtworks;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

public class ArrayPractice2 {

  /**
   * 把给定数组中的最大值保存到数组中的第1个元素且原第一个数换到最大值的位置
   *
   * @return
   */
  public static int[] exchange() {
    int[] array = new int[]{10, 8, 1, 7, 0, 20, 16, 19};
    int num = 0;
    int temp = array[0];
    int index = 0;

    for (int i = 0; i < array.length; i++) {
      if (array[i] > num) {
        num = array[i];
        index = i;
      }
    }

    array[index] = temp;
    array[0] = num;
    return array;
  }
}

