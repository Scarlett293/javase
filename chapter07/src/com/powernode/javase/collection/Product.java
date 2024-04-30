package com.powernode.javase.collection;

/**
 * @author :29369
 * @Package: com.powernode.javase.collection
 * @ClassName: Product
 * @Date: 2024/4/17 17:08 30
 */
public class Product implements MyComparable<Product>{

    // 单价
    private int price;

    public Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        // 编写一个比较规则
        return this.price - o.price;
    }

    public static void main(String[] args) {
        Product p1 = new Product(7);
        Product p2 = new Product(6);

        System.out.println(p1.compareTo(p2));
    }
}
