enum laptop {
    Macbook(2200), XPS(1800), Asus(1500), Rog(2000);

    private int price;

    private laptop(int price) {
        this.price = price;
        System.out.println("in laptops"+ " :" + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class enum2 {
    public static void main(String[] args) {
//        laptop lap = laptop.Asus;
//        System.out.println(lap + " " + lap.getPrice());
        for(laptop lap : laptop.values()){
            System.out.println(lap + " :" + lap.getPrice());
        }
    }
}


