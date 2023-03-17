package com.kh.day16.ex3;
// 디폴트값은 null
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Main {
  public static void main(String[] args) {
    List<Boolean> list = new Vector<>();
    list.add(true);
    list.add(false);
    list.add(true);

    Boolean[] bArray = list.toArray(new Boolean[5]);
    System.out.println(Arrays.toString(bArray));  // [true, false, true, null, null]

    Object[] objects = list.toArray();
    System.out.println(Arrays.toString(objects)); // [true, false, true]
  }
}


