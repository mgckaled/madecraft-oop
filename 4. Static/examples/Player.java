package examples;

public class Player {

    /* Member variables */
    private String name;
    private int age;
    private static String nameGame; // belongs to the class itself
    private int competitorNumber;
    private int numberWins;
    private int numberLooses;
    private static int playersGame; // belongs to the class itself

    /* Class Constructor */
    public Player(String name, int age) {
        this.name = name;
        this.age = age;
        playersGame++;
        numberWins = 0;
        numberLooses = 0;
        this.competitorNumber = playersGame; // automatic ID varying according to players in Game.
    }

    public static void setNameGame(String nameGame) {
        Player.nameGame = nameGame;
    }

    public static int getPlayersGame() {
        return playersGame;
    }

    void win() {
        numberWins++;
    }

    void loose() {
        numberLooses++;
    }

    @Override
    public String toString() {
        return "Player{" + "name='" + name + '\'' + ", age=" + age +
                ", competitorNumber=" + competitorNumber + ", numberWins=" + numberWins +
                ", numberLooses=" + numberLooses + '}';
    }

    public static void main(String[] args) {

        Player p1 = new Player("Astolfo", 20);
        Player p2 = new Player("Marcel", 32);
        Player p3 = new Player("Lucas", 24);
        setNameGame("Medieval Total War"); // static getters avoids class or instances references
        p1.win();
        p2.loose();

        System.out.println("Game: " + nameGame);
        System.out.println("Total players: " + getPlayersGame());
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
