package ncs.test1;

import com.kh.day8.e.Person;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AccountMain {

  private static Account[] accountArray = new Account[5];
  private static int index = 0;
  private static int seq = 0;
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    boolean stop = false;
    while (!stop) {
      System.out.println("========================================================================");
      System.out.println("메뉴 => 1.신규 2.폐지 3.입금 4.출금 5.계좌조회(개인) 6.계좌조회(전체) 7.종료(x)");
      System.out.println("=========================================================================");
      System.out.print("선택 > ");

      int menu = scanner.nextInt();

      switch (menu) {
        case 1: // 신규
          createAccount();
          break;
        case 2: // 폐지
          delete();
          break;
        case 3: // 입금
          deposit();
          break;
        case 4: // 출금
          withdraw();
          break;
        case 5: // 계좌조회(개별)
          accountList();
          break;
        case 6: // 계좌조회(전체)
          accountListAll();
          break;
        case 7: // 종료
          stop = true;
      }
    }
    System.out.println("프로그램 종료");
  }

  // 1. 신규
  private static Account createAccount() {
    System.out.println(">> 계좌생성 << ");
    System.out.print("예금주 이름을 입력해주세요 >> ");
    String name = scanner.next();   // 예금주 이름 입력 받기

    int balance = 0;    // 초기 계좌 잔액은 0원
    String ano = String.format(new DecimalFormat("000").format(++seq));    // 계좌번호 자동 생성

    accountArray[index] = new Account(name, ano, balance);
    for (int i = 0; i < accountArray.length; i++) { // 개설할 수 있는 계좌는 5개
      if (accountArray[i] == null) {
        accountArray[i] = new Account(name, ano, balance);
        System.out.println(accountArray[i] + " 생성되었습니다.");
        break;
      }
    }
    return null;
  }


  // 2. 폐지
  public static void delete() {
    System.out.print("폐지할 계좌번호를 입력해주세요 >> ");
    String ano = scanner.next();


  }


  // 3. 입금
  public static void deposit() {
    System.out.print("입금할 계좌번호를 입력해주세요 >> ");
    String ano = scanner.next();

    System.out.print("입금액 >> ");
    int dep = scanner.nextInt();

    if (findAccount(ano) == null) { // 계좌번호 조회하기
      System.out.println("입력한 계좌번호를 찾지 못했습니다.");
    } else if (dep > 40000) {
      System.out.println("1회 입금한도는 4만원을 초과할 수 없습니다.");
    } else if ((findAccount(ano).getBalance() + dep) > 100000) {
      System.out.println("예치금액은 10만원 이하입니다.");
    } else {
      findAccount(ano).setBalance(findAccount(ano).getBalance() + dep);
      System.out.println(dep + "원을 입금하였습니다.");
    }
  }

  // 4. 출금
  private static void withdraw() {
    System.out.print("출금할 계좌번호를 입력해주세요 >> ");
    String ano = scanner.next();
    System.out.print("출금액 >> ");
    int withd = scanner.nextInt();

    if (findAccount(ano) == null) {
      System.out.println("입력한 계좌번호를 찾지 못했습니다.");
    } else if (withd > 40000) {
      System.out.println("1회 출금한도는 4만원을 초과할 수 없습니다.");
    } else if (withd > (findAccount(ano).getBalance())) {
      System.out.println("잔액보다 큰 액수를 입력하셨습니다.");
    } else {
      findAccount(ano).setBalance(findAccount(ano).getBalance() - withd);
      System.out.println(withd + "원을 출금하였습니다.");
    }
  }


  // 5. 개별 계좌 조회
  private static Account accountList() {
    System.out.print("계좌번호를 입력해주세요 >> ");
    String ano = scanner.next();

    if (findAccount(ano).equals(ano)) {
      System.out.println(findAccount(ano));
    }
    return null;
  }


  // 6. 조회 (전체)
  private static void accountListAll () {
    int cnt = 0;
    System.out.println("전체 계좌를 조회합니다");
    for (int i = 1; i < accountArray.length; i++) {
      if (accountArray[i] != null) {
        System.out.println(accountArray[i]);
        cnt = i;
      }
    }
    System.out.println("현재 사용중인 계좌수 = " + cnt + "개");
    System.out.println("현재 잔여계좌수 = " + (5 - cnt) + "개");
  }

  private static Account findAccount (String ano){
    for (int i = 0; i < accountArray.length; i++) {
      if (accountArray[i] == null) {
        break;
      }
      if (accountArray[i].getAno().equals(ano)) {
        return accountArray[i];
      }
    }
    return null;
  }

}










