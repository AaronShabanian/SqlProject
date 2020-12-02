CREATE TABLE companies (
  companyName varchar(255) UNIQUE,
  companyID int PRIMARY KEY,
  marketCap float,
  currentCeo varchar(255)
);

CREATE TABLE carModels (
  carID int PRIMARY KEY,
  carName varchar(255),
  companyName varchar(255) UNIQUE,
  msrp float,
  type varchar(255),
  FOREIGN KEY (companyName) REFERENCES companies(companyName)
);

CREATE TABLE purchases (
  purchaserName varchar(255),
  purchaseID int PRIMARY KEY,
  carID int,
  amountPaid float,
  leaseOrBuy varchar(255) CHECK (leaseOrBuy='lease' or leaseOrBuy='buy'),
  dateOfPurchase Date,
  FOREIGN KEY (carID) REFERENCES carModels(carID)
);

CREATE TABLE sales (
  sellerName varchar(255),
  saleID int PRIMARY KEY,
  carID int,
  saleDeal float,
  dateOfSale Date,
  FOREIGN KEY (carID) REFERENCES carModels(carID)
);

CREATE TABLE Employees(
  employeeName varchar(255),
  employeeID int PRIMARY KEY, 
  jobTitle varchar(255), 
  hourlyPay float, 
  hoursWorked int,
  totalPay float
); 
CREATE trigger setPay after update on Employees for each row update Employees set totalpay=hoursWorked*hourlyPay;


CREATE TABLE testDrives(
  driverName varchar(255),
  driverId int NOT NULL, 
  driverEmail varchar(255),
  driverPhone int(255), 
  driverAge int CHECK(driverAge>=18),
  carID int NOT NULL, 
  dateOfDrive Date, 
  timeOfDrive Time, 
  employeeID int, 
  testDriveID int PRIMARY KEY,
  FOREIGN KEY (carID) REFERENCES carModels(carID),
  FOREIGN KEY (employeeID) REFERENCES Employees(employeeID)
);

CREATE TABLE serviceCars(
  problem varchar(255),
  appointmentId int PRIMARY KEY, 
  carID int, 
  timeOfService time, 
  dateOfService date, 
  customerName varchar(255),
  estimatedCost float, 
  FOREIGN KEY(carID) REFERENCES carModels(carID)
);