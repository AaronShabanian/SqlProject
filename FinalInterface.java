//STEP 1. Import required packages
import java.sql.*;
import java.util.Scanner;

public class FinalInterface {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
   static final String DB_URL = "jdbc:mysql://localhost/cpsc408?serverTimezone=UTC";

   //  Database credentials
   static final String USER = "jdbcuser";
   static final String PASS = "jdbc";

   public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName(JDBC_DRIVER);

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);
      String selection= "";
      String base="";
      String companyName="";
      String companyID="";
      String ceo= "";
      String carId="";
      String carName="";
      String msrp="";
      String size="";
      String purchaserName="";
      String purchaseId="";
      String amountPaid="";
      String leaseOrBuy="";
      String dateOfPurchase="";
      String sellerName="";
      String saleId="";
      String saleDeal="";
      String dateOfSale="";
      String employeeName="";
      String employeeID="";
      String jobTitle="";
      String hourlyPay="";
      String hoursWorked="";
      String totalPay="";
      String driverName="";
      String driverID="";
      String driverEmail="";
      String driverPhone="";
      String driverAge="";
      String dateOfDrive="";
      String timeOfDrive="";
      String testDriveId="";
      String problem="";
      String appointmentId="";
      String timeOfService="";
      String dateOfService="";
      String customerName="";
      String estimatedCost="";
      stmt = conn.createStatement();
      //Interface that User sees
      while (true){
         System.out.println("Welcome to the the Mega dealership database");
         System.out.println("Select one of the following options by typing in one of the following numbers");
         System.out.println("1) Print Database Info");
         System.out.println("2) Insert a row into any table");
         System.out.println("3) Delete a row of any table");
         selection= input.nextLine();
         if(selection.equals("1")){
            System.out.println("Tables:");
            //Lists basic table info
            System.out.println("Companies: List of all car companies");
            System.out.println("carModels: List of all car models that the dealership has held in present or past");
            System.out.println("Purchases: Log of all cars purchased from the dealership in 2019");
            System.out.println("Sales: Log of all cars that the dealership bought to keep in the dealership");
            System.out.println("Employees: Log of all employees that the dealership had in 2019");
            System.out.println("Test Drives: Log of all test drives that took place in 2019");
            System.out.println("Service Cars: List of all service appointments from 2019");
         }
         else if(selection.equals("2")){
            System.out.println("Which table # would you like to insert into");
            System.out.println("1) Companies");
            System.out.println("2) carModels");
            System.out.println("3) Purchases");
            System.out.println("4) Sales");
            System.out.println("5) Employees");
            System.out.println("6) testDrives");
            System.out.println("7) serviceCars");
            selection= input.nextLine();
            // 7 if statements to go over each table insert
            if(selection.equals("1")){
               base="INSERT INTO companies(companyName, companyID, currentCeo) VALUES ";
               System.out.println("Company Name: ");
               companyName=input.nextLine();
               System.out.println("Company ID: ");
               companyID=input.nextLine();
               System.out.println("CEO: ");
               ceo=input.nextLine();
               base+="('"+ companyName+ "', "+companyID+", '"+ceo+ "')";
               System.out.println(base);
               try{
                stmt.executeUpdate(base);
                System.out.println("Row Successfully inserted");
               }
               catch(SQLException e){
                  System.out.println("Could not insert row, Returning to main menu ...");
               }
            }
            else if(selection.equals("2")){
               base="INSERT INTO carModels(carID, carName, companyName, msrp, size) VALUES"; 
               System.out.println("carID: ");
               carId=input.nextLine();
               System.out.println("carName: ");
               carName=input.nextLine();
               System.out.println("companyName: ");
               companyName=input.nextLine();
               System.out.println("msrp: ");
               msrp=input.nextLine();
               System.out.println("size: ");
               size=input.nextLine();
               base+="("+ carId+ ", '"+carName+"', '"+companyName+ "', "+msrp+", '"+size+"')";
               System.out.println(base);
               try{
                stmt.executeUpdate(base);
                System.out.println("Row Successfully inserted");
               }
               catch(SQLException e){
                  System.out.println("Could not insert row, Returning to main menu ...");
               }
            }
            else if(selection.equals("3")){
               base="INSERT INTO purchases(purchaserName, purchaseID, carID, amountPaid, leaseOrBuy, dateOfPurchase) VALUES";
               System.out.println("purchaserName: ");
               purchaserName=input.nextLine();
               System.out.println("purchaseId: ");
               purchaseId=input.nextLine();
               System.out.println("carId");
               carId=input.nextLine();
               System.out.println("amountPaid: ");
               amountPaid=input.nextLine();
               System.out.println("leaseOrBuy: ");
               leaseOrBuy=input.nextLine();
               System.out.println("dateOfPurchase(YYYY-MM-DD): ");
               dateOfPurchase=input.nextLine();
               base+="('"+ purchaserName+ "', "+purchaseId+", "+carId+ ", "+amountPaid+", '"+leaseOrBuy+"', '"+dateOfPurchase+"')";
               System.out.println(base);
               try{
                stmt.executeUpdate(base);
                System.out.println("Row Successfully inserted");
               }
               catch(SQLException e){
                  System.out.println("Could not insert row, Returning to main menu ...");
               }
            }
            else if(selection.equals("4")){
               base="INSERT INTO sales(sellerName, saleId, carID, saleDeal, dateOfSale) VALUES";
               System.out.println("SellerName: ");
               sellerName=input.nextLine();
               System.out.println("saleId: ");
               saleId=input.nextLine();
               System.out.println("carId");
               carId=input.nextLine();
               System.out.println("saleDeal: ");
               saleDeal=input.nextLine();
               System.out.println("dateOfSale(YYYY-MM-DD): ");
               dateOfSale=input.nextLine();
               base+="('"+ sellerName+ "', "+saleId+", "+carId+ ", "+saleDeal+", '"+dateOfSale+"')";
               System.out.println(base);
               try{
                stmt.executeUpdate(base);
                System.out.println("Row Successfully inserted");
               }
               catch(SQLException e){
                  System.out.println("Could not insert row, Returning to main menu ...");
               }
            }
            else if(selection.equals("5")){
               base="INSERT INTO Employees(employeeName, employeeID, jobTitle, hourlyPay, hoursWorked, totalPay) VALUES";
               System.out.println("Employee Name: ");
               employeeName=input.nextLine();
               System.out.println("Employee ID: ");
               employeeID=input.nextLine();
               System.out.println("Job Title: ");
               jobTitle=input.nextLine();
               System.out.println("Hourly Pay: ");
               hourlyPay=input.nextLine();
               System.out.println("Hours Worked: ");
               hoursWorked=input.nextLine();
               System.out.println("Total Pay: ");
               totalPay=input.nextLine();
               base+="('"+employeeName+"', "+employeeID+", '"+jobTitle+"', "+hourlyPay+", "+hoursWorked+", "+ totalPay+ ")";
               System.out.println(base);
               try{
                stmt.executeUpdate(base);
                System.out.println("Row Successfully inserted");
               }
               catch(SQLException e){
                  System.out.println("Could not insert row, Returning to main menu ...");
               }
            }
            else if(selection.equals("6")){
               base="INSERT INTO testDrives(driverName, driverID, driverEmail, driverPhone, driverAge, carID, dateOfDrive, timeOfDrive, employeeID, testDriveId) VALUES";
               System.out.println("Driver Name: ");
               driverName=input.nextLine();
               System.out.println("Driver Id: ");
               driverID= input.nextLine();
               System.out.println("Driver Email: ");
               driverEmail=input.nextLine();
               System.out.println("Driver Phone: ");
               driverPhone=input.nextLine();
               System.out.println("Driver Age: ");
               driverAge=input.nextLine();
               System.out.println("Car Id: ");
               carId=input.nextLine();
               System.out.println("Date Of Drive(YYYY-MM-DD): ");
               dateOfDrive=input.nextLine();
               System.out.println("Time of Drive (HH:MM): ");
               timeOfDrive=input.nextLine();
               System.out.println("Employee ID: ");
               employeeID=input.nextLine();
               System.out.println("Test Drive ID: ");
               testDriveId=input.nextLine();
               base+="('"+driverName+"', "+driverID+", '"+driverEmail+"', "+driverPhone+", "+driverAge+", "+ carId+", '"+dateOfDrive+"', '"+timeOfDrive+"', "+ employeeID+ ", "+testDriveId+")";
               System.out.println(base);
               try{
                stmt.executeUpdate(base);
                System.out.println("Row Successfully inserted");
               }
               catch(SQLException e){
                  System.out.println("Could not insert row, Returning to main menu ...");
               }
            }
            else if(selection.equals("7")){
               base="INSERT INTO serviceCars(problem, appointmentId, carID, timeOfService, dateOfService, customerName, estimatedCost) VALUES";
               System.out.println("Problem: ");
               problem=input.nextLine();
               System.out.println("Appointment Id: ");
               appointmentId=input.nextLine();
               System.out.println("carID: ");
               carId=input.nextLine();
               System.out.println("timeOfService(HH:MM): ");
               timeOfService=input.nextLine();
               System.out.println("dateOfService(YYYY-MM-DD): ");
               dateOfService=input.nextLine();
               System.out.println("Customer Name: ");
               customerName=input.nextLine();
               System.out.println("Estimated Cost: ");
               estimatedCost=input.nextLine();
               base+="('"+problem+"', "+appointmentId+", "+carId+", '"+timeOfService+"', '"+dateOfService+"', '"+ customerName+"', "+estimatedCost+")";
               System.out.println(base);
               try{
                stmt.executeUpdate(base);
                System.out.println("Row Successfully inserted");
               }
               catch(SQLException e){
                  System.out.println("Could not insert row, Returning to main menu ...");
               }
            }
         }
         break;
      }
      // String insertData="INSERT INTO Classes(Code, name, professor, room) VALUES ('CPSC230','Computer Science 1', 'Natalie Best', 'Keck 101'), ('CPSC231','Computer Science 2', 'Eric Linstead', 'Keck 103'), ('MATH250', 'Discrete Math', 'Andrew Moshier', 'Hashinger 110'), " +
      // "('CPSC350','Data Structures', 'Rene German', 'Keck 112'), ('CPSC201', 'Visual Programming', 'Derek Prate', 'Keck 130'), ('CPSC298', 'Intro to Nix', 'Dr. Fahy', 'Keck 150'), ('CPSC402', 'Database Management', 'Eric Linstead', 'LL130'), "+
      // "('Math210', 'Multivariable Calculus', 'Dr. Jipsen', 'Hashinger 150'), ('CPSC351', 'Data Communication', 'Dr. Fahy', 'Keck 142'), ('CPSC330', 'Digital Logic', 'Dr. Zao', 'Keck 150')";

      // int i = stmt.executeUpdate(insertData);
      // System.out.println("Rows Inserted: "+i);

      // //Query
      //  ResultSet rs = stmt.executeQuery("Select * from Classes where professor='Eric Linstead'");
      //  System.out.println("Select * from Classes where professor='Eric Linstead'");
      // //STEP 5: Extract data from result set
      // while(rs.next()){
      //    //Retrieve by column name
      //    String Code  = rs.getString("Code");
      //    String name = rs.getString("name");
      //    String professor = rs.getString("professor");
      //    String room = rs.getString("room");

      //    //Display values
      //    System.out.print("Code: " + Code);
      //    System.out.print(", Name: " + name);
      //    System.out.print(", Professor: " + professor);
      //    System.out.println(", Room: " + room);
      // }
      // String updates = "UPDATE Classes SET room=? where Code=?";
      // PreparedStatement preparedStatement =
      //   conn.prepareStatement(updates);

      // preparedStatement.setString(1, "LL130");
      // preparedStatement.setString(2, "CPSC231");
      // int rowsAffected = preparedStatement.executeUpdate();
      // System.out.println("Table update #1 sucessful");
      // String query = "Select * from Classes where Code=?";
      // PreparedStatement preparedStatement2 =
      //   conn.prepareStatement(query);
      // preparedStatement2.setString(1, "CPSC231");
      // ResultSet rs2 =preparedStatement2.executeQuery();
      // while(rs2.next()){
      //    //Retrieve by column name
      //    String Code  = rs2.getString("Code");
      //    String name = rs2.getString("name");
      //    String professor = rs2.getString("professor");
      //    String room = rs2.getString("room");

      //    //Display values
      //    System.out.print("Code: " + Code);
      //    System.out.print(", Name: " + name);
      //    System.out.print(", Professor: " + professor);
      //    System.out.println(", Room: " + room);
      // }
      // String deleterow= "Delete from Classes where Code=?";
      // PreparedStatement preparedStatement3 =
      //   conn.prepareStatement(deleterow);
      // preparedStatement3.setString(1, "CPSC230");
      // preparedStatement3.executeUpdate();
      //System.out.println("CPSC230 has been deleted");
      //STEP 6: Clean-up environment
      // rs.close();
      // rs2.close();
      stmt.close();
      conn.close();
   }
   catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
   input.close();
}//end main
}//end FirstExample
