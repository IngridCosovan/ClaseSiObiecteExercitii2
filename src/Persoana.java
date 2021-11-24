public class Persoana {
    String name;
    int height;
    int weight;
    int energy;

    public Persoana(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.energy = 10;
    }

    //functionalitati:
    public void eat(){
        System.out.println(name+ " a mancat");
        weight++;

    }

    public void sleep(){
        System.out.println(name+ " doarme");
        energy++;
    }

    public void exercise(){
        System.out.println(name+ " face exercitii");
        weight--;
        energy--;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", energy=" + energy +
                '}';
    }
}
