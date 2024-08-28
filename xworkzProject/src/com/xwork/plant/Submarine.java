package com.xwork.plant;

public class Submarine {

        private String name;
        private String type;
        private double length;
        private double displacement;
        private int crew;
        private String propulsionType;
        private double maxSpeed;
        private double depth;
        private String hullMaterial;
        private double weight;
        private int range;
        private boolean isNuclearPowered;
        private String countryOfOrigin;
        private int torpedoCount;
        private String radarType;
        private double sonarRange;
        private int missileCount;
        private double endurance;
        private String color;
        private int constructionYear;
        private int numberOfDecks;
        private String manufacturer;
        private boolean hasStealthTechnology;
        private String electronicWarfareSystem;
        private double fuelCapacity;
        private String communicationSystem;
        private String periscopeType;
        private double width;
        private int compartments;
        private String armamentType;
        private boolean isOperational;
        private double height;
        private int escapeHatchCount;
        private String radarSignature;
        private double enginePower;
        private boolean hasEscapePod;
        private double batteryCapacity;
        private String sonarType;
        private boolean hasMineLayingCapability;
        private double lifeSupportDuration;

        // Constructor initializing 5 instance variables
        public Submarine(String name, String type, double length, double displacement, int crew) {
            this.name = name;
            this.type = type;
            this.length = length;
            this.displacement = displacement;
            this.crew = crew;
        }



        // Methods to set the remaining 35 instance variables
        public void setPropulsionType(String propulsionType) {
            this.propulsionType = propulsionType;
        }
        public void setMaxSpeed(double maxSpeed) {
            this.maxSpeed = maxSpeed;
        }
        public void setDepth(double depth) {
            this.depth = depth;
        }
        public void setHullMaterial(String hullMaterial) {
            this.hullMaterial = hullMaterial;
        }
        public void setWeight(double weight) {
            this.weight = weight;
        }
        public void setRange(int range) {
            this.range = range;
        }
        public void setIsNuclearPowered(boolean isNuclearPowered) {
            this.isNuclearPowered = isNuclearPowered;
        }
        public void setCountryOfOrigin(String countryOfOrigin) {
            this.countryOfOrigin = countryOfOrigin;
        }
        public void setTorpedoCount(int torpedoCount) {
            this.torpedoCount = torpedoCount;
        }
        public void setRadarType(String radarType) {
            this.radarType = radarType;
        }
        public void setSonarRange(double sonarRange) {
            this.sonarRange = sonarRange;
        }
        public void setMissileCount(int missileCount) {
            this.missileCount = missileCount;
        }
        public void setEndurance(double endurance) {
            this.endurance = endurance;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public void setConstructionYear(int constructionYear) {
            this.constructionYear = constructionYear;
        }
        public void setNumberOfDecks(int numberOfDecks) {
            this.numberOfDecks = numberOfDecks;
        }
        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }
        public void setHasStealthTechnology(boolean hasStealthTechnology)
        { this.hasStealthTechnology = hasStealthTechnology;
        }
        public void setElectronicWarfareSystem(String electronicWarfareSystem) {
            this.electronicWarfareSystem = electronicWarfareSystem;
        }
        public void setFuelCapacity(double fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
        }
        public void setCommunicationSystem(String communicationSystem) {
            this.communicationSystem = communicationSystem;
        }
        public void setPeriscopeType(String periscopeType) {
            this.periscopeType = periscopeType;
        }
        public void setWidth(double width) {
            this.width = width;
        }
        public void setCompartments(int compartments) {
            this.compartments = compartments;
        }
        public void setArmamentType(String armamentType) {
            this.armamentType = armamentType;
        }
        public void setIsOperational(boolean isOperational) {
            this.isOperational = isOperational;
        }
        public void setHeight(double height) {
            this.height = height;
        }
        public void setEscapeHatchCount(int escapeHatchCount) {
            this.escapeHatchCount = escapeHatchCount;
        }
        public void setRadarSignature(String radarSignature) {
            this.radarSignature = radarSignature;
        }
        public void setEnginePower(double enginePower) {
            this.enginePower = enginePower;
        }
        public void setHasEscapePod(boolean hasEscapePod) {
            this.hasEscapePod = hasEscapePod;
        }
        public void setBatteryCapacity(double batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
        }
        public void setSonarType(String sonarType) {
            this.sonarType = sonarType;
        }
        public void setHasMineLayingCapability(boolean hasMineLayingCapability) {
            this.hasMineLayingCapability = hasMineLayingCapability;
        }
        public void setLifeSupportDuration(double lifeSupportDuration) {
            this.lifeSupportDuration = lifeSupportDuration;
        }

