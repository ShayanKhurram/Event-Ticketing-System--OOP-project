	import java.io.BufferedReader;
	import javafx.scene.layout.Background;
	import javafx.scene.layout.BackgroundImage;
	import javafx.scene.layout.BackgroundRepeat;
	import javafx.scene.layout.BackgroundSize;
	import javafx.scene.layout.BackgroundPosition;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javafx.application.Application;
	import javafx.collections.FXCollections;
	import javafx.collections.ObservableList;
	import javafx.event.ActionEvent;
	import javafx.event.EventHandler;
	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.CheckBox;
	import javafx.scene.control.ComboBox;
	import javafx.scene.control.DatePicker;
	import javafx.scene.control.Label;
	import javafx.scene.control.ListView;
	import javafx.scene.control.TextField;
	import javafx.scene.control.RadioButton;
	import javafx.scene.control.ToggleGroup;
	import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
	import javafx.scene.paint.Color;
	import javafx.scene.text.Font;
	import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
	import javafx.scene.control.TableView;
	import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.PasswordField; 
	
public class execution extends Application{
	 TextField BusModelNumber1,DriverName,capacity,departureDate,departurePoint,departureTime,arrivalDate,arrivalpoint,arrivalTime,Priceset;
	 int Storage,Storage2,Storage3;
	 TableView<Bus> table;
	 static int count=0;
	 String karbhai;
	 int busVip=0;
	 PasswordField passwordField;
	 TextField usernameField;
	 int busBusiness=0;
	 int busEconomy=0;
	 int flightVip=0;
	 int flightBusiness=0;
	 int trainVip=0;
	 int trainBusiness=0;
	 int trainEconomy=0;
	 int flightEconomy=0;
	 int sno1,sno2,sno3;
	  String seats;
	 String busvipseat;
	 String busbusinessseat ;
	 String buseconomyseat ;
	 String flightvipseat ;
	 String flightbusinessseat ;
	 String flighteconomyseat ;
	 String trainvipseat ;
	 String trainbusinessseat ;
	 String traineconomyseat ;
	 TableView<Flight> Flighttable;
	 TableView<Train> Traintable;
	 TableView<passenger> passtable;
	 Scene passenger;
	 Scene temp;
	 Button Back;
	 ArrayList<String> outputarr = new ArrayList<String>();
	 public TableView<availaibletransport> customerselected;
	 int n=0;
	 ArrayList<Bus> busarr  = new ArrayList<>();
	 ArrayList<Flight> flightarr = new ArrayList<>();
	 ArrayList<Train> trainarr = new ArrayList<>();
	 ArrayList<availaibletransport> avarr  = new ArrayList<>();
	 Button Backnow ;
	 RadioButton t1,t2,t3,R1,R2,R3;
	 Bus[] busobjs;
	 Button add;
	 static int addcounter=0;
		VBox v1 ;
		Scene disposable,disposable2,disposable3 ;
	 Scene s,ss;
	
	 ArrayList<Bus> busList;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      launch();
	}
	

	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Label la=new Label("Kharid LOOOOO");
		la.setUnderline(true);
		la.setFont(Font.font(STYLESHEET_MODENA, 40));
		la.setTextFill(Color.ORANGE);
		
/// creating password login page 	
	       GridPane grid0 = new GridPane();
	       
	       Label loginlabel = new Label("kharidloo ticketing system");
	       loginlabel.setUnderline(true);
	       loginlabel.setFont(Font.font(STYLESHEET_MODENA, 20));
	       loginlabel.setTextFill(Color.ORANGE);
	       loginlabel.setAlignment(Pos.CENTER);
	       
	        grid0.setPadding(new Insets(10, 10, 10, 10));
	        grid0.setVgap(8);
	        grid0.setHgap(10);
	        grid0.setAlignment(Pos.CENTER);
	        Label usernameLabel = new Label("Username:");
	        GridPane.setConstraints(usernameLabel, 0, 0);

	        usernameField = new TextField();
	        GridPane.setConstraints(usernameField, 1, 0);

	        Label passwordLabel = new Label("Password:");
	        GridPane.setConstraints(passwordLabel, 0, 1);

	        passwordField = new PasswordField();
	        GridPane.setConstraints(passwordField, 1, 1);

	        Button loginButton = new Button("Login");
	        loginButton.setOnAction(e->{
	        	   try{
	   	        	checklogin(usernameField.getText(),passwordField.getText(),primaryStage,s);
	   	        }
	   	        catch(WrongPasswordException ef){
	   	        System.out.println("sorry cant go further");
	   	        System.out.println(ef);
	   	        }
	   	        
	        });
	        GridPane.setConstraints(loginButton, 1, 2);

	        grid0.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField);
            VBox loginpage = new VBox(50);
            loginpage.setAlignment(Pos.CENTER);
            loginpage.getChildren().addAll(loginlabel,grid0,loginButton);
            loginpage.setStyle("-fx-background-color: Black;");
	        Scene scene0 = new Scene(loginpage, 400, 300);
	        
	        usernameLabel.setStyle("-fx-text-fill: orange; -fx-font-weight: bold;");
	        passwordLabel.setStyle("-fx-text-fill: orange; -fx-font-weight: bold;");

	   
		
