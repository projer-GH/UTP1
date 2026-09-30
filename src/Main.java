//TODO: musimy dodać brakująe klasy!

//OK, ja dodam adder a s33647 doda 'Subtractor'.

public class Main {
    static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println(adder.add(1, 2));

        Subtractor subtractor = new Subtractor();

        System.out.println(subtractor.suntract(6, 3));
    }
}
