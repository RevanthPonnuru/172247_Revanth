package account;

public class DemoAccount {

	public static void main(String[] args) {
		Account a=new Account();
		a.setId("0111");
		a.setName("Mirza");
		a.setBal(1000);
	System.out.println(a.getId()+"  "+a.getName()+"    "+a.getBal());
	a.credit(1000);
	a.debit(1000);
	a.debit(2000);
	a.transferTo(a, 100);
	a.transferTo(a, 5000);
	a.toString();
	}
}
