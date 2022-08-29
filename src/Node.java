import java.util.ArrayList;

public class Node {
    private int value;
    private Node right;
    private Node left;
    private ArrayList<Player> players;

    public Node(int value) {
        players = new ArrayList<Player>();
        this.value = value;
    }

    public String showPlayers() {
        String ans = "";
        for (Player player : players) {
            ans += value + "\t\t" + player.toString() + "\n";
        }
        return ans;
    }

    public String showScores() {
        String ans =  "Jugadores con puntaje: "+ value + "\n";
        for (Player player : players) {
            ans += "* " + player.toString() + "\n";
        }
        return ans;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
}
