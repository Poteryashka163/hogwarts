class Kogtevran extends Hogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public int getIntelligence() {
        return intelligence;
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

    public Kogtevran(String character, int magikPower, int transgessiayDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(magikPower, transgessiayDistance,character);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() + "Kogtevran{" +
                "intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                "} " ;
    }

    @Override
    public int calculateSecondScore() {
        return this.creativity + this.intelligence + this.wisdom + this.wit;
    }
    @Override
    public void bestCharacterInGroup(Hogwarts first, Hogwarts second) {
        System.out.println(String.format("%s лучший в Когневарец чем ", first,second));
    }
}

