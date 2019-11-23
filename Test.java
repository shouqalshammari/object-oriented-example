package WireTransfar;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WireTransfer w= new WireTransfer();
		w.setStartAmount(1000);
		w.setFees(100);
		w.setFinalamount(w.getStartAmount()-w.getFees());
		
     //creat sender
		Sender s1=new Sender();
		s1.setName("Ata");
		s1.setPhoneNum(989797); 
		s1.setId(221133);
		w.setSender(s1);
		//creat Reciver
		Reciver r1=new Reciver();
		r1.setName("Essa");
		r1.setId(4546451);
		w.setReciver(r1);
		//creat Bank
		Bank b1=new Bank();
		b1.setBankAccount("35246264");
		b1.setBankBranch("abu Nusier");
		b1.setBankCode("0989");
		
		//creat currency
		Currency c1=new Currency();
		c1.setName("$");
		c1.setRate(87978);
		w.setCurrency(c1);
		Person p1=new Person("ata");
		Person p2=new Person("ata");
		
		  if(p1.equal(p2)) {
		  System.out.println("Ok"); }
		  else {
		  System.out.println("Not Ok");}
		  System.out.println(w);
		
    
		
		
		
	}

}
