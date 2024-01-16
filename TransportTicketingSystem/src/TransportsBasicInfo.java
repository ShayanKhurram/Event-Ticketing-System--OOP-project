import java.util.ArrayList;


import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
public class TransportsBasicInfo {

	 private String vehicleinfo;
     private String DriverName;
     private int Capacity;
     private String DepartureDate; 
     private String DeparturePoint; 
     private String DepartureTime;
     private String ArrivalDate;
     private String ArrivalPoint;
     private String ArrivalTime;
     private int Price;
     
	
public String getDriverName() {
		return DriverName;
	}
	public int getCapacity() {
		return Capacity;
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
	public TransportsBasicInfo(){
		
	}

public TransportsBasicInfo(String BusModelNumber,String DriverName,int Capacity, String DepartureDate, String DeparturePoint, String DepartureTime,String ArrivalDate,String ArrivalPoint,String ArrivalTime
,int Price){
	this.vehicleinfo=BusModelNumber;
	this.DriverName=DriverName;
	this.Capacity=Capacity;
	this.DepartureDate=DepartureDate; 
	this.DeparturePoint=DeparturePoint;
	this.DepartureTime=DepartureTime;
	this.ArrivalDate= ArrivalDate;
	this.ArrivalPoint=ArrivalPoint;
	this.ArrivalTime=ArrivalTime; 	
	this.Price=Price;
}


public String  checkseatAvailaiblity(int capacity,int sclass){
	if((capacity-1)>0){
		return "Availaible";
	}
	else{
		return "unavailaible";
	}
}
public String getVehicleinfo(){
	return vehicleinfo;
}
public void setVehicleinfo(String busModelNumber) {
	vehicleinfo = busModelNumber;
}
public void setDriverName(String driverName) {
	DriverName = driverName;
}
public void setCapacity(int capacity) {
	Capacity = capacity;
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
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}

}
