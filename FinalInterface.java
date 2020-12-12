//STEP 1. Import required packages
import java.sql.*;
import java.util.Scanner;



import java.lang.*;

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
      //variable declarations
      Double diff=0.0;
      Double test1=0.0;
      Double test2=0.0;
      String counter="";
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
      String smallest="";
      String biggest="";
      Double cashFlow=0.0;
      stmt = conn.createStatement();
      //Interface that User sees
      while (true){
         System.out.println("Welcome to the the Mega dealership database");
         System.out.println("Select one of the following options by typing in one of the following numbers");
         System.out.println("1) Print Database Info");
         System.out.println("2) Insert a row into any table");
         System.out.println("3) Delete a row of any table");
         System.out.println("4) Update an employees hourly pay");
         System.out.println("5) Get Car Info from carID #");
         System.out.println("6) Find cars in yout budget");
         System.out.println("7) Check if purchase deal was good or bad");
         System.out.println("8) Check if sale deal was good or bad");
         System.out.println("9) Print company info along with the number of cars that they have in the dealership");
         System.out.println("10) Find Testdrive info from id#, along with employee information");
         System.out.println("11) Find average pay for each job type");
         System.out.println("12) Find Net cash flow of the dealership (Money In- Money Out");
         System.out.println(("13) Quit Program"));
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
               base+="("+ carId+ ", '"+carName+"', '"+companyName+ "', "+msrp+", '"+size+ "')";
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
               
               base+="('"+employeeName+"', "+employeeID+", '"+jobTitle+"', "+hourlyPay+", "+hoursWorked+", 0 )";
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
               base="INSERT INTO testDrives(driverName, driverId, driverEmail, driverPhone, driverAge, carID, dateOfDrive, timeOfDrive, employeeID, testDriveId) VALUES";
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
         else if(selection.equals("3")){
            System.out.println("Enter the number of the table you would like to delete a row from:");
            System.out.println("1) Companies");
            System.out.println("2) carModels");
            System.out.println("3) Purchases");
            System.out.println("4) Sales");
            System.out.println("5) Employees");
            System.out.println("6) testDrives");
            System.out.println("7) serviceCars");
            //Deletion of specified row from table
            selection=input.nextLine();
            if(selection.equals("1")){
               System.out.println("Enter comanyID of what you want to delete: ");
               companyID=input.nextLine();
               base="DELETE FROM companies WHERE companyID="+companyID;
               System.out.println(base);
               try{
                stmt.executeUpdate(base);
                System.out.println("Row Successfully deleted");
               }
               catch(SQLException e){
                  System.out.println("Could not delete row, Returning to main menu ...");
               }
            }
            else if(selection.equals("2")){
               System.out.println("Enter carID: ");
               carId=input.nextLine();
               base="DELETE FROM carModels WHERE carID="+carId;
               System.out.println(base);
               try{
                stmt.executeUpdate(base);
                System.out.println("Row Successfully deleted");
               }
               catch(SQLException e){
                  System.out.println("Could not delete row, Returning to main menu ...");
               }
            }
            else if(selection.equals("3")){
               System.out.println("Enter purchaseId: ");
               purchaseId=input.nextLine();
               base="DELETE FROM purchases WHERE purchaseID="+purchaseId;
               System.out.println(base);
               try{
                stmt.executeUpdate(base);
                System.out.println("Row Successfully deleted");
               }
               catch(SQLException e){
                  System.out.println("Could not delete row, Returning to main menu ...");
               }
            }
            else if(selection.equals("4")){
               System.out.println("Enter saleID");
               saleId=input.nextLine();
               base="DELETE FROM sales WHERE saleID="+saleId;
               System.out.println(base);
               try{
                stmt.executeUpdate(base);
                System.out.println("Row Successfully deleted");
               }
               catch(SQLException e){
                  System.out.println("Could not delete row, Returning to main menu ...");
               }
            }
            else if(selection.equals("5")){
               System.out.println("Enter Employee ID: ");
               employeeID=input.nextLine();
               base="DELETE FROM Employees WHERE employeeID="+employeeID;
               System.out.println(base);
               try{
                stmt.executeUpdate(base);
                System.out.println("Row Successfully deleted");
               }
               catch(SQLException e){
                  System.out.println("Could not delete row, Returning to main menu ...");
               }
            }
            else if(selection.equals("6")){
               System.out.println("enter TestDriveId: ");
               testDriveId=input.nextLine();
               base="DELETE FROM testDrives WHERE testDriveID="+testDriveId;
               System.out.println(base);
               try{
                stmt.executeUpdate(base);
                System.out.println("Row Successfully deleted");
               }
               catch(SQLException e){
                  System.out.println("Could not delete row, Returning to main menu ...");
               }
            }
            else if(selection.equals("7")){
               System.out.println("enter appointmentID");
               appointmentId=input.nextLine();
               base="DELETE FROM serviceCars WHERE appointmentID="+appointmentId;
               System.out.println(base);
               try{
                stmt.executeUpdate(base);
                System.out.println("Row Successfully deleted");
               }
               catch(SQLException e){
                  System.out.println("Could not delete row, Returning to main menu ...");
               }
            }
         }
         else if(selection.equals("4")){
            System.out.println("Emnployee Id: ");
            employeeID=input.nextLine();
            System.out.println("New Hourly Pay: ");
            hourlyPay=input.nextLine();
            base="Select hoursWorked from Employees where employeeID="+employeeID;
            try{
               ResultSet rs = stmt.executeQuery(base);
               while(rs.next()){
                  hoursWorked=rs.getString("hoursWorked");
               }
            }
            catch(SQLException e){
               System.out.println("Error");
            }
            base= "UPDATE Employees SET hourlyPay="+ hourlyPay+", totalPay="+ String.valueOf(Double.parseDouble(hourlyPay)*Double.parseDouble(hoursWorked))+" WHERE employeeID="+employeeID; 
            System.out.println(base);
                try{
                stmt.executeUpdate(base);
                System.out.println("Pay successfully updated");
                }
                catch(SQLException e){
                   System.out.println("Could not update row, Returning to main menu ...");
                }
         }
         else if(selection.equals("5")){
            System.out.println("Enter carID: ");
            carId=input.nextLine();
            base="Select * from carModels where carID="+carId;
            try{
               ResultSet rs = stmt.executeQuery(base);
               while(rs.next()){
                  carName=rs.getString("carName");
                  companyName=rs.getString("companyName");
                  msrp=rs.getString("msrp");
                  size=rs.getString("size");

                  System.out.println("name: "+carName);
                  System.out.println("Company: "+companyName);
                  System.out.println("MSRP: "+msrp);
                  System.out.println("Type of Car: "+size);
               }
               rs.close();
            }
            catch(SQLException e){
               System.out.println("Could not find car, returning to menu");
            }
            System.out.println(" ");
         }
         else if(selection.equals("6")){
            System.out.println("Enter maximum amount willing to pay: ");
            biggest=input.nextLine();
            System.out.println("Enter a minimim amount willing to pay: ");
            smallest=input.nextLine();
            base="Select Distinct carName, companyName, msrp, size from carModels where msrp>"+smallest+" and msrp<"+biggest+ " order by msrp";
            try{
               ResultSet rs = stmt.executeQuery(base);
               while(rs.next()){
                  carName=rs.getString("carName");
                  companyName=rs.getString("companyName");
                  msrp=rs.getString("msrp");
                  size=rs.getString("size");

                  System.out.println("name: "+carName);
                  System.out.println("Company: "+companyName);
                  System.out.println("MSRP: "+msrp);
                  System.out.println("Type of Car: "+size);
                  System.out.println("\n");
               }
               rs.close();
            }
            catch(SQLException e){
              System.out.println("Error in your query found");
            }
         }
         else if(selection.equals("7")){
            System.out.println("Purchase Id: ");
            purchaseId=input.nextLine();
            base="Select amountPaid, msrp from carModels natural join purchases where purchaseID="+purchaseId;
            try{
               ResultSet rs = stmt.executeQuery(base);
               while(rs.next()){
                  amountPaid=rs.getString("amountPaid");
                  msrp=rs.getString("msrp");

                  test1=Double.parseDouble(amountPaid);
                  test2=Double.parseDouble(msrp);
                  diff=test1-test2;
                  diff=Math.abs(diff);
                  if(test1>test2){
                     System.out.println("Overpaid by: ");
                     System.out.println(diff);
                  }
                  else{
                     System.out.println("Underpaid by: ");
                     System.out.println(diff);
                  }

               }
               rs.close();
            }
            catch(SQLException e){
              System.out.println("Error in your query found");
            }

         }
         else if(selection.equals("8")){
            System.out.println("Sale Id: ");
            saleId=input.nextLine();
            base="Select saleDeal, msrp from carModels natural join sales where saleID="+saleId;
            try{
               ResultSet rs = stmt.executeQuery(base);
               while(rs.next()){
                  saleDeal=rs.getString("saleDeal");
                  msrp=rs.getString("msrp");

                  test1=Double.parseDouble(saleId);
                  test2=Double.parseDouble(msrp);
                  diff=test1-test2;
                  diff=Math.abs(diff);
                  if(test1>test2){
                     System.out.println("Overpaid by: ");
                     System.out.println(diff);
                  }
                  else{
                     System.out.println("Underpaid by: ");
                     System.out.println(diff);
                  }

               }
               rs.close();
            }
             catch(SQLException e){
               System.out.println("Error in your query found");
             }
         }
         else if(selection.equals("9")){
            System.out.println("Company Id: ");
            companyID=input.nextLine();
            base="SELECT companyName, currentCeo, count(carID) from companies natural join carModels where companyID="+companyID;
            try{
               ResultSet rs = stmt.executeQuery(base);
               while(rs.next()){
                  companyName=rs.getString("companyName");
                  ceo=rs.getString("currentCeo");
                  counter=rs.getString("count(carID)");
                  System.out.println("Company Name: "+companyName);
                  System.out.println("CEO: "+ceo);
                  System.out.println("Amount of cars in inventory: "+counter);
               }
               rs.close();
            }
            catch(SQLException e){
               System.out.println("Error Detected");
            }
         }
         else if(selection.equals("10")){
            System.out.println("testDrive Id: ");
            testDriveId=input.nextLine();
            base="SELECT * FROM testDrives natural join employees natural join carModels where testDriveId="+testDriveId;
            try{
               ResultSet rs = stmt.executeQuery(base);
               while(rs.next()){
                  driverName=rs.getString("driverName");
                  driverID=rs.getString("driverId");
                  driverEmail=rs.getString("driverEmail");
                  driverPhone=rs.getString("driverPhone");
                  carId=rs.getString("carID");
                  dateOfDrive=rs.getString("dateOfDrive");
                  timeOfDrive=rs.getString("timeOfDrive");
                  employeeID=rs.getString("employeeID");
                  employeeName=(rs.getString("employeeName"));
                  jobTitle=rs.getString("jobTitle");
                  carName=rs.getString("carName");
                  System.out.println("Driver Name: "+ driverName);
                  System.out.println("DriverId: "+driverID);
                  System.out.println("Driver Email: "+driverEmail);
                  System.out.println("Driver Phone: "+driverPhone);
                  System.out.println("carId: "+carId);
                  System.out.println("Model: "+carName);
                  System.out.println("Designated Employee: "+employeeName+" ID: "+employeeID+" Job Title: "+jobTitle);

               }
               rs.close();
            }
            catch(SQLException e){
               System.out.println("Error Detected");
            }
         }
         else if(selection.equals("11")){
            base="SELECT jobTitle, AVG(totalPay) as avgPay FROM Employees group by jobTitle";
            try{
               ResultSet rs = stmt.executeQuery(base);
               while(rs.next()){
                  totalPay=rs.getString("avgPay");
                  jobTitle=rs.getString("jobTitle");
                  System.out.println(jobTitle+": "+totalPay);
               }
             }
           catch(SQLException e){
               System.out.println("Error detected");

            }

         }
         else if(selection.equals("12")){
            base="SELECT sum(amountPaid), sum(totalPay), sum(saleDeal) from purchases natural join carModels natural join testDrives natural join Employees natural join Sales";
            try{
               ResultSet rs = stmt.executeQuery(base);
               while(rs.next()){
                  amountPaid=rs.getString("sum(amountPaid)");
                  totalPay=rs.getString("sum(totalPay)");
                  saleDeal=rs.getString("sum(saleDeal)");
                  cashFlow=(Double.parseDouble(amountPaid)-((Double.parseDouble(saleDeal))+Double.parseDouble(totalPay)));
                  System.out.println("Cash Flow: ");
                  System.out.println(cashFlow);
               }
            }
            catch(SQLException e){
               System.out.println("Error Detected");
            }
         }
         else if(selection.equals(("13"))){
            break;
         }
         
         System.out.println("\n"+"Press enter to continue");
         input.nextLine();
      }
      //STEP 6: Clean-up environment
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
