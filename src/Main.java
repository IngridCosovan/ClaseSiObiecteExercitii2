public class Main {

    public static void main(String[] args) {
        Person fata = new Person("Diana", 22, 'F', "Suceava");

        Person baiat = new Person ("Radu", 25, 'M', "Arad");

        baiat.walk();
        baiat.eat();
        baiat.sleep();
        baiat.showDetails();

        fata.walk();
        fata.eat();
        fata.sleep();
        fata.showDetails();

        //..................

        Persoana pers1 = new Persoana("Emil", 185, 75);
        pers1.eat();
        pers1.eat();
        pers1.sleep();
        pers1.exercise();
        pers1.exercise();

        System.out.println(pers1);


        //.....................................................................
Car audi = new Car("Audi Q7", 2010);
audi.stopEngine();
audi.startEngine();

audi.stopEngine();
audi.printDetails();
    }
}