//////////////////////////		Bus table formation   ////////////////////////////////////
		
	    // Create the TableView and define its columns
		
		Label buslabel=new Label("BUS DATA");
		buslabel.setTextFill(Color.SKYBLUE);
		buslabel.setFont(Font.font(STYLESHEET_MODENA, 50));
		
		
		
		VBox root =new VBox();
		table = new TableView<>();
        
        TableColumn<Bus, String> BusModelNumberColumn = new TableColumn<>("BusModelNumber");
        BusModelNumberColumn.setCellValueFactory(new PropertyValueFactory<>("vehicleinfo"));
        table.getColumns().add(BusModelNumberColumn);
		
        TableColumn<Bus, String> DriverNameColumn = new TableColumn<>("Driver Name");
        DriverNameColumn.setCellValueFactory(new PropertyValueFactory<>("DriverName"));
        table.getColumns().add(DriverNameColumn);
        
        TableColumn<Bus, Integer> Capacity = new TableColumn<>("Capacity");
        Capacity.setCellValueFactory(new PropertyValueFactory<>("Capacity"));
        table.getColumns().add(Capacity);
        
        TableColumn<Bus, String> DepartureDate = new TableColumn<>("D.Date");
        DepartureDate.setCellValueFactory(new PropertyValueFactory<>("DepartureDate"));
        table.getColumns().add(DepartureDate);
        
        TableColumn<Bus, String> DeparturePoint = new TableColumn<>("D.Point");
        DeparturePoint.setCellValueFactory(new PropertyValueFactory<>("DeparturePoint"));
        table.getColumns().add(DeparturePoint);
        
        
        TableColumn<Bus, String> DepartureTime = new TableColumn<>("D.Time");
        DepartureTime.setCellValueFactory(new PropertyValueFactory<>("DepartureTime"));
        table.getColumns().add(DepartureTime);
        
        TableColumn<Bus, String> ArrivalDate = new TableColumn<>("A.Date");
        ArrivalDate.setCellValueFactory(new PropertyValueFactory<>("ArrivalDate"));
        table.getColumns().add(ArrivalDate);
        
        TableColumn<Bus, String> ArrivalPoint = new TableColumn<>("A.Point");
        ArrivalPoint.setCellValueFactory(new PropertyValueFactory<>("ArrivalPoint"));
        table.getColumns().add(ArrivalPoint);
        
        TableColumn<Bus, String> ArrivalTime = new TableColumn<>("A.Time");
        ArrivalTime.setCellValueFactory(new PropertyValueFactory<>("ArrivalTime"));
        table.getColumns().add(ArrivalTime);
        
        TableColumn<Bus, Integer> Price = new TableColumn<>("Price");
        Price.setCellValueFactory(new PropertyValueFactory<>("Price"));
        table.getColumns().add(Price);
        
        
//        table.getItems().addAll(getBus());	
	   
		
            BusModelNumber1 = new    TextField();
        BusModelNumber1.setPromptText("Bus Model Number");
        
        
            DriverName = new    TextField();
        DriverName.setPromptText("Driver Name");
        
            capacity = new    TextField();
        capacity.setPromptText("Capacity");
        
            departureDate = new    TextField();
        departureDate.setPromptText("Departure Date"); 
        
            departurePoint = new   TextField();
        departurePoint.setPromptText("Departure Point");
        
            departureTime = new    TextField();
        departureTime.setPromptText("Departure Time");
        
            arrivalDate = new    TextField();
        arrivalDate.setPromptText("Arrival Date");
        
            arrivalpoint = new    TextField();
        arrivalpoint.setPromptText("Arrival Point");
        
            arrivalTime = new TextField();
        arrivalTime.setPromptText("Arrival Time");
        
        Priceset = new TextField();
        Priceset.setPromptText("Price");
        
        
        Button add = new Button("ADD");
        add.setOnAction(e->{
        
        	
        busarr.add(new Bus(BusModelNumber1.getText(),DriverName.getText(),Integer.parseInt(capacity.getText()),departureDate.getText(),departurePoint.getText(),departureTime.getText(),arrivalDate.getText(),arrivalpoint.getText()
            		,arrivalTime.getText(),Integer.parseInt(Priceset.getText())));
       
       add(busarr);	
       
		
	    });
        Button Delete = new Button("Delete");
        Delete.setOnAction(e->{
        	int row= table.getSelectionModel().getSelectedIndex();
        	delete(row,1);
        	busarr.remove(row);
        });
        
        Back = new Button("Back");
        Back.setOnAction(e->{
        	primaryStage.setScene(s);
        });
        
        HBox buttons = new HBox();
        buttons.setSpacing(10);
        buttons.setPadding(new Insets(20,20,20,20));
        buttons.getChildren().addAll(add,Delete,Back);
        
        HBox b = new HBox();
        b.setPadding(new Insets(20,20,20,20));
        b.setSpacing(10);
        b.getChildren().addAll(BusModelNumber1,DriverName,capacity,departureDate,departurePoint,departureTime,arrivalDate,arrivalpoint,arrivalTime,Priceset);
        
        root.getChildren().addAll(buslabel,table,b,buttons);
        Scene bs=new Scene(root,300,300);
        bs.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        
