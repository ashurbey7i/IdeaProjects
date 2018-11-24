package online.shop;

import java.util.Objects;

public class Product {
    private String nameOfProduct;
    private int yearOfProduct;
    private double mileage;
    private double engineCapacity;
    private double costOfProduct;
    private double ratingOfProduct;

    public Product(String nameOfProduct, int yearOfProduct, double mileage, double engineCapacity, double costOfProduct, double ratingOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.yearOfProduct = yearOfProduct;
        this.mileage = mileage;
        this.engineCapacity = engineCapacity;
        this.costOfProduct = costOfProduct;
        this.ratingOfProduct = ratingOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public int getYearOfProduct() {
        return yearOfProduct;
    }

    public void setYearOfProduct(int yearOfProduct) {
        this.yearOfProduct = yearOfProduct;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getCostOfProduct() {
        return costOfProduct;
    }

    public void setCostOfProduct(double costOfProduct) {
        this.costOfProduct = costOfProduct;
    }

    public double getRatingOfProduct() {
        return ratingOfProduct;
    }

    public void setRatingOfProduct(double ratingOfProduct) {
        this.ratingOfProduct = ratingOfProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (Double.compare(product.costOfProduct, costOfProduct) != 0) return false;
        if (ratingOfProduct != product.ratingOfProduct) return false;
        return nameOfProduct.equals(product.nameOfProduct);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nameOfProduct.hashCode();
        temp = Double.doubleToLongBits(costOfProduct);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = (int) (31 * result + ratingOfProduct);
        return result;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name: '" + nameOfProduct + '\'' +
                ", year: " + yearOfProduct +
                ", mileage: " + mileage +
                ", engine capacity: " + engineCapacity +
                ", price: " + costOfProduct +
                ", rating: " + ratingOfProduct +
                '}';
    }
}

