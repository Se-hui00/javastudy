package com.kh.day14.f;

public class Main2 {
  public static void main(String[] args) {
    try {
      int[] array = {1, 2, 3};
      int index = 4;
      System.out.println(array[index]);

      A aa = new A();
      B bb = (B) aa;

      // case 1
//    } catch (ArrayIndexOutOfBoundsException e) {
//      System.out.println("배열값 읽기 실패");
//    } catch (ClassCastException e) {
//      System.out.println("클래스 다운캐스팅 실패");
//    }finally {
//      System.out.println("처리 완료");
//    }

      // case 2
//    } catch (Exception e) {
//      if (e instanceof ArrayIndexOutOfBoundsException) {
//        System.out.println("배열값 읽기 실패");
//      } else if (e instanceof ClassCastException) {
//        System.out.println("클래스 다운캐스팅 실패");
//      }
//    } finally {
//      System.out.println("처리 완료");
//    }
//  }

      // case 3
    } catch (ArrayIndexOutOfBoundsException | ClassCastException e) {
      System.out.println("오류 발생");
    }finally {
      System.out.println("처리 완료");
    }
  }
}



