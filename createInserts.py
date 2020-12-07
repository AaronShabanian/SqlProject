import random
import names
import time
import string
#Companies
print(time.perf_counter())
data = open("data.sql", "w")
companyBase="INSERT INTO companies(companyName, companyID, currentCeo) VALUES "
companyNames=["Acura", "Alfa Romeo", "Audi", "BMW", "Bentley", "Buick", "Cadillac", "Chevrolet", "Chrysler", "Dodge", "Fiat" , "Ford", "GMC", "Genesis", "Honda", "Hyundai", "Infiniti", "Jaguar", "Jeep", "Kia", "Land Rover", "Lexus", "Lincoln", "Lotus", "Maserati", "Mazda", "Mercedes-Benz", "Mercury", "Mini", "Mitsubishi", "Nikola", "Nissan", "Polestar", "Pontiac", "Porche", "Ram", "Rivian", "Rolls-Royce", "Saab", "Saturn", "Scion", "Smart", "Subaru", "Suzuki", "Tesla", "Toyota", "Volkswagen", "Volvo"]
ceos=["Jones", "Kuniskis", "Duesmann", "Krueger", "Durheimer", "Akerson", "Carlisle", "Barra", "Manley", "Kuniskis", "Manley", "Farley", "Barra", "England", "Hachigo", "Eui-sun", "Walsh", "Bollore", "Manley", "Sung", "Speth", "Templin", "Falocito", "Popham", "Grasso", "Marumoto", "Psillakis", "Whineray", "Schwarzenbauer", "Masuko", "Russel", "Uchida", "Ingenlath", "Henderson", "Blume", "Bigland", "Scaringe", "East", "Johanasson","Sonnenmoser", "Bronstein", "Winkler", "Nakamura", "Suzuki", "Musk","Diess", "Samuelsson", "Lundstedt"]
for i in range(len(companyNames)):
    companyBase+="\n"
    companyBase+="('"+companyNames[i] +"', "+ str(i+1) + ", '" +ceos[i]+"')"
    if(i==len(companyNames)-1):
        companyBase+=";"
    else:
        companyBase+=","
