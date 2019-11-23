package WireTransfar;

public class Person {
	String name;
	int PhoneNum;
	Address address;
	int Id;
	
	public Person(String name) {
		this.name=name;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return name;
	}
	public boolean equal(Object o) {
		if(o instanceof Person)
		{
			Person p2=(Person) o;
			if(p2.name.equals(this.name)) {
				return true;
			}
			
		}
		else {
			return false;
		}
		return false;
		
		}
		
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getPhoneNum() {
		return PhoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		PhoneNum = phoneNum;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
