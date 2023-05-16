class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }


    public Griffindor(String character, int magikPower, int transgessiayDistance, int nobility, int honor, int courage) {
        super(magikPower, transgessiayDistance,character);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public String toString() {
        return super.toString() + " Griffindor {"+
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                "} ";
    }

    @Override
    public int calculateSecondScore() {
        return this.nobility+this.honor+this.courage;
    }

    @Override
    public void bestCharacterInGroup(String first, String second) {
        System.out.println(String.format("%s лучший в Гриффиндоре чем %s", first,second));
    }


}