data.write(companyBase)
data.write("\n ")
print(time.perf_counter())
#Car Models
carModelBase="INSERT INTO carModels(carID, carName, companyName, msrp, type) VALUES" 
Acura=["Acura", "ILX 25950 compact", "TLX 37500 sedan", "RLX 54900 sedan", "RDX 38200 crossover", "MDX 44500 suv", "NSX 157500 supercar"]
Alfa=["Alfa Romeo", "Stelvio 41400 suv", "Guilia 39400 sedan", "4C_Spider 67150 sport", "Stelvio_Quadrigoglio 80500 suv", "Guilia_Quadrifoglio 74500 sedan" ]
Audi=["Audi", "A3 33300 sedan", "S3 43000 sedan", "RS3 56200 sedan", "A4 39100 sedan", "S4 49900 sedan", "A5 41800 Sportback", "RS5 75400 Sportback", "A6 54900 sedan", "S6 74400 sedan", "Q3 34000 crossover", "Q5 43300 suv", "Q7 54950 suv", "Q8 68200 suv", "e-tron 65900 suv", "TT 49800 coupe", "R8 169900 coupe"]
BMW=["BMW", "2_series 36895 sedan", "3_series 42245 sedan", "4_series 46595 sedan", "5_series 55195 sedan", "7_series 87795 sedan", "8_series 85995 sedan", "i3 45445 coupe", "i8 148495 sports", "m2 59895 sedan", "m4 70145 sedan", "m5 104495 sedan", "m8 130995 convertible", "x1 36395 suv", "X2 37595 suv", "x3 43995 suv", "x4 52595 suv", "x5 60395 suv", "x6 66045 suv", "x7 75895 suv"] 
Bentley=["Bentley", "Bentayga 160000 suv", "Mulsanne 310800 sedan", "Continental 202500 2doorSedan", "Flying_Spur 216700 sedan","mulliner 2000000 sports_car" ]
Buick=["Buick", "Encore 25095 crossover", "Encore_GX 27000 crossover", "Envision 36295 suv", "Enclave 42495 suv", "Enclave 53800 Avenir"]
Cadillac=["Cadillac", "XT4 35795 suv", "XT5 43995 suv", "XT6 47995 suv", "Escalade 75195 suv", "CT4 76195 sedan", "CT4-V 44495 sedan", "CT5 36895 sedan", "CT5-V 47695 sedan"]
Chevrolet=["Chevrolet", "Spark 13400 sedan", "Sonic 16720 sedan", "Malibu 22095 sedan", "Impala 31620 sedan", "Bolt_Ev 36620 coupe", "Camaro 25000 sedan", "Corvette_Stingray 58900 sport", "Trailblazer 19000 suv", "Trax 213000 suv", "Equinox 23800 suv", "Blazer 28800 suv", "Traverse 29800 suv", "Tahoe 49000 suv", "Suburban 51700 suv", "Colorado 25200 truck", "silverado 28500 truck", "Silverado_HD 34600 truck"]
Chrysler =["Chrysler", "Pacifica 31609 suv", "Pacifica_Hybrid 38100 suv", "300 28285 sedan", "Voyager 26985 suv"]
Dodge = ["Dodge", "Charger 29995 sedan", "Challenger 28095 sedan", "Durango 31765 suv", "Journey 22465 suv", "Grand_Caravan 27530 suv"]
Fiat = ["Fiat", "500X 23340 coupe", "500L 22500 coupe", "124_Spider 25390 convertible", "500 16495 coupe"]
Ford = ["Ford", "EcoSport 19995 crossover", "Escape 24885 suv", "Bronco_Sport 26660 suv", "Edge 31100 suv", "Explorer 32225 suv", "Expedition 52810 suv", "Ranger 24410 truck", "Transit_Connect 27020 van", "F-150 28940 truck", "Super_Duty 34230 truck", "transit 40180 van", "Fusion 23170 sedan", "Mustang 26670 sport", "Fusion_Hybrid 28000 sedan", "Escape_Hybrid 28265 crossover", "Fusion_Engergi 35000 sedan", "Explorer_Hybrid 48380 suv", "Edge_ST 43265 suv", "Explorer_ST 52605 suv", "Mustang_Shelby_GT350 60440 sport"]
GMC= ["GMC", "Canyon 26400 truck", "Sierra_1500 29600 truck", "Sierra_Heavy 40000 truck", "Terrain 25000 suv", "Arcadia 29800 suv", "Yukon 50700 suv", "Terrain_Denali 38300 suv", "Arcadia_Denali 46300 suv", "Canyon_Denali 40900 truck", "Sierra_denali 54700 truck", "Yukon_Delani 68400 suv"]
Genesis = ["Genesis", "G70 36000 sedan", "G80 42550 sedan", "G90 72950 sedan"]
Honda=["Honda", "HR-V 21020 crossover", "CR-V 25350 suv", "CR-V_Hybrid 27850 suv", "Pilot 32250 suv", "Passport 32590 suv", "Civic 21050 sedan", "Insight 22930 sedan", "Accord 24770 sedan", "Civic_Si 25200 sedan", "Accord_Hybrid 26370 sedan", "Clarity_Hybrid 33400 sedan", "Fit 16190 hatchback", "Civic_Hatchback 22000 hatchback", "Civic_type_R 37495 hatchback", "Civic_coupe 21050 coupe", "Odyssey 31790 minivan", "Ridgeline 33900 truck", "Insight 22930 sedan", "Accord_hybrid 26370 sedan", "CR-V_Hybrid 26370 sedan", "Clairty_PlugIn_Hybrid 33400 sedan"]
Hyundai=["Hyundai", "Venue 18750 suv", "Kona 20400 suv", "Kona_Electric 20400 suv", "Tuscon 23700 suv", "Santa_fe 26275 suv", "Palisade 32525 suv", "Nexo 58735 suv", "Accent 15395 sedan", "Elantra 19650 sedan", "Sonata 23600 sedan", "Sonata_Hybrid 27750 sedan", "Sonata_PlugIn_hybrid 33400 sedan", "Ioniq_Hybrid 23200 compact", "Ioniq_PlugIn_Hybrid 26500 compact", "Ioniq_electric 33045 compact", "Veloster 32250 compact"]
Infiniti=["Infiniti", "Q50 36600 sedan", "Q60 41650 sedan", "QX50 37950 suv", "QX60 44350 suv", "QX80 69050 suv"] 
Jaguar=["Jaguar", "F-Pace 45200 suv", "E-Pace 39950 suv", "I-Pace 69850 suv", "F-Type 61600 sport", "XE 39900 sedan", "XF 43995 suv"]
Jeep=["Jeep", "Wrangler 28315 truck", "Grand_Chrokee 31489 suv", "Cherokee 25296 suv", "Compass 22718 suv", "Renegade 21395 crossover", "Gladiator 31529 truck"]
Kia=["Kia", "Soul 17490 crossover", "Seltos 21990 suv", "Sportage 23990 suv", "Niro 24590 suv", "Sorento 29390 suv", "Telluride 31990 suv", "Rio 15850 sedan", "Forte 17890 sedan", "K5 23490 sedan", "Stinger 33090 sedan", "Cadenza 37850 sedan", "K9000 59900 sedan", "Niro 24590 crossover", "Niro_PlugIn_Hybrid 29490 crossover", "Niro_Ev 39090 crossover", "Sorento-Hybrid 33590 suv"]
Lexus=["Lexus", "IS 39000 sedan", "ES 39900 sedan", "ES_Hybrid 41810 sedan", "GS 51065 sedan", "GS_F 85010 sedan", "LS 76000 sedan", "UX 32900 suv", "UX_Hybrid 35100 suv", "NX 37510 suv", "NX_Hybrid 40060 suv", "RX 45070 suv", "RX_Hybrid 47720 suv", "GX 53100 suv", "LX 86580 suv", "RC 42120 coupe", "LC 92950 sedan", "LC 101000 convertible", "RC-F 65875 sport", "GS-F 85010 sedan", "LC 92950 sport"]
Lincoln=["Lincoln", "Navigator 76185 suv", "Aviator 51500 suv", "Nautilus 41040 suv", "Carsair 35945 suv", "Continental 46305 sedan", "MKZ 36750 sedan"] 
Maserati=["Maserati", "Ghibli 74390 sedan", "Levante 77890 suv", "Quattroporte 104390 sedan", "GT-Convertible 150980 convertible"]
Mazda=["Mazda", "CX-3 20640 crossover", "CX-30 21900 suv", "CX-5 25270 suv", "CX-9 33960 suv", "3 20500 sedan", "6 24325 sedan", "MX-5_Miata 26580 convertible"]
MercedesBenz=["Mercedes-Benz", "GLA_SUV 36230 sedan", "GLB_SUV 38050 suv", "GLC_SUV 43200 suv", "GLC_Coupe 51650 suv", "GLE_Suv 54750 suv", "GLE_Coupe 76500 coupe", "GLS_SUV 76000 suv", "A-Class 33650 sedan", "C-Class 41600 sedan", "E-Class 54250 sedan", "S-Class 94250 sedan", "C-Class_Cabriolet 54700 convertible", "E-Class_Cabriolet 71950 sedan", "S-Class_Cabriolet 138600 convertible"] 
Mini=["Mini", "HardTop_2_Door 22400 coupe", "HardTop_4_door 23900 coupe", "Countryman 22400 coupe", "Clubman 29900 coupe", "Convertible 27400 convertible" ] 
Mitsubishi=["Mitsubishi", "Outlander 24895 crossover", "Eclipse_Cross 22995 crossover", "Outlander_Sport 22995 crossover", "Mirage_G4 14995 coupe", "Mirage 14295 coupe"]
Nissan=["Nissan", "Kicks 19070 crossover", "Rogue 25650 suv", "Murano 31730 crossover", "Pathfinder 31980 suv", "Armada 47500 suv", "Versa 14390 sedan", "Sentra 19410 sedan", "Altima 24300 sedan", "Maxima 36990 sedan", "Leaf 31600 sedan", "Frontier 26790 truck", "Titan 36550 truck" , "37OZ 30090 sport", "GT-R 113540 sport"]
Porche=["Porche", "718 59900 sport", "911 99200 sport", "Taycan 103800 sport", "Panamera 87200 sport", "Macan 52100 suv", "Cayanne 67500 suv"] 
RollsRoyce=["Rolls-Royce", "Phantom 455000 sedan", "Cullinan 330000 sedan", "Ghost 311900 sedan", "Wraith 330000 sedan", "Dawn 356500 convertible"]
Subaru=["Subaru", "Impreza 18795 sedan", "Legacy 22895 sedan", "Crosstrek 22245 crossover", "Crosstrek_Hybrid 35145 crossover", "Forester 24795 suv", "Outback 26795 suv", "Ascent 32295 suv", "BRZ 28845 sedan", "WRX 27495 sedan"]  
Tesla=["Tesla", "Model_S 69420 sedan", "Model_3 37990 sedan", "Model_Y 49990 suv", "Model_X 73190 suv"] 
Toyota=["Toyota", "Camry 24970 sedan", "Yaris 15650 sedan", "Corolla 19925 sedan", "Prius 24525 compact", "Avalon 35875 sedan", "Mirai 58550 sedan", "Sienna 34460 minivan", "Tacoma 26150 truck", "Tundra 33675 truck", "Highlander 34810 suv", "C-HR 21445 suv", "Rav4 26050 suv", "Venza 32470 suv", "4Runner 36340 suv", "Sequoia 50100 suv"] 
Volkswagen=["Volkswagen", "ID.4 39995 suv", "Atlas 31555 suv", "Tiguan 25245 suv", "Jetta 18895 sedan", "Passat 22995 sedan", "Arteon 35995 sedan", "Golf 23195 sedan", "Golf_GTI 28595 crossover"]
Volvo=["Volvo", "XC40 53990 suv", "XC90 63450 suv", "S90 60050 sedan", "S60 47650 sedan", "V60 67300 crossover"]

