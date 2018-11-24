package online.shop;

import java.util.*;

public class Category {
    private String nameOfProduct;
    private List<Product> productList;

    public Category(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
        productList = new ArrayList<>();
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void addProducts(Collection<Product> products) {
        productList.addAll(products);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public void removeProducts(Collection<Product> products) {
        productList.removeAll(products);
    }

    public List<Product> sortByName() {
        Collections.sort(productList, Comparator.comparing(Product::getNameOfProduct));
        return productList;
    }

    public List<Product> reverseSortByName() {
        Collections.sort(productList, Collections.reverseOrder(Comparator.comparing(Product::getNameOfProduct)));
        return productList;
    }

    public List<Product> sortByPrice() {
        Collections.sort(productList, Comparator.comparing(Product::getCostOfProduct));
        return productList;
    }

    public List<Product> reverseSortByPrice() {
        Collections.sort(productList, Collections.reverseOrder(Comparator.comparing(Product::getCostOfProduct)));
        return productList;
    }

    public List<Product> sortByRating() {
        Collections.sort(productList, Comparator.comparing(Product::getRatingOfProduct));
        return productList;
    }

    public List<Product> reverseSortByRating() {
        Collections.sort(productList, Collections.reverseOrder(Comparator.comparing(Product::getRatingOfProduct)));
        return productList;
    }

    public List<Product> sortByEngine() {
        Collections.sort(productList, Comparator.comparing(Product::getEngineCapacity));
        return productList;
    }

    public List<Product> reverseSortByEngine() {
        Collections.sort(productList, Collections.reverseOrder(Comparator.comparing(Product::getEngineCapacity)));
        return productList;
    }

    public List<Product> sortByMileage() {
        Collections.sort(productList, Comparator.comparing(Product::getMileage));
        return productList;
    }

    public List<Product> reverseSortByMileage() {
        Collections.sort(productList, Collections.reverseOrder(Comparator.comparing(Product::getMileage)));
        return productList;
    }

    public List<Product> sortByYear() {
        Collections.sort(productList, Comparator.comparing(Product::getYearOfProduct));
        return productList;
    }

    public List<Product> reverseSortByYear() {
        Collections.sort(productList, Collections.reverseOrder(Comparator.comparing(Product::getYearOfProduct)));
        return productList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Category)) return false;

        Category category = (Category) o;

        if (!nameOfProduct.equals(category.nameOfProduct)) return false;
        return productList != null ? productList.equals(category.productList) : category.productList == null;
    }

    @Override
    public int hashCode() {
        int result = nameOfProduct.hashCode();
        result = 31 * result + (productList != null ? productList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name: '" + nameOfProduct + '\'' +
                ", itemList: " + productList +
                '}';
    }
}


