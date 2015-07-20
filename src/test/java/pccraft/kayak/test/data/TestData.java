package pccraft.kayak.test.data;

public class TestData {

	public String TestCaseID;
	public String ExecuteTest;
	public String TestDescription;
	public FlightSearchData flightSearchData = new FlightSearchData();
	
	
	
	public class FlightSearchData {
		
		public String Destination = "SFO";
		public String Origin = "PDX";
		public String StartDate = "10/20/2015";
		public String ReturnDate = "10/25/2015";
		public String OriginNearBy = "Yes";
		public String DestinationNearBy = "No";
		
		
	}
	
	
}
