package classes;
//은행계좌 쿨래스 정의
public class bankAccount {
private String ano;//계좌번호
private String owner;//예금주
	private int balance;//잔액
//setter 메서드(설정자) - set+멤버변수 ()
	public void setAno(String ano) {
		this.ano=ano;
		
	}
	// getter 접근자 get+ 멤버 변수 ()
	public String getAno() {
		return ano;
	}
	public void setOwner(String owner) {
		this.owner=owner;
	}
	public String getOwner() {
		return owner;
	}
	public void setBalance(int balance) {
		this.balance=balance;
	}
	public int getBalance() {
		return balance;
	}
	
}
