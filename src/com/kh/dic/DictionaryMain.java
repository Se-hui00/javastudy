package com.kh.dic;

import java.util.*;

public class DictionaryMain {
  public static HashMap<String, String> dic = new HashMap<>();

  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    boolean stop = false;
    while (!stop) {
      System.out.println("===========================================================");
      System.out.println("메뉴 => 1.저장 2.검색 3.수정 4.삭제 5.목록 6.색인 7.통계 8.종료(x)");
      System.out.println("============================================================");
      System.out.print("선택 >> ");
      int menu1 = sc.nextInt();

      switch (menu1) {
        case 1: // 저장
          addData();
          break;
        case 2: // 검색
          searchData();
          break;
        case 3: // 수정
          replaceData();
          break;
        case 4: // 삭제
          deleteData();
          break;
        case 5: // 목록
          list();
          break;
        case 6: // 색인
          break;
        case 7: // 통계
          statistics();
          break;
        case 8: // 종료
          stop = true;
      }
    }
    System.out.println("프로그램 종료");
  }

  // 1.저장
  private static void addData() {
    if (dic.size() < 5) {
      System.out.print("저장할 단어를 입력해주세요 >> ");

      String word = sc.next();

      try {
        if (dic.containsKey(word)) {
          System.out.println("이미 등록되었습니다");
          return;
        }
      } catch (DictionaryException e) {
        e.printStackTrace();
      }

      System.out.print("단어의 뜻를 입력해주세요 >> ");
      String mean = sc.next();
      dic.put(word, mean);

      System.out.println(dic);
    } else {
      System.out.println("최대 5개만 저장할 수 있습니다 ");
    }
  }

  // 2.검색
  private static void searchData() {
    System.out.print("검색할 단어를 입력해주세요 >> ");
    String word = sc.next();

    if (dic.containsKey(word)) {
      System.out.println("검색 결과 : " + dic.get(word));
    } else {
      System.out.println("단어를 검색할 수 없습니다");
    }
  }

  // 3.수정
  private static void replaceData() {
    System.out.print("수정할 단어를 입력해주세요 >> ");
    String word = sc.next();

    if (dic.containsKey(word)) {
      System.out.print("수정할 단어의 뜻를 입력해주세요 >> ");
      String mean = sc.next();
      dic.replace(word, mean);
      System.out.println("단어의 뜻을 수정하였습니다");
    } else {
      System.out.println("단어를 검색할 수 없습니다");
    }
  }

  // 4.삭제
  private static void deleteData() {
    System.out.print("삭제할 단어를 입력해주세요 >> ");
    String val = sc.next();
    if (dic.containsKey(val)) {
      dic.remove(val);
      System.out.println("단어를 삭제하였습니다");
    } else {
      System.out.println("단어를 검색할 수 없습니다");
    }
  }

  // 5.목록
  private static void list() {
    System.out.println("정렬순서를 선택하세요 1.오름차순 2.내림차순");
    System.out.print(">> ");
    int menu2 = sc.nextInt();

    List<String> keySet = new ArrayList<>(dic.keySet());
    switch (menu2) {
      case 1: // 오름차순
        Collections.sort(keySet);

        for (String key : keySet) {
          System.out.print("단어 : " + key);
          System.out.println(" 뜻 : " + dic.get(key));
        }
        break;
      case 2: // 내림차순
        keySet.sort(Collections.reverseOrder());

        for (String key : keySet) {
          System.out.print("단어 : " + key);
          System.out.println(" 뜻 : " + dic.get(key));
        }
        break;
    }
  }

  // 6.색인


  // 7. 통계
  private static void statistics() {
    System.out.println("1.저장된 단어 갯수 : " + dic.size());

    List<String> keySet = new ArrayList<String>(dic.keySet());
    String maxKey = Collections.max(dic.keySet());

    System.out.println("2.단어의 문자수가 가장 많은 단어 : " + maxKey);

    System.out.println("3.단어 글자내림차순 : ");
    keySet.sort(Collections.reverseOrder());
    for (String key : keySet) {
      System.out.println(key);
    }
  }
}

