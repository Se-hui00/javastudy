package com.kh.day14.g;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    method1();
    method2();
  }
  static void method1() {
    FileWriter fw = null;
    try {
      // 파일 객체 생성
      File f = new File("d:\\javaedu10\\test.txt");
      // 파일 존재 여부 체크
      if (f.exists()) {
        f.createNewFile();
      }

      // 파일 쓰기
      fw = new FileWriter(f);
      fw.write("방가");
      // 버퍼내용을 파일에 쓰기
      fw.flush();

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      // io 채널자원 반납
      try {
        fw.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }

  // try~with~resources : 자동 자원 반납
  // 전제조건 : java.lang.autocloseable 인터페이스를 구현하고 있어야함
  static void method2() {
    // 파일 객체 생성
    File f = new File("d:\\javaedu10\\test.txt");

    try (FileWriter fw = new FileWriter(f);) {
      // 파일 존재 여부 체크
      if (f.exists()) {
        f.createNewFile();
      }
      // 파일 쓰기
      fw.write("방가");
      // 버퍼내용을 파일에 쓰기
      fw.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