cars=[Acura, Alfa, Audi, BMW, Bentley, Buick, Cadillac, Chevrolet, Chrysler, Dodge, Fiat, Ford, GMC, Genesis, Honda, Hyundai, Infiniti, Jaguar, Jeep, Kia, Lexus, Lincoln, Maserati, Mazda, MercedesBenz, Mini, Mitsubishi, Nissan, Porche, RollsRoyce, Subaru, Tesla, Toyota, Volkswagen, Volvo]
prices=[0]
for j in range(1000000):
    carModelBase+="\n"
    company=random.randrange(0,len(cars))
    compName=cars[company][0]
    carInfo=random.randrange(1, len(cars[company]))
    infoArr=cars[company][carInfo].split()
    name=infoArr[0]

    price=infoArr[1]
    prices.append(float(price))
    type= infoArr[2]
    carModelBase+="("+ str(j+1)+ ", '" + name + "', '" + compName+ "', " +price +", '"+type+"')"
    if j==1000000-1:
        carModelBase+=";"
    else:
        carModelBase+="," 
carModelBase+="\n"
data.write(carModelBase)
data.write("\n ")

print(time.perf_counter())
#Purchases 

purchaseBase="INSERT INTO purchases(purchaserName, purchaseID, carID, amountPaid, leaseOrBuy, dateOfPurchase) VALUES" 
carIds=random.sample(range(150001),150000)
ways=["lease", "buy"]
for i in range(150000): 
    name=names.get_full_name()
    purchaseBase+="\n"
    variance=random.randrange(-10, 6)
    payment=float(prices[carIds[i]])+(prices[carIds[i]]*float(variance)*.01)
    way=random.choice(ways)
    month=random.choice(["01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"])
    year="2019"
    day=random.choice(["01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28"])
    date=year+"-"+month+"-"+day
    purchaseBase+="('"+ str(name)+ "', " + str(i+1) + ", " + str(carIds[i])+ ", " +str(payment)+", '"+ str(way) +"', '" + str(date) +"')"
    if(i==150000-1):
        purchaseBase+=";"
    else:
        purchaseBase+=","
