class Publisher implements Cloneable {
    String name, place;

    public Publisher(String name, String place) {
        this.name = name;
        this.place = place;
    }
    public Publisher() {}
    
    //Getters
    public String getName() {return name;}
    public String getPlace() {return place;}
    
    //Setters
    public void setName(String n) {name = n;}
    public void setPlace(String p) {place = p;}

    public String toString() {
        return getClass().getName() + "[name: " + name + ", place: " + place + "]" ;
    }

    //Override
    public Object clone() {
        try{
            return super.clone();    
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
            return null;    
        }
    }
}

class Book implements Cloneable {
    String title;
    Publisher publisher;
    double cost;

    public Book(String t, String pub, String place, double c) {
        publisher = new Publisher(pub, place);
        title = t;
        cost = c;
    }
    
    // Getters
    public String getTitle() {return title;}
    public double getCost() {return cost;}
    public String getPubName() {return publisher.getName();}
    public String getPubPlace() {return publisher.getPlace();}

    //Setters
    public void setTitle(String t) {title = t;}
    public void setCost(double c) {cost = c;}
    public void setPubName(String n) {publisher.setName(n);}
    public void setPubPlace(String p) {publisher.setPlace(p);}

    public String toString() {
        return getClass().getName() + "[title: " + title + ", publisher: " + publisher + ", cost: " + cost + "]";
    }
    
    public Object clone() {
        try {
            return super.clone();    
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
            return null;
        }
    }
    

}

public class CloneTester_S {
     public static void main(String[] args) {
        Book b1 = new Book ("Bk1", "Pub1", "Place1", 100.0);
        Book b2 = (Book)b1.clone();
        System.out.println("Just after Clone:Book: b1 = " + b1);
        System.out.println("Just after Clone Book: b2 = " + b2 );
        b2.setTitle("Bk2");
        b2.setCost(200);
        b2.setPubName("Pub2");
        b2.setPubPlace("Place2");
        System.out.println("After modifciation: Book: b1 = " + b1);
        System.out.println("After modifciation: Book: b2 = " + b2 );
    }
}



