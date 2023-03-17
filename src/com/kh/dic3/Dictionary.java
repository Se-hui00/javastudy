package com.kh.dic3;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Dictionary {

  private TreeMap dic = new TreeMap<>();

  // 1.저장
  public void put(String word, String mean) {
    if (dic.size() == 5) {
      throw new DictionaryException("최대 5개만 저장할 수 있습니다 ");
    } else if (dic.containsKey(word)){
      throw new DictionaryException("이미 등록된 단어입니다");
    }
    this.dic.put(word,mean);
  }

  // 2.검색
  public Map<String, String> searchData(String word) {
    Map<String,String> map = new HashMap<>();
    String mean = (String) (dic.get(word));
    if (dic.containsKey(word)) {
     dic.put(word,mean);
    } else {
      throw new DictionaryException("검색하는 단어가 없습니다");
    }

    if (dic.size() == 0) {
      throw new DictionaryException("없음");
    }
    return map;
  }



}
