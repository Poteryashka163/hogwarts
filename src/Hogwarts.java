import java.sql.SQLOutput;

public abstract class Hogwarts {
    private String character;
    private int magikPower;
    private int transgessiayDistance;

    public String getCharacter() {
        return character;
    }

    public int getMagikPower() {
        return magikPower;
    }

    public int getTransgessiayDistance() {
        return transgessiayDistance;
    }

    public Hogwarts(int magikPower, int transgessiayDistance, String character) {
        this.magikPower = magikPower;
        this.transgessiayDistance = transgessiayDistance;
        this.character = character;
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "magikPower=" + magikPower +
                ", transgessiayDistance=" + transgessiayDistance +
                '}'+ character;
    }
    public int calculateOneScore(){
        return magikPower + transgessiayDistance;
    }
    public abstract int calculateSecondScore();

    public abstract void bestCharacterInGroup(String first, String second);


    private void compareOne(Hogwarts hogwarts){
        int oneScore = this.calculateOneScore();
        int secondScore = hogwarts.calculateOneScore();
        if (oneScore > secondScore) {
            System.out.println(String.format("%s сильнее чем %s",this.character, hogwarts.getCharacter()));
        }else if (oneScore < secondScore){
            System.out.println(String.format("%s сильнее чем %s", hogwarts.getCharacter(),this.character));
        }else {
            System.out.println("Паритет силы.");
        }

    }
    private void compareSecond(Hogwarts hogwarts) {
        int oneScore = this.calculateOneScore() + this.calculateSecondScore();
        int secondScore = hogwarts.calculateOneScore() + hogwarts.calculateSecondScore();
        if (oneScore > secondScore) {
            bestCharacterInGroup(this.getCharacter(), hogwarts.getCharacter());
        } else if (oneScore < secondScore) {
            bestCharacterInGroup(hogwarts.getCharacter(),this.getCharacter());
        } else {
            System.out.println("Паритет силы.");

        }
    }
    public void compere(Hogwarts hogwarts){
        if (this.getClass().equals(hogwarts.getClass())){
            compareSecond(hogwarts);
        }else {
            compareOne(hogwarts);
        }
    }

}

