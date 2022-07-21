public class Griffindor extends Hogwarts {

    private final int nobility;
    private final int honor;
    private final int bravery;

    public Griffindor(String name, int powerOfMagic, int transgression, int nobility, int honor, int bravery) {
        super(name, powerOfMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return String.format("%s благородство: %d, честь: %d, храбрость: %d",
                super.toString(), nobility, honor, bravery);
    }
}
