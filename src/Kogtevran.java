public class Kogtevran extends Hogwarts {

    private final int mind;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public Kogtevran(String name, int powerOfMagic, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, powerOfMagic, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return String.format("%s ум: %d, мудрость: %d, остроумие: %d, творчество: %d",
                super.toString(), mind, wisdom, wit, creativity);
    }
}
