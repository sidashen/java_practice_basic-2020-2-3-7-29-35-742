package com.thoughtworks;

public class ArrayPractice4 {

  /**
   * 完成本方法实现功能: 将一个数字插入到给定的已经排好序的数组中，要求插入以后数组依然是有序的
   */
  public static int[] insert(int number) {
    int[] array = new int[]{1, 20, 50, 100};
    int[] newArray = new int[array.length + 1];

    for (int i = 0; i < array.length; i++) {
      if (number <= array[i]) {
        newArray[i] = number;
        for(i = i + 1; i < newArray.length; i++) {
          newArray[i] = array[i - 1];
        }
      } else {
        newArray[i] = array[i];
      }
      if (number >= array[array.length - 1]) {
        newArray[i] = array[i];
        newArray[i + 1] = number;
      }
    }
  return newArray;
  }
}