        // Method to print the instance variables
        public void printSubmarineDetails() {
            System.out.println("Submarine [Name: " + name + ", Type: " + type + ", Length: " + length + "m, Displacement: " + displacement + " tons, Crew: " + crew +
                    ", Propulsion Type: " + propulsionType + ", Max Speed: " + maxSpeed + " knots, Depth: " + depth + "m, Hull Material: " + hullMaterial +
                    ", Weight: " + weight + " tons, Range: " + range + " nautical miles, Is Nuclear Powered: " + isNuclearPowered + ", Country Of Origin: " + countryOfOrigin +
                    ", Torpedo Count: " + torpedoCount + ", Radar Type: " + radarType + ", Sonar Range: " + sonarRange + "km, Missile Count: " + missileCount +
                    ", Endurance: " + endurance + " days, Color: " + color + ", Construction Year: " + constructionYear + ", Number Of Decks: " + numberOfDecks +
                    ", Manufacturer: " + manufacturer + ", Has Stealth Technology: " + hasStealthTechnology + ", Electronic Warfare System: " + electronicWarfareSystem +
                    ", Fuel Capacity: " + fuelCapacity + " liters, Communication System: " + communicationSystem + ", Periscope Type: " + periscopeType +
                    ", Width: " + width + "m, Compartments: " + compartments + ", Armament Type: " + armamentType + ", Is Operational: " + isOperational +
                    ", Height: " + height + "m, Escape Hatch Count: " + escapeHatchCount + ", Radar Signature: " + radarSignature + ", Engine Power: " + enginePower +
                    ", Has Escape Pod: " + hasEscapePod + ", Battery Capacity: " + batteryCapacity + "kWh, Sonar Type: " + sonarType +
                    ", Has Mine Laying Capability: " + hasMineLayingCapability + ", Life Support Duration: " + lifeSupportDuration + " days]");
        }

