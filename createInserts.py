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
