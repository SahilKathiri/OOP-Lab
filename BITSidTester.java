import java.util.Scanner;

class StudentID {
    String year, disc, pt, campus;
    int id;
    Scanner inp = new Scanner(System.in);

    

    public StudentID() {
        System.out.print("Enter year: ");
        year = inp.next();

        System.out.print("Enter Discipline: ");
        String d = inp.next();
        if(d.charAt(0) == 'A') disc = d;
        else {
            if      (d.equals("CHEM")) disc = "A1";
            else if (d.equals("EEE"))  disc = "A3";
            else if (d.equals("MECH")) disc = "A4";
            else if (d.equals("CS"))   disc = "A7";
        }

        System.out.print("Enter PS/TS: ");
        String ps = inp.next();
        pt = (ps.equals("PS"))? "PS" : "TS";

        System.out.print("Enter campus: ");
        String cam = inp.next();
        if (cam.equals("Dubai")) campus = "U";
        else campus = "" + cam.charAt(0);

        id = (int) Math.floor(Math.random()*501);
    } 

    public void display() {
        System.out.println(year + disc + pt + id + campus);    
    }
}

public class BITSidTester {
    public static void main(String[] args) {
        System.out.println("Enter your details: ");
        StudentID s = new StudentID();
        s.display();
    }    
}
