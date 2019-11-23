package WireTransfar;

public class Currency {
double rate ;
String Name;
public double getRate() {
	return rate;
}
public void setRate(double rate) {
	this.rate = rate;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
@Override
public String toString() {
	return "Currency [rate=" + rate + ", Name=" + Name + "]";
}

}
