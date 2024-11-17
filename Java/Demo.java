interface AnimalEat {
    void eat();
}
interface AnimalTravel {
    void travel();
}

class Animal implements AnimalEat, AnimalTravel {
    public void eat() {
        System.out.println("Animal eat");
    }
    public void travel() {
        System.out.println("Animal travel");
    }
}

    public class Demo {
        public static void main(String[] args) {
            Animal a = new Animal();
            a.eat();
            a.travel();
        }
    }