data.write(purchaseBase)
data.write("\n ")
print(time.perf_counter())
#Sales
salesBase="INSERT INTO sales(sellerName, saleId, carID, saleDeal, dateOfSale) VALUES"
carIds2=random.sample(range(100001),100000)
for i in range(100000):
    name=names.get_full_name()
    salesBase+="\n"
    month=random.choice(["01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"])
    year="2019"
    day=random.choice(["01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28"])
    date=year+"-"+month+"-"+day
    variance=random.randrange(-15, 1)
    payment=float(prices[carIds[i]])+(prices[carIds[i]]*float(variance)*.01)
    salesBase+="('"+ str(name)+ "', " + str(i+1) + ", " + str(carIds2[i])+ ", " +str(payment)+", '" + str(date) +"')"
    if(i==100000-1):
        salesBase+=";"
    else:
        salesBase+=","
data.write(salesBase)
print(time.perf_counter())
#Employees
employeeBase="INSERT INTO Employees(employeeName, employeeID, jobTitle, hourlyPay, hoursWorked, totalPay) VALUES"
jobs=["Manager", "Dealer", "Financer", "Cleaner"]
for i in range(100):
    name=names.get_full_name()
    if(i%15==0):
        job=jobs[0]
        hourlyPay=50
    elif(i%2==0):
        job=jobs[1]
        hourlyPay=37
    elif(i%7==0):
        job=jobs[3]
        hourlyPay=15
    else:
        job=jobs[2]
        hourlyPay=32
    avg=1812
    variance=random.randrange(-15, 15)
    hours=float(avg)+float(variance*.01*avg)
    totalPay=float(hours)*float(hourlyPay)
    employeeBase+="\n"
    employeeBase+="('"+name+"', "+str(i+1)+", '"+job+"', "+str(hourlyPay)+", "+str(hours)+", "+ str(totalPay)+ ")"
    if(i==100-1):
        employeeBase+=";"
    else:
        employeeBase+=","
