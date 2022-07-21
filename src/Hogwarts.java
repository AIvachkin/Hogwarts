public abstract class Hogwarts {

    private final String name;
    private final int powerOfMagic ;
    private final int transgression ;

    public Hogwarts(String name, int powerOfMagic, int transgression) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void printStudent (){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Студент Хогвартса: %s, сила магии: %d, трансгрессия: %d, ",
                name, powerOfMagic, transgression);
    }
}
