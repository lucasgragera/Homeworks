package models;

import java.util.Objects;

final public class Wheel {
    public static final int COUNT_OF_CARS = 10;
    private int size;
    private String brand;

    public Wheel(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return size == wheel.size &&
                Objects.equals(brand, wheel.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, brand);
    }
}