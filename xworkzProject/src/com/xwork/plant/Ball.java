package com.xwork.plant;

public class Ball {
        // Instance variables
        private String brand;
        private String type;
        private double diameter;
        private double weight;
        private String material;
        private String color;
        private boolean isInflatable;
        private int circumference;
        private int bounceHeight;
        private int durability;
        private String design;
        private int surfaceTexture;
        private boolean isUsedInGames;
        private int numberOfPanels;
        private String intendedUse;
        private double pressure;
        private String manufacturingCountry;
        private boolean hasGrip;
        private String season;
        private double cost;
        private String shape;
        private String pattern;
        private boolean isLimitedEdition;
        private double warrantyPeriod;
        private String qualityRating;

        public Ball(String brand, String type, double diameter, double weight, String material, String color, boolean isInflatable, int circumference) {
            this.brand = brand;
            this.type = type;
            this.diameter = diameter;
            this.weight = weight;
            this.material = material;
            this.color = color;
            this.isInflatable = isInflatable;
            this.circumference = circumference;
            System.out.println("Constructor with brand and type");
        }

        public void setDiameter(double diameter) {
            this.diameter = diameter;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setIsInflatable(boolean isInflatable) {
            this.isInflatable = isInflatable;
        }

        public void setCircumference(int circumference) {
            this.circumference = circumference;
        }

        public void setBounceHeight(int bounceHeight) {
            this.bounceHeight = bounceHeight;
        }

        public void setDurability(int durability) {
            this.durability = durability;
        }

        public void setDesign(String design) {
            this.design = design;
        }

        public void setSurfaceTexture(int surfaceTexture) {
            this.surfaceTexture = surfaceTexture;
        }

        public void setIsUsedInGames(boolean isUsedInGames) {
            this.isUsedInGames = isUsedInGames;
        }

        public void setNumberOfPanels(int numberOfPanels) {
            this.numberOfPanels = numberOfPanels;
        }

        public void setIntendedUse(String intendedUse) {
            this.intendedUse = intendedUse;
        }

        public void setPressure(double pressure) {
            this.pressure = pressure;
        }

        public void setManufacturingCountry(String manufacturingCountry) {
            this.manufacturingCountry = manufacturingCountry;
        }

        public void setHasGrip(boolean hasGrip) {
            this.hasGrip = hasGrip;
        }

        public void setSeason(String season) {
            this.season = season;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        public void setShape(String shape) {
            this.shape = shape;
        }

        public void setPattern(String pattern) {
            this.pattern = pattern;
        }

        public void setIsLimitedEdition(boolean isLimitedEdition) {
            this.isLimitedEdition = isLimitedEdition;
        }

        public void setWarrantyPeriod(double warrantyPeriod) {
            this.warrantyPeriod = warrantyPeriod;
        }

        public void setQualityRating(String qualityRating) {
            this.qualityRating = qualityRating;
        }

        // Method to display details of the ball
        public void details() {
            System.out.println("Brand: " + this.brand);
            System.out.println("Type: " + this.type);
            System.out.println("Diameter: " + this.diameter + " cm");
            System.out.println("Weight: " + this.weight + " g");
            System.out.println("Material: " + this.material);
            System.out.println("Color: " + this.color);
            System.out.println("Inflatable: " + this.isInflatable);
            System.out.println("Circumference: " + this.circumference + " cm");
            System.out.println("Bounce Height: " + this.bounceHeight + " cm");
            System.out.println("Durability: " + this.durability);
            System.out.println("Design: " + this.design);
            System.out.println("Surface Texture: " + this.surfaceTexture);
            System.out.println("Used in Games: " + this.isUsedInGames);
            System.out.println("Number of Panels: " + this.numberOfPanels);
            System.out.println("Intended Use: " + this.intendedUse);
            System.out.println("Pressure: " + this.pressure + " PSI");
            System.out.println("Manufacturing Country: " + this.manufacturingCountry);
            System.out.println("Has Grip: " + this.hasGrip);
            System.out.println("Season: " + this.season);
            System.out.println("Cost: $" + this.cost);
            System.out.println("Shape: " + this.shape);
            System.out.println("Pattern: " + this.pattern);
            System.out.println("Limited Edition: " + this.isLimitedEdition);
            System.out.println("Warranty Period: " + this.warrantyPeriod + " years");
            System.out.println("Quality Rating: " + this.qualityRating);
        }

        public static void main(String[] args) {

            Ball ball2 = new Ball("tennies", "round", 3.6, 6.7, "leather", "Green", false, 8);
            ball2.setColor("Orange");
            ball2.setDiameter(24.0);
            ball2.setWeight(600.0);
            ball2.setMaterial("Rubber");
            ball2.setIsInflatable(true);
            ball2.setCircumference(75);
            ball2.setBounceHeight(70);
            ball2.setDurability(8);
            ball2.setDesign("Modern");
            ball2.setSurfaceTexture(5);
            ball2.setIsUsedInGames(true);
            ball2.setNumberOfPanels(8);
            ball2.setIntendedUse("Indoor");
            ball2.setPressure(9.0);
            ball2.setManufacturingCountry("China");
            ball2.setHasGrip(true);
            Ball[] balls = new Ball[1];
            balls[0] = ball2;
            for (Ball bat : balls) {
                System.out.println("================");
                // System.out.println(ref);
                bat.details();
            }
        }

}
