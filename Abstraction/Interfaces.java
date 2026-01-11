package Abstraction;

interface ChessPlayer {
    void move();
}

public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();

        Rook r = new Rook();
        r.move();

        King k = new King();
        k.move();
    }
}

class Queen implements ChessPlayer {
    public void move() {
        System.out.println("Queen moves up, down, left, right, diagonal");
    }
}

class Rook implements ChessPlayer {
    public void move() {
        System.out.println("Rook moves up, down, left, and right");
    }
}

class King implements ChessPlayer {
    public void move() {
        System.out.println("King moves up, down, left, right, and diagonal by 1 step");
    }
}