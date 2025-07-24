class Fruit {
    String name;
    String color;

    Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void display() {
        System.out.println("Fruit: " + name);
        System.out.println("Color: " + color);
    }

    void taste() {
        System.out.println(name + " tastes fresh!");
    }
}

class Apple extends Fruit {
    String type;

    Apple(String name, String color, String type) {
        super(name, color);
        this.type = type;
    }

    void display() {
        super.display();
        System.out.println("Type: " + type);
    }

    void taste() {
        System.out.println(name + " is sweet and crunchy!");
    }
}

class Mango extends Fruit {
    String season;

    Mango(String name, String color, String season) {
        super(name, color);
        this.season = season;
    }

    void display() {
        super.display();
        System.out.println("Season: " + season);
    }

    void taste() {
        System.out.println(name + " is juicy and delicious!");
    }
}

public class FruitBasket {
    public static void main(String[] args) {
        Fruit[] basket = new Fruit[3];

        basket[0] = new Apple("Apple", "Red", "Shimla");
        basket[1] = new Mango("Mango", "Yellow", "Summer");
        basket[2] = new Apple("Apple", "Green", "Granny Smith");

        System.out.println("Fruit Basket Contents:");
        for (int i = 0; i < basket.length; i++) {
            System.out.println("---- Fruit " + (i+1) + " ----");
            basket[i].display();
            basket[i].taste();
            System.out.println();
        }
    }
}
