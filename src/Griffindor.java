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

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public Griffindor(String character, int magikPower, int transgessiayDistance, int nobility, int honor, int courage) {
        super(magikPower, transgessiayDistance,character);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    @Override
    public String toString() {
        return super.toString() + "Griffindor{" +
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
    public void bestCharacterInGroup(Hogwarts first, Hogwarts second) {
        System.out.println(String.format("%s лучший в Гриффиндорец чем ", first,second));
    }


}

