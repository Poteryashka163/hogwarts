public class Main {
    public static void main(String[] args){
    Griffindor harryPotter = new Griffindor ("Harry Potter",100,100,100,100,100);
    Griffindor hermioneGranger = new Griffindor("Hermione Granger",50,29,54,93,70);
    Griffindor ronWeasley = new Griffindor("Ron Weasley",60,70,30,50,65);
    Slizerin dracoMalfoy = new Slizerin("Draco Malfoy",66,55,23,76,100,90,65) ;
    Slizerin grahamMontagu = new Slizerin ("Graham Montagu",49,24,44,54,67,32,64);
    Slizerin gregoryGoyle = new Slizerin ("Gregory Goyle",65,87,99,32,65,88,84);
    Puffendui zachariasSmith = new Puffendui("Zacharias Smith",65,55,32,67,99);
    Puffendui cedricDiggory = new Puffendui("Cedric Diggory",84,54,82,94,33);
    Puffendui justinFinchFletchley = new Puffendui("Justin Finch-Fletchley",90,76,32,38,55);
    Kogtevran zhouChang = new Kogtevran("Zhou Chang",53,43,39,25,12,11);
    Kogtevran padmaPatil = new Kogtevran("Padma Patil", 80,66,73,90,61,32);
    Kogtevran marcusBelby = new Kogtevran("Marcus Belby",81,12,53,63,99,9);

//    System.out.println(harryPotter.calculateSecondScore());

    zhouChang.compere(padmaPatil);

    harryPotter.compere(hermioneGranger);
    hermioneGranger.compere(dracoMalfoy);
//    hermioneGranger.compere(grahamMontagu);

//    System.out.println(harryPotter);
    }

}