data.write(employeeBase)
data.write("\n ")
print(time.perf_counter())
#testDrive

testdriveBase="INSERT INTO testDrives(driverName, driverID, driverEmail, driverPhone, driverAge, carID, dateOfDrive, timeOfDrive, employeeID, testDriveId) VALUES"
for i in range(1000):
    name=names.get_full_name()
    username=''.join(random.choice(string.ascii_letters) for x in range(7))
    email=username+"@gmail.com"
    phone="555"+str(random.randrange(1000, 9999))
    age=random.randrange(18, 85)
    driverID=random.randrange(100000, 999999)
    carID=random.randrange(1,1000000)
    month=random.choice(["01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"])
    year="2019"
    day=random.choice(["01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28"])
    date=year+"-"+month+"-"+day
    hour=random.choice(["09", "10", "11", "12", "13", "14", "15", "16", "17", "18"])
    minute=random.choice(["00", "15", "30", "45"])
    time=hour+":"+minute+":00"
    employeeId=random.choice([0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 92, 94, 96, 98, 100])
    testdriveBase+="\n"
    testdriveBase+="('"+str(name)+"', "+str(driverID)+", '"+str(email)+"', "+str(phone)+", "+str(age)+", "+ str(carID)+", '"+date+"', '"+time+"', "+ str(employeeId)+ ", "+str(i)+")"
    if(i==100-1):
        testdriveBase+=";"
    else:
        testdriveBase+=","
data.write(testdriveBase)
time.perf_counter()

#Service Cars

serviceBase="INSERT INTO serviceCars(problem, appointmentId, carID, timeOfService, dateOfService, customerName, estimatedCost) VALUES"

for i in range(1000):
    name=names.get_full_name()
    problemIndex=random.randrange(0, 6)
    possibilities=["Flat Tire", "Engine Problems", "Broken Windshield", "Scratch", "Paint Chip", "Software Bug"]
    problems=possibilities[problemIndex]
    payments=["50", "5000", "100", "500", "300", "0"]
    carID=random.randrange(0, 1500000)
    hour=random.choice(["09", "10", "11", "12", "13", "14", "15", "16", "17", "18"])
    minute=random.choice(["00", "15", "30", "45"])
    time=hour+":"+minute+":00"
    month=random.choice(["01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"])
    year="2019"
    day=random.choice(["01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28"])
    cost=payments[problemIndex]
    date=year+"-"+month+"-"+day
    serviceBase+="\n"
    serviceBase+="('"+problems+"', "+str(i)+", "+carID+", '"+time+"', '"+date+"', '"+ name+"', "+str(cost)+")"
    if(i==100-1):
        serviceBase+=";"
    else:
        serviceBase+=","
data.write(serviceBase)
time.perf_counter()