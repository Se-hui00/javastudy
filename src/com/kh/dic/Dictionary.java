package com.kh.dic;

public class Dictionary implements Comparable<Dictionary>{

  String word;
  String mean;

  @Override
  public int compareTo(Dictionary o) {
    return word.compareTo(o.word);
  }

  @Override
  public String toString() {
    return "Dictionary{" +
            "word = '" + word + '\'' +
            ", mean = '" + mean + '\'' +
            '}';
  }
}