////////////////  Flight Booking /////////////////////////    	
        
        

		Label buslabel1=new Label("FLIGHT DATA");
		buslabel1.setFont(Font.font(STYLESHEET_MODENA, 50));
		buslabel1.setTextFill(Color.SKYBLUE);
		
		
		VBox root1 =new VBox();
		Flighttable = new TableView<>();
        
TableColumn<Flight, String> FlightModelNumberColumn1 = new TableColumn<>("Airline Name");
        FlightModelNumberColumn1.setCellValueFactory(new PropertyValueFactory<>("vehicleinfo"));
        Flighttable.getColumns().add(FlightModelNumberColumn1);
		
TableColumn<Flight, String> DriverNameColumn1 = new TableColumn<>("Pilot Name");
        DriverNameColumn1.setCellValueFactory(new PropertyValueFactory<>("DriverName"));
        Flighttable.getColumns().add(DriverNameColumn1);
        
TableColumn<Flight, Integer> Capacity1 = new TableColumn<>("Capacity");
        Capacity1.setCellValueFactory(new PropertyValueFactory<>("Capacity"));
        Flighttable.getColumns().add(Capacity1);
        
TableColumn<Flight, String> DepartureDate1 = new TableColumn<>("D.Date");
        DepartureDate1.setCellValueFactory(new PropertyValueFactory<>("DepartureDate"));
        Flighttable.getColumns().add(DepartureDate1);
        
TableColumn<Flight, String> DeparturePoint1 = new TableColumn<>("D.Point");
        DeparturePoint1.setCellValueFactory(new PropertyValueFactory<>("DeparturePoint"));
        Flighttable.getColumns().add(DeparturePoint1);
        
        
TableColumn<Flight, String> DepartureTime1 = new TableColumn<>("D.Time");
        DepartureTime1.setCellValueFactory(new PropertyValueFactory<>("DepartureTime"));
        Flighttable.getColumns().add(DepartureTime1);
        
TableColumn<Flight, String> ArrivalDate1 = new TableColumn<>("A.Date");
        ArrivalDate1.setCellValueFactory(new PropertyValueFactory<>("ArrivalDate"));
        Flighttable.getColumns().add(ArrivalDate1);
        
TableColumn<Flight, String> ArrivalPoint1 = new TableColumn<>("A.Point");
        ArrivalPoint1.setCellValueFactory(new PropertyValueFactory<>("ArrivalPoint"));
        Flighttable.getColumns().add(ArrivalPoint1);
        
TableColumn<Flight, String> ArrivalTime1 = new TableColumn<>("A.Time");
        ArrivalTime1.setCellValueFactory(new PropertyValueFactory<>("ArrivalTime"));
        Flighttable.getColumns().add(ArrivalTime1);
        
TableColumn<Flight, Integer> Price1 = new TableColumn<>("Price");
        Price1.setCellValueFactory(new PropertyValueFactory<>("Price"));
        Flighttable.getColumns().add(Price1);
        
        

	   
		
            TextField BusModelNumber1 = new    TextField();
        BusModelNumber1.setPromptText("Airline Name");
        
        
        TextField DriverName1 = new    TextField();
        DriverName1.setPromptText("Pilot Name");
        
        TextField capacity1 = new    TextField();
        capacity1.setPromptText("Capacity");
        
        TextField  departureDate1 = new    TextField();
        departureDate1.setPromptText("Departure Date"); 
        
        TextField  departurePoint1 = new   TextField();
        departurePoint1.setPromptText("Departure Point");
        
        TextField departureTime1 = new    TextField();
        departureTime1.setPromptText("Departure Time");
        
        TextField   arrivalDate1 = new    TextField();
        arrivalDate1.setPromptText("Arrival Date");
        
        TextField  arrivalpoint1 = new    TextField();
        arrivalpoint1.setPromptText("Arrival Point");
        
        TextField  arrivalTime1 = new TextField();
        arrivalTime1.setPromptText("Arrival Time");
        
        TextField Priceset1 = new TextField();
        Priceset1.setPromptText("Price");
        
        
        Button add1 = new Button("ADD");
        add1.setOnAction(e->{
      flightarr.add(new Flight(BusModelNumber1.getText(),DriverName1.getText(),Integer.parseInt(capacity1.getText()),departureDate1.getText(),departurePoint1.getText(),departureTime1.getText(),arrivalDate1.getText(),arrivalpoint1.getText()
        		,arrivalTime1.getText(),Integer.parseInt(Priceset1.getText())));
		adding(flightarr);
        });
        Button Delete1 = new Button("Delete");
        Delete1.setOnAction(e->{
        	int row= Flighttable.getSelectionModel().getSelectedIndex();
        	delete(row,2);
        	flightarr.remove(row);
        });
        
        Button Back0 = new Button("Back");
        Back0.setOnAction(e->{
        	primaryStage.setScene(s);
        });
        HBox buttons1 = new HBox();
        buttons1.setSpacing(10);
        buttons1.setPadding(new Insets(20,20,20,20));
        buttons1.getChildren().addAll(add1,Delete1,Back0);
        
        HBox b1 = new HBox();
        b1.setPadding(new Insets(20,20,20,20));
        b1.setSpacing(10);
        b1.getChildren().addAll(BusModelNumber1,DriverName1,capacity1,departureDate1,departurePoint1,departureTime1,arrivalDate1,arrivalpoint1,arrivalTime1,Priceset1);
        
        root1.getChildren().addAll(buslabel1,Flighttable,b1,buttons1);
        root1.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        Scene bs1=new Scene(root1,300,300);
        
        
 ///    Train Table Formation   ////////////////////    
        

		Label buslabel2=new Label("Train DATA");
		buslabel2.setFont(Font.font(STYLESHEET_MODENA, 50));
		buslabel2.setTextFill(Color.SKYBLUE);
		
		
		VBox root2 =new VBox();
		Traintable = new TableView<>();
        
