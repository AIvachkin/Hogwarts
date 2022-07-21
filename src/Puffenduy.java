public class Puffenduy extends Hogwarts {

    private final int diligence;
    private final int loyalty;
    private final int honesty;

    public Puffenduy(String name, int powerOfMagic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, powerOfMagic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
}
