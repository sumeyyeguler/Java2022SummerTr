package day25_constructor;


public class Dog {

      private int numTeeth;
     int numWhiskers;
     int weight;


    public Dog(int weight) {
        this(weight, 16);  // calls constructor with 2 parameters
    }

    public Dog(int weight, int numTeeth) {
        this(weight, numTeeth, 6);  // calls constructor with 3 parameters
    }

    public Dog(int weight, int numTeeth, int numWhiskers) {
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
    }

    public void print() {
        System.out.println(weight + " " + numTeeth + " " + numWhiskers);
    }

    public static void main(String[] args) {
        Dog mouse = new Dog(15);
        mouse.print();
        deneme obj3=new deneme();

    }
}