TableColumn<Train, String> TrainModelNumberColumn2 = new TableColumn<>("Train Model Number");
        TrainModelNumberColumn2.setCellValueFactory(new PropertyValueFactory<>("vehicleinfo"));
        Traintable.getColumns().add(TrainModelNumberColumn2);
		
TableColumn<Train, String> DriverNameColumn2 = new TableColumn<>("Driver Name");
        DriverNameColumn2.setCellValueFactory(new PropertyValueFactory<>("DriverName"));
        Traintable.getColumns().add(DriverNameColumn2);
        
TableColumn<Train, Integer> Capacity2 = new TableColumn<>("Capacity");
        Capacity2.setCellValueFactory(new PropertyValueFactory<>("Capacity"));
        Traintable.getColumns().add(Capacity2);
        
TableColumn<Train, String> DepartureDate2 = new TableColumn<>("D.Date");
        DepartureDate2.setCellValueFactory(new PropertyValueFactory<>("DepartureDate"));
        Traintable.getColumns().add(DepartureDate2);
        
TableColumn<Train, String> DeparturePoint2 = new TableColumn<>("D.Point");
        DeparturePoint2.setCellValueFactory(new PropertyValueFactory<>("DeparturePoint"));
        Traintable.getColumns().add(DeparturePoint2);
        
        
TableColumn<Train, String> DepartureTime2 = new TableColumn<>("D.Time");
        DepartureTime2.setCellValueFactory(new PropertyValueFactory<>("DepartureTime"));
        Traintable.getColumns().add(DepartureTime2);
        
TableColumn<Train, String> ArrivalDate2 = new TableColumn<>("A.Date");
        ArrivalDate2.setCellValueFactory(new PropertyValueFactory<>("ArrivalDate"));
        Traintable.getColumns().add(ArrivalDate2);
        
TableColumn<Train, String> ArrivalPoint2 = new TableColumn<>("A.Point");
        ArrivalPoint2.setCellValueFactory(new PropertyValueFactory<>("ArrivalPoint"));
        Traintable.getColumns().add(ArrivalPoint2);
        
TableColumn<Train, String> ArrivalTime2 = new TableColumn<>("A.Time");
        ArrivalTime2.setCellValueFactory(new PropertyValueFactory<>("ArrivalTime"));
        Traintable.getColumns().add(ArrivalTime2);
        
TableColumn<Train, Integer> Price2 = new TableColumn<>("Price");
        Price2.setCellValueFactory(new PropertyValueFactory<>("Price"));
        Traintable.getColumns().add(Price2);
        
        

	   
		
            TextField BusModelNumber2 = new    TextField();
        BusModelNumber2.setPromptText("Bus Model Number");
        
        
        TextField DriverName2 = new    TextField();
        DriverName2.setPromptText("Driver Name");
        
        TextField capacity2 = new    TextField();
        capacity2.setPromptText("Capacity");
        
        TextField  departureDate2 = new    TextField();
        departureDate2.setPromptText("Departure Date"); 
        
        TextField  departurePoint2 = new   TextField();
        departurePoint2.setPromptText("Departure Point");
        
        TextField departureTime2 = new    TextField();
        departureTime2.setPromptText("Departure Time");
        
        TextField   arrivalDate2 = new    TextField();
        arrivalDate2.setPromptText("Arrival Date");
        
        TextField  arrivalpoint2 = new    TextField();
        arrivalpoint2.setPromptText("Arrival Point");
        
        TextField  arrivalTime2 = new TextField();
        arrivalTime2.setPromptText("Arrival Time");
        
        TextField Priceset2 = new TextField();
        Priceset2.setPromptText("Price");
        
        
        Button add2 = new Button("ADD");
        add2.setOnAction(e->{
       trainarr.add(new Train(BusModelNumber2.getText(),DriverName2.getText(),Integer.parseInt(capacity2.getText()),departureDate2.getText(),departurePoint2.getText(),departureTime2.getText(),arrivalDate2.getText(),arrivalpoint2.getText()
        		,arrivalTime2.getText(),Integer.parseInt(Priceset2.getText())));
		added(trainarr);	
        });
        Button Delete2 = new Button("Delete");
        Delete2.setOnAction(e->{
        	int row= Traintable.getSelectionModel().getSelectedIndex();
        	delete(row,3);
        	trainarr.remove(row);
        });
        Button back = new Button("Back");
        back.setOnAction(e->{
        	primaryStage.setScene(s);
        });
        
        HBox buttons2 = new HBox();
        buttons2.setSpacing(20);
        buttons2.setPadding(new Insets(20,20,20,20));
        buttons2.getChildren().addAll(add2,Delete2,back);
        
        HBox b2 = new HBox();
        b2.setPadding(new Insets(20,20,20,20));
        b2.setSpacing(20);
        b2.getChildren().addAll(BusModelNumber2,DriverName2,capacity2,departureDate2,departurePoint2,departureTime2,arrivalDate2,arrivalpoint2,arrivalTime2,Priceset2);
        
        root2.getChildren().addAll(buslabel2,Traintable,b2,buttons2);
        root2.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        Scene bs2=new Scene(root2,300,300);
        
