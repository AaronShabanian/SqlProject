import datetime
import sqlite3
from sqlite3 import Error


def insert_Company(conn):
    companyName=input("Company Name: ")
    companyID=input("Company ID: ")
    marketCap=input("Market Cap: ")
    currentCeo=input("Current Ceo: ")
    sql="INSERT INTO companies(companyName, companyID, marketCap, currentCeo) VALUES("+"'"+companyName+"'"+","+companyID+ "," +marketCap+ ","+"'"+currentCeo+"'"+")"
    print(sql)
    cur = conn.cursor()
    cur.execute(sql)
    conn.commit()

def insert_car(conn):
    carID = input("Car ID: ")
    carName = input("Car Name: ")
    companyName = input("Company Name: ")
    msrp = input("MSRP: ")
    type = input("Type of car: ")
    sql="INSERT INTO carModels(carID, carName, companyName, msrp, type) VALUES("+carID+", "+"'"+carName+"',"+"'"+companyName+"'"+","+msrp+",'"+type+"')"
    print(sql)
    cur = conn.cursor()
    cur.execute(sql)
    conn.commit()

def insert_purchase(conn):
    purchaserName = input("Purchaser Name: ")
    purchaseID = input("Purchase ID: ")
    carID = input("carID: ")
    amountPaid = input("amountPaid: ")
    leaseOrBuy = input("leaseOrBuy: ")
    year = input("Enter a year (YYYY): ")
    month = input("Enter a month (MM): ")
    day = input("Enter a day (DD): ")
    dateOfPurchase = year+"-"+month+"-"+day
    sql="INSERT INTO purchases(purchaserName, purchaseID, carID, amountPaid, leaseOrBuy, dateOfPurchase) VALUES('"+purchaserName+"',"+purchaseID+","+carID+","+amountPaid+",'"+leaseOrBuy+"','"+dateOfPurchase+"'"+")"
    print(sql)
    cur = conn.cursor()
    cur.execute(sql)
    conn.commit()

def insert_sales(conn):
    sellerName = input("Seller Name: ")
    saleID = input("Sale ID: ")
    carID = input("Car ID: ")
    saleDeal = input("Sale price: ")
    year = input("Enter a year (YYYY): ")
    month = input("Enter a month (MM): ")
    day = input("Enter a day (DD): ")
    dateOfSale = year+"-"+month+"-"+day
    sql="INSERT INTO sales(sellerName, saleID, carID, saleDeal, dateOfSale) VALUES('"+sellerName+"',"+saleID+","+carID+","+saleDeal+",'"+dateOfSale+"'"+")"
    print(sql)
    cur = conn.cursor()
    cur.execute(sql)
    conn.commit()

def delete_company(conn):
    companyID=str(input("Company ID: "))
    sql= "DELETE FROM companies where companyID="+companyID
    print(sql)
    cur = conn.cursor()
    cur.execute(sql)
    conn.commit()

def delete_car(conn):
    carID=str(input("Car ID: "))
    sql= "DELETE FROM carModels where carID="+carID
    print(sql)
    cur = conn.cursor()
    cur.execute(sql)
    conn.commit()

def delete_purchase(conn):
    purchaseID=str(input("Purchase ID: "))
    sql= "DELETE FROM purchases where purchaseID="+purchaseID
    print(sql)
    cur = conn.cursor()
    cur.execute(sql)
    conn.commit()

def delete_sales(conn):
    saleID=str(input("Sale ID: "))
    sql= "DELETE FROM sales where saleID="+saleID
    print(sql)
    cur = conn.cursor()
    cur.execute(sql)
    conn.commit()

def carInfo(conn):
    sql= "SELECT carName, companyName from carModels natural join companies"
    print(sql)
    cur = conn.cursor()
    cur.execute(sql)
    result=cur.fetchall()
    print(result)
    conn.commit()

def numOfPurchases(conn):
    year = input("Enter a year (YYYY): ")
    month = input("Enter a month (MM): ")
    day = input("Enter a day (DD): ")
    date = year+"-"+month+"-"+day
    sql= "SELECT count(purchases) from purchases where date="+date
    cur = conn.cursor()
    cur.execute(sql)
    result=cur.fetchall()
    print(result)
    conn.commit()

def profitAmount(conn):
    purchaseID=input("Enter purchase ID")
    sql="SELECT amountPaid-msrp from purchases natural join carModels where purchaseID="+purchaseID
    cur = conn.cursor()
    cur.execute(sql)
    result=cur.fetchall()
    print(result)
    conn.commit()

def numberOfModels(conn):
    sql="SELECT companyName, count(carName) from carModels group by companyName"
    cur = conn.cursor()
    cur.execute(sql)
    result=cur.fetchall()
    print(result)
    conn.commit()

def printInfo(conn):
    sql="SELECT * from sales natual join carModels"
    cur = conn.cursor()
    cur.execute(sql)
    result=cur.fetchall()
    print(result)
    conn.commit()

database = "Dealership.db"
conn = sqlite3.connect(database)
while True:
    print("Welcome to the Car Dealership Database")
    print("Enter the number of the query you would like to complete")
    print("1) Insert company into company table")
    print("2) Insert new car into carModels table")
    print("3) Insert a purchase record into the purchases table")
    print("4) Insert a sale record into the sales table")
    print("5) Delete a company by providing a companyID")
    print("6) Delete a car by providing a car ID")
    print("7) Delete a purchase by providing a purchase ID")
    print("8) Delete a sale by providing a sale ID")
    print("9) Get list of cars models with their company Name")
    print("10) Find number of purchases dealership made on a specific date")
    print("11) Check to see how profitable a purchase is")
    print("12) Find how many different models all companies have")
    print("13) Print all the cars that the dealership bought along with car info")
    print("14) Exit Program")
    answer=input()
    if(answer=="1"):
        insert_Company(conn)
    elif(answer=="2"):
        insert_car(conn)
    elif(answer=="3"):
        insert_purchase(conn)
    elif(answer=="4"):
        insert_sales(conn)
    elif(answer=="5"):
        delete_company(conn)
    elif(answer=="6"):
        delete_car(conn)
    elif(answer=="7"):
        delete_purchase(conn)
    elif(answer=="8"):
        delete_sales(conn)
    elif(answer=="9"):
        carInfo(conn)
    elif(answer=="10"):
        numOfPurchases(conn)
    elif(answer=="11"):
        profitAmount(conn)
    elif(answer=="12"):
        numberOfModels(conn)
    elif(answer=="13"):
        printInfo(conn)
    elif(answer=="14"):
        break
