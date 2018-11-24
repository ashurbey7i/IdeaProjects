package online.shop;

import java.util.List;
import java.util.Objects;

public class Basket {
    private List<Product> boughtProductList;

    public Basket(List<Product> boughtProductList) {
        this.boughtProductList = boughtProductList;
    }

    public Basket() {

    }

    public List<Product> getBoughtProductList() {
        return boughtProductList;
    }

    public void setBoughtProductList(List<Product> boughtProductList) {
        this.boughtProductList = boughtProductList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Basket)) return false;
        Basket basket = (Basket) o;
        return Objects.equals(getBoughtProductList(), basket.getBoughtProductList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBoughtProductList());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Basket{");
        sb.append("boughtProductList=").append(boughtProductList);
        sb.append('}');
        return sb.toString();
    }
}
