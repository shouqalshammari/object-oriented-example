package WireTransfar;
public class WireTransfer{
	
	Sender sender;
	Reciver reciver;
	String purpose;
	double fees;
	double startAmount;
	double finalamount;
	Currency currency;
	@Override
	public String toString() {
		return "WireTransfer [sender=" + sender + ", reciver=" + reciver + ", purpose=" + purpose + ", fees=" + fees
				+ ", startAmount=" + startAmount + ", finalamount=" + finalamount + ", currency=" + currency + "]";
	}
	
	public Sender getSender() {
		return sender;
	}
	public void setSender(Sender s1) {
		this.sender = s1;
	}
	public Reciver getReciver() {
		return reciver;
	}
	public void setReciver(Reciver reciver) {
		this.reciver = reciver;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public double getStartAmount() {
		return startAmount;
	}
	public void setStartAmount(double startAmount) {
		this.startAmount = startAmount;
	}
	public double getFinalamount() {
		return finalamount;
	}
	public void setFinalamount(double finalamount) {
		this.finalamount = finalamount;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
}