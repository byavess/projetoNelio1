package Stream.Exercicio;

public class ProducExercio1 {

    private  String name;
    private Double price;

    public ProducExercio1(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String toString(){
        return  name + ", " + String.format("%.2f", price);
    }
}