        public static void main (String[] args) {
            Submarine sub1 = new Submarine("Nautilus", "Attack", 70.5, 7000, 100);
            Submarine sub2 = new Submarine("Typhoon", "Ballistic", 175.0, 24000, 160);
            Submarine sub3 = new Submarine("Scorpion", "Hunter-Killer", 90.0, 8500, 120);

            sub1.setPropulsionType("Nuclear");
            sub1.setMaxSpeed(30);
            sub1.setDepth(400);
            sub1.setHullMaterial("Steel");
            sub1.setWeight(7000);
            sub1.setRange(12000);
            sub1.setIsNuclearPowered(true);
            sub1.setCountryOfOrigin("USA");
            sub1.setTorpedoCount(20);
            sub1.setRadarType("Active Sonar");
            sub1.setSonarRange(50);
            sub1.setMissileCount(12);
            sub1.setEndurance(90);
            sub1.setColor("Black");
            sub1.setConstructionYear(1980);
            sub1.setNumberOfDecks(2);
            sub1.setManufacturer("Electric Boat Company");
            sub1.setHasStealthTechnology(true);
            sub1.setElectronicWarfareSystem("Advanced");
            sub1.setFuelCapacity(50000);
            sub1.setCommunicationSystem("Satellite");
            sub1.setPeriscopeType("Digital");
            sub1.setWidth(10);
            sub1.setCompartments(8);
            sub1.setArmamentType("Torpedo");
            sub1.setIsOperational(true);
            sub1.setHeight(20);
            sub1.setEscapeHatchCount(4);
            sub1.setRadarSignature("Low");
            sub1.setEnginePower(30000);
            sub1.setHasEscapePod(true);
            sub1.setBatteryCapacity(1000);
            sub1.setSonarType("Passive");
            sub1.setHasMineLayingCapability(false);
            sub1.setLifeSupportDuration(90);

            sub2.setPropulsionType("Diesel-Electric");
            sub2.setMaxSpeed(25);
            sub2.setDepth(500);
            sub2.setHullMaterial("Titanium");
            sub2.setWeight(24000);
            sub2.setRange(15000);
            sub2.setIsNuclearPowered(false);
            sub2.setCountryOfOrigin("Russia");
            sub2.setTorpedoCount(16);
            sub2.setRadarType("Bistatic Sonar");
            sub2.setSonarRange(60);
            sub2.setMissileCount(20);
            sub2.setEndurance(120);
            sub2.setColor("Blue");
            sub2.setConstructionYear(1985);
            sub2.setNumberOfDecks(3);
            sub2.setManufacturer("Sevmash");
            sub2.setHasStealthTechnology(true);
            sub2.setElectronicWarfareSystem("Intermediate");
            sub2.setFuelCapacity(60000);
            sub2.setCommunicationSystem("HF Radio");
            sub2.setPeriscopeType("Optical");
            sub2.setWidth(12);
            sub2.setCompartments(10);
            sub2.setArmamentType("ICBM");
            sub2.setIsOperational(true);
            sub2.setHeight(24);
            sub2.setEscapeHatchCount(6);
            sub2.setRadarSignature("Very Low");
            sub2.setEnginePower(35000);
            sub2.setHasEscapePod(true);
            sub2.setBatteryCapacity(1500);
            sub2.setSonarType("Active");
            sub2.setHasMineLayingCapability(true);
            sub2.setLifeSupportDuration(120);

            sub3.setPropulsionType("Electric");
            sub3.setMaxSpeed(20);
            sub3.setDepth(300);
            sub3.setHullMaterial("Aluminum");
            sub3.setWeight(8500);
            sub3.setRange(8000);
            sub3.setIsNuclearPowered(false);
            sub3.setCountryOfOrigin("UK");
            sub3.setTorpedoCount(10);
            sub3.setRadarType("Monostatic Sonar");
            sub3.setSonarRange(40);
            sub3.setMissileCount(8);
            sub3.setEndurance(60);
            sub3.setColor("Gray");
            sub3.setConstructionYear(1990);
            sub3.setNumberOfDecks(2);
            sub3.setManufacturer("BAE Systems");
            sub3.setHasStealthTechnology(false);
            sub3.setElectronicWarfareSystem("Basic");
            sub3.setFuelCapacity(40000);
            sub3.setCommunicationSystem("UHF Radio");
            sub3.setPeriscopeType("Analog");
            sub3.setWidth(9);
            sub3.setCompartments(7);
            sub3.setArmamentType("Torpedo");
            sub3.setIsOperational(false);
            sub3.setHeight(18);
            sub3.setEscapeHatchCount(3);
            sub3.setRadarSignature("Moderate");
            sub3.setEnginePower(25000);
            sub3.setHasEscapePod(false);
            sub3.setBatteryCapacity(800);
            sub3.setSonarType("Hybrid");
            sub3.setHasMineLayingCapability(false);
            sub3.setLifeSupportDuration(60);

            // Creating an array to store all instances
            Object[] objects = { sub1, sub2, sub3};

            // Looping through the array and invoking the method to print the details
            for (Object obj : objects) {
                if (obj instanceof Submarine) {
                    ((Submarine) obj).printSubmarineDetails();
                }
            }

        }
}