/////Customer selected table
         
        customerselected = new TableView<>();
        
        TableColumn<availaibletransport, String> vehicleinfos = new TableColumn<>("Bus Model Number");
        vehicleinfos.setCellValueFactory(new PropertyValueFactory<>("vehicleinfo"));
        customerselected.getColumns().add(vehicleinfos);
		

        
        TableColumn<availaibletransport, String> DepartureDates = new TableColumn<>("Departure Date");
        DepartureDates.setCellValueFactory(new PropertyValueFactory<>("DepartureDate"));
        customerselected.getColumns().add(DepartureDates);
        
        TableColumn<availaibletransport, String> DeparturePoints = new TableColumn<>("Departure Point");
        DeparturePoints.setCellValueFactory(new PropertyValueFactory<>("DeparturePoint"));
        customerselected.getColumns().add(DeparturePoints);
        
        
        TableColumn<availaibletransport, String> DepartureTimes = new TableColumn<>("Departure Time");
        DepartureTimes.setCellValueFactory(new PropertyValueFactory<>("DepartureTime"));
        customerselected.getColumns().add(DepartureTimes);
        
        TableColumn<availaibletransport, String> ArrivalDates = new TableColumn<>("Arrival Date");
        ArrivalDates.setCellValueFactory(new PropertyValueFactory<>("ArrivalDate"));
        customerselected.getColumns().add(ArrivalDates);
        
        TableColumn<availaibletransport, String> ArrivalPoints = new TableColumn<>("Arrival Point");
        ArrivalPoints.setCellValueFactory(new PropertyValueFactory<>("ArrivalPoint"));
        customerselected.getColumns().add(ArrivalPoints);
		
        
        TableColumn<availaibletransport, Integer> prices = new TableColumn<>("Arrival Point");
        prices.setCellValueFactory(new PropertyValueFactory<>("price"));
        customerselected.getColumns().add(prices);
        
      
        
//// Passenger Table
        passtable = new TableView<>();
        TableColumn<passenger, String> name = new TableColumn<>("Name");
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        passtable.getColumns().add(name);
        
        TableColumn<passenger, String> email = new TableColumn<>("Email");
        email.setCellValueFactory(new PropertyValueFactory<>("email"));
        passtable.getColumns().add(email);
        
        
        TableColumn<passenger, String> phone = new TableColumn<>("Phone");
        phone.setCellValueFactory(new PropertyValueFactory<>("phone"));
        passtable.getColumns().add(phone);
        
//        TableColumn<passenger, String> userid = new TableColumn<>("Departure Time");
//        userid.setCellValueFactory(new PropertyValueFactory<>("generateUserId()"));
//        passtable.getColumns().add(userid);
//        
        
        
/// Passenger Form//////
        
        GridPane grid1 = new GridPane();
        grid1.setPadding(new Insets(20,20,20,20));
        grid1.setVgap(8);
        grid1.setHgap(10);
        
    	Label passengername = new Label("Your name: ");
		GridPane.setConstraints(passengername, 0, 0);
		
		TextField passengername1 = new TextField();
		passengername1.setPromptText("name");
		GridPane.setConstraints(passengername1, 1, 0);
	
		Label passengerphone = new Label("Your phone: ");
		GridPane.setConstraints(passengerphone, 0, 1);
		
		TextField passengerphone1 = new TextField();
		passengerphone1.setPromptText("phone");
		GridPane.setConstraints(passengerphone1, 1, 1);
		
		Label passengeremail = new Label("Your email: ");
		GridPane.setConstraints(passengeremail, 0, 2);
		
		TextField passengeremail1 = new TextField();
		passengeremail1.setPromptText("phone");
		GridPane.setConstraints(passengeremail1, 1, 2);
		
		grid1.getChildren().addAll(passengername,passengername1,passengerphone
		,passengerphone1,passengeremail,passengeremail1);
				
		
//		
		 R1=new RadioButton("Business");
		 R2=new RadioButton("VIP");
		 R3=new RadioButton("Economy");
