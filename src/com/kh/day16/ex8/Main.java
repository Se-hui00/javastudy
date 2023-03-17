package com.kh.day16.ex8;
// 저장 순서 X 중복
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    Map<String, Boolean> map = new HashMap<>();
    map.put("사운드", true);
    map.put("그래픽", false);
    map.put("배경음", true);
    map.put("그래픽", true); // 덮어씀

    System.out.println(map);  // {배경음=true, 사운드=true, 그래픽=true}
  }
}


