

CREATE TABLE carModels (
  carID int,
  carName varchar(255),
  msrp float,
  type varchar(255)
);

CREATE TABLE companies (
  companyName varchar(255),
  carID int,
  marketCap float,
  dateFounded Date
);

CREATE TABLE purchasers (
  purchaserName varchar(255),
  purchaseID int,
  carID int,
  amountPaid float,
  leaseOrBuy varchar(255),
  dateOfPurchase Date
);

CREATE TABLE sellers (
  sellerName varchar(255),
  saleID int,
  carID int,
  saleDeal float,
  dateOfSale Date
);
