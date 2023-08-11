package Project;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount tom = new BankAccount("Tom");
		tom.deposit(500.0);
		BankAccount sandy = new BankAccount("Sandy");
		sandy.deposit(200.0);
		tom.transfer(100.0, sandy); //this:tom && acc:sandy
		sandy.withdraw(50.0);
		sandy.withdraw(600.0);
		System.out.println(sandy.getBalance());

	}

}
