public class Slizerin extends Hogwarts {

    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int thirstForPower;

    public Slizerin(String name, int powerOfMagic, int transgression, int cunning, int determination, int ambition, int thirstForPower) {
        super(name, powerOfMagic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }
}
