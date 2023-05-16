class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public Slizerin(String character, int magikPower, int transgessiayDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(magikPower, transgessiayDistance,character);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return  super.toString() + "Slizerin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", lustForPower=" + lustForPower +
                "} ";
    }

    @Override
    public int calculateSecondScore() {
        return this.ambition + this.determination + this.cunning + this.resourcefulness + this.lustForPower;
    }
    @Override
    public void bestCharacterInGroup(String first, String second) {
        System.out.println(String.format("%s лучший в Слизерине чем %s", first,second));
    }
}

