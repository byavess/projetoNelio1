package GenericSetMap.Generic;

public class Produto implements Comparable<Produto> {
    private String name;
    private Double price;

    public Produto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double buscarPreco() {
        return price;
    }

    public void alterarPrice(Double price) {
        this.price = price;
    }

    public Produto(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString(){
            return name + ", "+ String.format("%.2f", price);
    }

    @Override
    public int compareTo(Produto other) {
        alterarPrice(120d);
        return price.compareTo(other.buscarPreco());
    }
}