//
	
		
//		
		ToggleGroup R=new ToggleGroup();
		R1.setToggleGroup(R);
		R2.setToggleGroup(R);
		R3.setToggleGroup(R);
		HBox R0=new HBox(10);
		R0.getChildren().addAll(R1,R2,R3);  
		
		
		
		
		
		HBox pass = new HBox();
		Button Booknow = new Button("Book now");
		Booknow.setOnAction(e->{
			passenger Passenger = new passenger(passengername1.getText(),passengerphone1.getText()
			,passengeremail1.getText());
		add(Passenger);	
		
		int calculate=0;
	  
		
	
		if(R1.isSelected()){
			if(t1.isSelected()){
			calculate=busBusiness;
			seats=busbusinessseat;
			}
			if(t2.isSelected()){
				calculate=flightBusiness;
				seats=flightbusinessseat;
			}
			if(t3.isSelected()){
				calculate=trainBusiness;
				seats=trainbusinessseat;
			}
			
		}
		if(R2.isSelected()){
			if(t1.isSelected()){
			calculate=busVip;
			seats=busvipseat;
			}
			if(t2.isSelected()){
				calculate=flightVip;
				seats=flightvipseat;
			}
			if(t3.isSelected()){
				calculate=trainVip;
				seats=trainvipseat;
			}
		}
			if(R3.isSelected()){
				if(t1.isSelected()){
					calculate=busEconomy;
					seats=buseconomyseat;
				}
				if(t2.isSelected()){
					calculate=flightEconomy;
					seats=flighteconomyseat;
				}
				if(t3.isSelected()){
					calculate=trainEconomy;
					seats=traineconomyseat;
				}	
			
		}

			
			 try {
				 
				 
                    				 
			        BufferedWriter writer = new BufferedWriter(new FileWriter("outputs.txt",true));
			     
			
                    writer.write(""+ karbhai);
                    writer.write("Passenger userid: "+ generateUserId(count));
			        writer.write("\nPassenger name:"+passengername1.getText());
			        writer.write("\nPassenger phone:"+passengerphone1.getText());
			        writer.write("\nSeat status: "+seats);
			        writer.write("\nprice:"+calculate);
			        count++;
			        
			     
			        writer.close();
			      } catch (IOException f) {
			        f.printStackTrace();
			      }
			      
			      try {
			        BufferedReader reader = new BufferedReader(new FileReader("outputs.txt"));
			        String line;
			        while((line = reader.readLine()) != null) {
			          System.out.println(line);
			        }
			        reader.close();
			      } catch (IOException g) {
			        g.printStackTrace();
			      }
				
				
				
				
			
			
	    });
		 Backnow = new Button("Back");
	    
		 
		 
		
		pass.getChildren().addAll(Booknow,Backnow);
		
		VBox passvb = new VBox(10);
		passvb.getChildren().addAll(grid1,R0,pass);
		passenger = new Scene(passvb,500,500);
        
		
			
