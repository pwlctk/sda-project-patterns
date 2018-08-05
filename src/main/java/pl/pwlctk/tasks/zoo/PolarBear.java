package pl.pwlctk.tasks.zoo;

public class PolarBear extends DangerousBear {
    private AttackStrategy attackStrategy;
    private int weight;
    private String name;

    PolarBear() {
        this.weight = 200;
        this.name = "Niedźwiedź Polarny";
        attackStrategy = new KillAttack();
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Opis: To jest polarny misio");
    }

    @Override
    public void attack(Animal animal) {
        {
            attackStrategy.attack(this, animal);
        }
    }

}
