public class ArbolDeBusquedaBinaria {
    private Node root;
    private int counter;

    public void posOrderMax10() {
        counter = 0;
        posOrderMax10(root);
    }
    private void posOrderMax10(Node current) {
        if(current == null){
            return;
        }

        posOrderMax10(current.getRight());
        if(counter < 10) {
            System.out.print(current.showPlayers());
            counter += current.getPlayers().size();
        }
        posOrderMax10(current.getLeft());
    }
    public void insert(int score, String name) {
        Player player = new Player(name);
        if(root == null) {
            root = new Node(score);
            //System.out.println(root);
            root.getPlayers().add(player);
        } else {
            insert(score, player, root);
        }
    }

    private void insert(int score, Player player, Node current) {
        if( score > current.getValue() ) {
            // Cuando va por la derecha
            if(current.getRight() == null){
                Node insert = new Node(score);
                insert.getPlayers().add(player);
                current.setRight(insert);
                return;
            } else {
                insert(score, player, current.getRight());
            }
        } else if (score < current.getValue()) {
            //Cuando va por la izquierda
            if(current.getLeft() == null){
                Node insert = new Node(score);
                insert.getPlayers().add(player);
                current.setLeft(insert);
                return;
            } else {
                insert(score, player, current.getLeft());
            }
        } else {
            //Cuando son iguales
            current.getPlayers().add(player);
            return;
        }

    }

    public void inOrder() {
        inOrder(root);
    }
    private void inOrder(Node current) {
        if(current == null){
            return;
        }
        inOrder(current.getLeft());
        System.out.print(current.showPlayers());
        inOrder(current.getRight());
    }

    public String searchByPoints(int goal ){
        Node temp =  search(goal, root);
        return temp == null? "Ese usuario no esta en el sistema": temp.showScores();
    }
    private Node search(int goal, Node current) {
        if (current == null) {
            return null;
        }
        if( goal < current.getValue()) {
            //Cuando es menor que el numero
            return search(goal , current.getLeft());
        }else if( goal > current.getValue()){
            //Cuando es mayor que el numero que estamos buscando
            return search(goal, current.getRight());
        } else {
            //Cuando son iguales
            return current;
        }
    }
}