///  sellers First page
            GridPane grid = new GridPane();
            grid.setPadding(new Insets(20,20,20,20));
            grid.setVgap(40);
            grid.setHgap(10);
                 grid.setAlignment(Pos.CENTER);
         
             	Label  he= new Label("Welcome to KharidLOOO");
             	he.setAlignment(Pos.TOP_CENTER);
                he.setUnderline(true);
     	       he.setFont(Font.font(STYLESHEET_MODENA, 50));
     	       he.setTextFill(Color.BLACK);
     	      he.setStyle("-fx-text-fill: black; -fx-font-weight: bold;");
			Label currentlocation = new Label("Your Current Location: ");
		
			GridPane.setConstraints(currentlocation, 0, 0);
			
			TextField  currentlocationt= new TextField();
			currentlocationt.setPromptText("Destination");
			currentlocation.setStyle("-fx-text-fill: white; -fx-font-weight: bold;");
			GridPane.setConstraints(currentlocationt, 1, 0);
			
			Label  destination1= new Label("Where you want to go: ");
			GridPane.setConstraints(destination1, 0, 1);
			
		
			destination1.setStyle("-fx-text-fill: white; -fx-font-weight: bold;");
			TextField destination = new TextField();
			destination.setPromptText("Destination");
			GridPane.setConstraints(destination, 1, 1);
			
			grid.getChildren().addAll(currentlocation,currentlocationt,destination1,destination);
			
			
			 t1=new RadioButton("Bus");
			 t2=new RadioButton("Flight");
			 t3=new RadioButton("Train");
	
			
			
			
			ToggleGroup t=new ToggleGroup();
			t1.setToggleGroup(t);
			t2.setToggleGroup(t);
			t3.setToggleGroup(t);
			
            
			HBox h=new HBox(10);
			h.getChildren().addAll(t1,t2,t3);
			h.setStyle("-fx-font-size: 16;");
			h.setAlignment(Pos.CENTER);
			VBox v = new VBox(100);

			 Scene ss = new Scene(v,1200,675);
			Button Book = new Button("Book");
			Book.setOnAction(e->{
				primaryStage.setScene(passenger);
			  
			});
			
		
			Button Back2 = new Button("Back");
			Back2.setOnAction(e->{
				primaryStage.setScene(ss);
			});
		    
			Button submit = new Button("submit");
		    submit.setStyle("-fx-font-size: 16;");
	     
			submit.setOnAction(e->{
			if(t1.isSelected()){
				
				 temp = disposable;
				String target=currentlocationt.getText();
				
				for(Bus bus : busarr){
				
				if(bus.getDeparturePoint().equals(target)){
					  	
				
				availaibletransport Availaibletransport=new availaibletransport(bus.getVehicleinfo(),bus.getDepartureDate(),bus.getDeparturePoint(),bus.getDeparturePoint(),
				    		bus.getArrivalDate(),bus.getArrivalPoint(),bus.getArrivalPoint(),bus.getPrice(),bus.getCapacity());
					
					added(Availaibletransport);
				    karbhai=Availaibletransport.Details();
				    sno1=bus.getCapacity();
				    busvipseat=bus.checkseatAvailaiblity(sno1,2);
				    busbusinessseat=bus.checkseatAvailaiblity(sno1,1);
				    buseconomyseat=bus.checkseatAvailaiblity(sno1,0);
					Storage=bus.getPrice();
					busVip=bus.CalculateBill(Storage,2);
					busBusiness=bus.CalculateBill(Storage,1);
					busEconomy=bus.CalculateBill(Storage,0);
					v1= new VBox(15);
					v1.getChildren().addAll(customerselected,Book,Back2);
					 disposable = new Scene(v1,500,500)	;
					primaryStage.setScene(disposable);
							
				}}}
				
				if(t2.isSelected()){
					 temp = disposable2 ;
			String target1=currentlocationt.getText();
				
				for(Flight flight : flightarr){
				
				if(flight.getDeparturePoint().equals(target1)){
					  	
				
				availaibletransport AvailaibleTransport=new availaibletransport(flight.getVehicleinfo(),flight.getDepartureDate(),flight.getDeparturePoint(),flight.getDeparturePoint(),
				    		flight.getArrivalDate(),flight.getArrivalPoint(),flight.getArrivalPoint(),flight.getPrice(),flight.getCapacity());
					
					added(AvailaibleTransport);
					 karbhai=AvailaibleTransport.Details();
				    sno1=flight.getCapacity();
				    flightvipseat=flight.checkseatAvailaiblity(sno1,2);
				    flightbusinessseat=flight.checkseatAvailaiblity(sno1,1);
				    flighteconomyseat=flight.checkseatAvailaiblity(sno1,0);
					Storage2=flight.getPrice();
					flightVip=flight.CalculateBill(Storage,2);
					flightBusiness=flight.CalculateBill(Storage,1);
					flightEconomy=flight.CalculateBill(Storage,0);
					v1= new VBox(15);
					v1.getChildren().addAll(customerselected,Book,Back2);
					 disposable2 = new Scene(v1,500,500);
					primaryStage.setScene(disposable2);
				
				
			}}}
				if(t3.isSelected()){
					 temp = disposable3 ;
			String target2=currentlocationt.getText();
				
				for(Train flight : trainarr){
				
				if(flight.getDeparturePoint().equals(target2)){
					  	
				
				availaibletransport AvailaibleTransport=new availaibletransport(flight.getVehicleinfo(),flight.getDepartureDate(),flight.getDeparturePoint(),flight.getDeparturePoint(),
				    		flight.getArrivalDate(),flight.getArrivalPoint(),flight.getArrivalPoint(),flight.getPrice(),flight.getCapacity());
				 karbhai=AvailaibleTransport.Details();
					added(AvailaibleTransport);
					
					  sno1=flight.getCapacity();
					    trainvipseat=flight.checkseatAvailaiblity(sno1,2);
					    trainbusinessseat=flight.checkseatAvailaiblity(sno1,1);
					    traineconomyseat=flight.checkseatAvailaiblity(sno1,0);
					
					Storage3=flight.getPrice();
					trainVip=flight.CalculateBill(Storage,2);
					trainBusiness=flight.CalculateBill(Storage,1);
					trainEconomy=flight.CalculateBill(Storage,0);
					
					v1= new VBox(15);
					v1.getChildren().addAll(customerselected,Book,Back2);
					 disposable3 = new Scene(v1,500,500);
					primaryStage.setScene(disposable3);
				
				}}}
				
				});
			
//			
	
			
		    Button ba = new Button("Back");
		    ba.setStyle("-fx-font-size: 16;");
		 
		    HBox as =new HBox(20);
		    as.getChildren().addAll(submit,ba);
		    as.setAlignment(Pos.CENTER);
			v.getChildren().addAll(he,grid,h,as);
			v.setAlignment(Pos.CENTER);
		Image backgroundImage1 = new Image("file:///C:/Users/Shayan Khurram/Downloads/kuch.jpg");

			
	        // Create a BackgroundImage
	        BackgroundImage background1 = new BackgroundImage(
	                backgroundImage1,
	                BackgroundRepeat.NO_REPEAT,
	                BackgroundRepeat.NO_REPEAT,
	                BackgroundPosition.DEFAULT,
	                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false)
	        );
			
	        v.setBackground(new Background(background1));
		
		
	   
