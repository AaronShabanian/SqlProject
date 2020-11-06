CREATE TABLE carModels (
  carID int PRIMARY KEY,
  carName varchar(255),
  companyName varchar(255),
  msrp float,
  type varchar(255),
  FOREIGN KEY (companyName) REFERENCES companies(companyName)
);

CREATE TABLE companies (
  companyName varchar(255),
  companyID int PRIMARY KEY,
  marketCap float,
  currentCeo varchar(255)
);

CREATE TABLE purchases (
  purchaserName varchar(255),
  purchaseID int PRIMARY KEY,
  carID int,
  amountPaid float,
  leaseOrBuy varchar(255),
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
