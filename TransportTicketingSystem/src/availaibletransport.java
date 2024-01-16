
public class availaibletransport {

	private String vehicleinfo;
	private int Capacity;
    private String DepartureDate; 
    private String DeparturePoint; 
    private String DepartureTime;
    private String ArrivalDate;
    private String ArrivalPoint;
    private String ArrivalTime;
    private int Price;
    
	 public availaibletransport(String vehicleinfo, String departureDate, String departurePoint, String departureTime,
			String arrivalDate, String arrivalPoint, String arrivalTime, int price,int Capacity) {
		super();
		this.vehicleinfo = vehicleinfo;
		DepartureDate = departureDate;
		DeparturePoint = departurePoint;
		DepartureTime = departureTime;
		ArrivalDate = arrivalDate;
		ArrivalPoint = arrivalPoint;
		ArrivalTime = arrivalTime;
		Price = price;
		this.setCapacity(Capacity);
	 
	 }
	
		public  String Details(){
			return("Departure Date: "+ getDepartureDate()+"\n From : "+ getDeparturePoint()
		+"\nAt : "+ getDepartureTime()+"\nGoing TO: "+ getArrivalPoint()+"\nArrival Time: "+ getArrivalTime()+"\nArrival Date: "+ getArrivalDate());
		}	
	public void setVehicleinfo(String vehicleinfo) {
		this.vehicleinfo = vehicleinfo;
	}

	public void setDepartureDate(String departureDate) {
		DepartureDate = departureDate;
	}

	public void setDeparturePoint(String departurePoint) {
		DeparturePoint = departurePoint;
	}

	public void setDepartureTime(String departureTime) {
		DepartureTime = departureTime;
	}

	public void setArrivalDate(String arrivalDate) {
		ArrivalDate = arrivalDate;
	}

	public void setArrivalPoint(String arrivalPoint) {
		ArrivalPoint = arrivalPoint;
	}

	public void setArrivalTime(String arrivalTime) {
		ArrivalTime = arrivalTime;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getVehicleinfo() {
		return vehicleinfo;
	}

	public String getDepartureDate() {
		return DepartureDate;
	}

	public String getDeparturePoint() {
		return DeparturePoint;
	}

	public String getDepartureTime() {
		return DepartureTime;
	}

	public String getArrivalDate() {
		return ArrivalDate;
	}

	public String getArrivalPoint() {
		return ArrivalPoint;
	}

	public String getArrivalTime() {
		return ArrivalTime;
	}

	public int getPrice() {
		return Price;
	}

	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

	}
	 



