package edu.navi.creationDesignPatterns.builder;

public class Car {
    private String brand;
    private int makeYear;

    public Car(Builder builder) {
        this.brand = builder.brand;
        this.makeYear = builder.makeYear;
        System.out.println("CAR OBJECT BUILT");
    }



    public static class Builder {
        private String brand;
        private int makeYear;

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder makeYear(int makeYear) {
            this.makeYear = makeYear;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