//			HBox style = new HBox();
//		    style.setPadding(new Insets(20,20,20,20));
//		    style.setSpacing(20);
//		    style.getChildren().addAll(currentlocation,mt,destination);
//		        
			Backnow.setOnAction(e->{
				 if(t1.isSelected()){
				primaryStage.setScene(disposable);		
					}
				 if(t2.isSelected()){
					 primaryStage.setScene(disposable2); 
				 }
				 if(t3.isSelected()){
					 primaryStage.setScene(disposable3);
				 }
			 });
			  
			
		    /////This will be the main scene
	        
	        Label mla=new Label(" YOU WANT TO USE AS ");
	        mla.setUnderline(true);
			mla.setFont(Font.font(STYLESHEET_MODENA, 50));
			mla.setTextFill(Color.BLACK);
		    mla.setStyle("-fx-text-fill: black; -fx-font-weight: bold;");

			Image backgroundImage = new Image("file:///C:/Users/Shayan Khurram/Downloads/transportation-global-maps1.png");

			
	        // Create a BackgroundImage
	        BackgroundImage background = new BackgroundImage(
	                backgroundImage,
	                BackgroundRepeat.NO_REPEAT,
	                BackgroundRepeat.NO_REPEAT,
	                BackgroundPosition.DEFAULT,
	                new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false)
	        );
			
			
			
	        Button mr1=new Button("Buyer");
	        mr1.setOnAction(e->{
		 		primaryStage.setScene(ss);
		 	});
			Button mr2=new Button("Seller");
			mr2.setOnAction(e->{
				primaryStage.setScene(scene0);
			});
			mr1.setStyle("-fx-background-color: black; -fx-text-fill: white;");
			mr2.setStyle("-fx-background-color: black; -fx-text-fill: white;");
		 
				HBox ms=new HBox(50);
				ms.getChildren().addAll(mr1,mr2);
				ms.setAlignment(Pos.CENTER);
	        
				VBox c1=new VBox(120);
				c1.getChildren().addAll(mla,ms);
				c1.setAlignment(Pos.CENTER);
				 c1.setBackground(new Background(background));
				Scene mainscene=new Scene(c1,819,394);
							
			
			
			
			
		Scene pas = new Scene(passtable,500,500); 
//		creating buttons for Admins First page 
		Button r1=new Button("Passengers");
		r1.setOnAction(e->{
			primaryStage.setScene(pas);
		});
		Button r2=new Button("Bus");
		r2.setOnAction(e->{
         primaryStage.setScene(bs);
		});
		Button r3=new Button("Plane ");
		r3.setOnAction(e->{
	         primaryStage.setScene(bs1);
			});
		Button r4=new Button("Train");
		r4.setOnAction(e->{
	         primaryStage.setScene(bs2);
			});
	
		 Button Back1 = new Button("Back");
	        Back1.setOnAction(e->{
	        	primaryStage.setScene(mainscene);
	        });
		
		
	    	
		HBox a=new HBox(30);
		a.getChildren().addAll(r1,r2,r3,r4,Back1);
		a.setAlignment(Pos.CENTER);
		
		   ba.setOnAction(e->{
			    primaryStage.setScene(mainscene);

		    });
		
		VBox c=new VBox(80);
		c.setStyle("-fx-background-color: Black;");
		c.getChildren().addAll(la,a);
		c.setAlignment(Pos.CENTER);
		 s=new Scene(c,800,250);
		
		
		
		
		primaryStage.setScene(mainscene);
		primaryStage.show();
	}

public void adding(ArrayList<Flight> Flight){
    Collections.reverse(Flight);

	Flighttable.getItems().clear();
	Flighttable.getItems().addAll(Flight);
	
	
}
public void add(ArrayList<Bus> bus){
    Collections.reverse(bus);

	table.getItems().clear();
	table.getItems().addAll(bus);
	
	
}

public void added(ArrayList<Train> bus){
    Collections.reverse(bus);

	Traintable.getItems().clear();
	Traintable.getItems().addAll(bus);
	
	
}

public void add(Flight flight){
	Flighttable.getItems().add(flight);
}
public void add(passenger pass){
	passtable.getItems().add(pass);
}

public void add(Train train){
	Traintable.getItems().add(train);
}
public void added(availaibletransport av){
	customerselected.getItems().add(av);
}
public void delete(int row , int tablenumber){
	if(row >= 0 && tablenumber==1){
		table.getItems().remove(row);
	}
	if(row >= 0 && tablenumber==2){
		Flighttable.getItems().remove(row);
	}
	if(row >= 0 && tablenumber==3){
		Traintable.getItems().remove(row);
	}
	
}
public  static  String  generateUserId(int userid){
	return ("A0"+userid);
}

public static void  checklogin(String a,String b,Stage primaryStage,Scene s) throws WrongPasswordException{
	if(a.equals("shayan")==true||b.equals("12345")==true){
		primaryStage.setScene(s);
	}
	else{
		throw new  WrongPasswordException("sorry wrong password");
	}
}
}


