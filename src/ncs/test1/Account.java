package ncs.test1;

public class Account {

  private String name;
  private String ano;
  private int balance;

  public Account(String name, String ano, int balance) {
    this.name = name;
    this.ano = ano;
    this.balance = balance;
  }


  final static int MIN_BALANCE = 0;
  final static int MAX_BALANCE = 100000;


  public String getName() {
    return name;
  }

  public String getAno() {
    return ano;
  }

  public int getBalance() {
    return balance;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAno(String ano) {
    for (int i = 0; i < 100; i++) {
      this.ano = ano + "";
    }
  }


  public void setBalance(int balance) {
    if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
      this.balance = balance;
    }
  }

  @Override
  public String toString() {
    return "계좌 {" +
            "예금주 = " + name +
            ", 계좌번호 = " + ano +
            ", 잔고 = " + balance +
            '}';
  }
}