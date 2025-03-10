package in.ashokit.request;


//@Data
public class PassengerInfo {

	private String fname;
	private String lname;
	private String from;
	private String to;
	private String flightId;
	private String journeyData;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getJourneyData() {
		return journeyData;
	}

	public void setJourneyData(String journeyData) {
		this.journeyData = journeyData;
	}

	public PassengerInfo(String fname, String lname, String from, String to, String flightId, String journeyData) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.from = from;
		this.to = to;
		this.flightId = flightId;
		this.journeyData = journeyData;
	}

	public PassengerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PassengerInfo [fname=" + fname + ", lname=" + lname + ", from=" + from + ", to=" + to + ", flightId="
				+ flightId + ", journeyData=" + journeyData + "]";
	}
   
}
