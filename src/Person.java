public class Person {

    String name;
    int age;
    char sex;
    String address;

    public Person(String name, int age, char sex, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;

    }

    public void walk(){
        System.out.println(this.name + " merge pe strada.");

    };
    public void eat(){
        System.out.println(this.name+" mananca.");
    };
    public void sleep(){
        System.out.println(this.name + " doarme pana tarziu");
    };

    public void showDetails(){
        System.out.println("Salut ma numesc " + this.name +", am " + this.age+ " ani, si locuiesc in " + this.address);
    }








    /* 1. Sa se creeze clasa Person, sa contina atributele/campurile name, age, sex, address si funtionalitatile/metodele walk()
eat(), sleep()
Creati 2 obiecte, un baiat si o fata, care sa acceseze aceleasi atrbute si metode, dar cu rezultate diferite. Metodele se vor afisa .
la consola un text corespunzator

Afisati ambele obiecte sub forma: "Salut ma numesc..., am ... ani,locuiesc in ...-accesand campurime
"jonhny merge pe strada" accesand metodele, "Mary doarme pana tarziu"-scrieti voi logica la celelalte metode.


2.  Creati clasa person cu urm fielduri: name, height, energy, weight,si urm functionlitati:ea, learn, sleep.
Fiecare metoda av schimba starea interna a persoanei. Creati un obiect de tip Person care va apela fiecare dintre cele 4
metode. Printati structura persoanei respective dupa apelarea fiecarie metode.

3. Creati clasa Car, cu urmatoarele campuri: String brand, int year, boolean on, si urm metdde: prin metodele
startEngine si stopEngine vor face lucruri diferite in fucntie de starea interna a masinii noastre, stare pe care.
Creati o masina si apelati metodele acesteia.
*/





}
