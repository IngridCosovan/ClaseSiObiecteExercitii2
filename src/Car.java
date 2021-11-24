public class Car {

    /*3. Creati clasa Car, cu urmatoarele campuri: String brand, int year, boolean on, si urm metode: prin metodele
printDetails(), startEngine si stopEngine.
 Metodele startEngine si stopEngine vor face lucruri diferite in functie de starea interna a masinii noastre, stare pe care
 de asemenea o va modifica.
Creati o masina si apelati metodele acesteia.
*/

    String brand;
    int year;
    boolean on;


    //constructor
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
        public void printDetails() {
            System.out.print("Masina " + brand + " din anul " + year + " este ");
            System.out.println(on? "pornita" : "oprita"); //ternar

        }


        public void startEngine(){
            if (on){
            System.out.println("Masina este deja pornita");
            }else{
                System.out.println("Masina a pornit");
                on=true;
            }
        }

        public void stopEngine(){
            if (on){
                System.out.println("Masina s-a oprit");
                on=false;
            }else {
                System.out.println("Masina este deja oprita");
            }
        }
    }

