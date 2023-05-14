class Puffendui extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honor;

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonor() {
        return honor;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public Puffendui(String character, int magikPower, int transgessiayDistance, int diligence, int loyalty, int honor) {
        super(magikPower, transgessiayDistance,character);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honor = honor;
    }

    @Override
    public String toString() {
        return super.toString() + "Puffendui{" +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honor=" + honor +
                "} " + super.toString();
    }

    @Override
    public int calculateSecondScore() {
        return this.diligence+this.loyalty+this.honor;
    }
    @Override
    public void bestCharacterInGroup(Hogwarts first, Hogwarts second) {
        System.out.println(String.format("%s лучший в Пуфендуец чем ", first,second));
    }
}

