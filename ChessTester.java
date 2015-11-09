import java.util.ArrayList;
import java.util.Scanner;


interface Movable { void move(String newPos); }

abstract class Piece implements Movable {
    String name, color, curPos;
    
    public Piece() {
        int b = (int)(Math.random() * 8) + 1;
        int a = 97 + (int)(Math.random() * 8) + 1;
        curPos = Character.toString((char)a) + b;
    }

    public void move(String newPos) {
        System.out.println(color + " " + name + " moving from " + curPos + " to " + newPos);

        curPos = newPos;
    }
    
}

class King extends Piece {

    public King(String color) {
        super();
        this.color = color;
        name = "King";
    } 
}

class Rook extends Piece {
    public Rook(String color) {
        super();
        this.color = color;
        name = "Rook";
    }
}

class Pawn extends Piece {
    public Pawn(String color) {
        super();
        this.color = color;
        name = "Pawn";
    }    
}


class ChessTester{
    public static void main(String[] args) {
        String c, newPos, k;
        int i = 0;
        ArrayList<Piece> list = new ArrayList<>();
        
        Scanner inp = new Scanner(System.in);

        System.out.println("Created 3 chess pieces (King: 1, Rook:2, Pawn:3");

        while(true) {
            System.out.println("Enter the color, piece to move and the new Position");
            c = inp.next();
            k = inp.next();
            if (c.equals("0") && k.equals("0")) break;
            newPos = inp.next();
            
            String color = "";
            if(c.startsWith("W")) color = "White";
            else if (c.startsWith("B")) color = "Black";

            switch(Integer.parseInt(k)) {
                case 1: 
                    list.add(i, new King(color));
                    break;
                case 2: 
                    list.add(i, new Rook(color));
                    break;
                case 3:
                    list.add(i, new Pawn(color));
                    break;
            }
            list.get(i).move(newPos);
            i++;
        }
    }    
}
