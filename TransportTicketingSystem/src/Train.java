
public class Train extends TransportsBasicInfo implements CalculateInfo{
      

public Train(String BusModelNumber,String DriverName,int Capacity, String DepartureDate, String DeparturePoint
, String DepartureTime,String ArrivalDate,String ArrivalPoint,String ArrivalTime
,int Price){
super( BusModelNumber, DriverName, Capacity,   DepartureDate
,   DeparturePoint,   DepartureTime,  ArrivalDate,  ArrivalPoint,  ArrivalTime, Price);				}	

Train(){
	super();
}

@Override
public int CalculateBill(int price, int tclass) {
	// TODO Auto-generated method stub
	if(tclass==1){
		return price*2;
	}
	else if(tclass==0){
		return price;
	}
	else{
		return price*3;
	}}
	public String  checkseatAvailaiblity(int capacity,int sclass){
		//0 for economy
		if(sclass==0 && ((capacity/0.75)-1)>0){
			return "availaible";
		}
		//1 for Business
		else if(sclass==1 && ((capacity/2)-1)>0){
			return "availaible";
		}

		//2 for VIP
		else if(sclass==2 && ((capacity/3)-1)>0){
			return "availaible";
		}
		else{
			return "unavailaible";
					}

	 
	}
}
	

