package edu.navi.structuralDesignPatterns.Iterator;

import java.util.Iterator;

public class CarIterator implements Iterable<String> {

    private String[] cars;
    private int index;

    public CarIterator() {
        cars = new String[10];
        index = 0;
    }

    public void addCar(String car) {
        if(index == cars.length) {
            String[] newCarList = new String[cars.length + 5];
            System.arraycopy(cars, 0, newCarList, 0, cars.length);
            cars = newCarList;
        }
        cars[index] = car;
        index++;
    }


    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<String> iterator() {

        Iterator<String> carIterator = new Iterator<String>() {
            int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < cars.length && cars[currentIndex] != null;
            }

            @Override
            public String next() {
                return cars[currentIndex++];
            }

        };
        return carIterator;
    }
}
