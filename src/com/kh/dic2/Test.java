package com.kh.dic2;
// 연습
import java.util.NavigableSet;
import java.util.TreeSet;

public class Test {
  public static void main(String[] args) {
    TreeSet treeSet = new TreeSet();
    treeSet.add("student");
    treeSet.add("teacher");
    treeSet.add("classroom");
    treeSet.add("smart");
    treeSet.add("start");
    treeSet.add("subject");

    System.out.println(treeSet);

    String inputWord = "st";

    System.out.println(inputWord.charAt(0));
    System.out.println(inputWord.charAt(1));
    System.out.println(inputWord.charAt(inputWord.length() - 1));

    // 마지막 문자
    char lastChar = inputWord.charAt(inputWord.length() - 1);
    char nextCharOflastChar = (char) (lastChar + 1);
    System.out.printf("%c %c\n", lastChar, nextCharOflastChar);

    String preWord = inputWord.substring(0, inputWord.length()-1);
    System.out.println(preWord);

    String formWord = preWord + lastChar;
    String endWord = preWord + nextCharOflastChar;
    System.out.printf("%s %s\n", formWord, endWord);

    NavigableSet subset = treeSet.subSet(formWord,false,endWord,false);
    System.out.println(subset);



  }
}
