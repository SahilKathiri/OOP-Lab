import java.util.Scanner;
import java.util.ArrayList;

class FlightDest {
    private String flightNo, source, destination;    
    private float cost;

    public FlightDest(String flightNo, String source, 
                    String destination, float cost) {
        this.flightNo = flightNo;
        this.source = source;
        this.destination = destination;
        this.cost = cost;
    }

    //Getters
    public String getFlightNo() {return flightNo;}
    public String getSource() {return source;}
    public String getDest() {return destination;}
    public float getCost() {return cost;}

    public void display() {
        System.out.println(flightNo + " " + source + " " + destination);    
    }
}

class FlightListInfo {
    ArrayList<FlightDest> fList;

    public FlightListInfo() {
        fList = new ArrayList<>();    
    }

    public void addFlightInfo(String fNo, String source, 
                            String dest, float cost) {
            FlightDest temp = new FlightDest(fNo, source, dest, cost);
            fList.add(temp);
    }

    public ArrayList<FlightDest> getFlightSrcDest(String src, String dest) {
        ArrayList<FlightDest> list = new ArrayList<>();
        
        for(int i = 0; i < fList.size(); i++) {
            if(fList.get(i).getSource().equals(src) && 
                fList.get(i).getDest().equals(dest)) {

                list.add(fList.get(i));
            }
        }

        return list;
    }

}

public class FlightDestinationTester {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String fNo="a", src, dest;
        float cost;

        FlightListInfo f = new FlightListInfo();
    
        System.out.println("Enter flight number, source, destination and cost (use flight number = \"\" or \" \" or \"end\" to stop)");
        while(!fNo.equals("end") && !fNo.equals("")) {
            fNo = inp.next();
            if(fNo.equals("end")) break;
            src = inp.next();
            dest = inp.next();
            String c = inp.next();
            cost = Float.parseFloat(c);
            

            f.addFlightInfo(fNo, src, dest, cost);
        }

        System.out.println("Enter the source and destination to search for: ");
        src = inp.next();
        dest = inp.next();
        
        ArrayList<FlightDest> list = f.getFlightSrcDest(src, dest);

        for(int i = 0; i < list.size(); i++){
            list.get(i).display();
        }


    }    
}
