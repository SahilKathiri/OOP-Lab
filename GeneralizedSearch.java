class Book implements Comparable<Book> {
    private String name;
    private double cost;

    public Book(String n, double c) {
        name = n;
        cost = c;
    }

    //Getters
    public String getName() {return name;}
    public double getCost() {return cost;}

    @Override
    public int compareTo(Book o) {

        if(cost == o.cost) return 0;
        else if(cost != o.cost) return 1;

        else if(name.equals(o.name)) return 0;
        else return 1;
    }

    public boolean equals(Object other) {
        if(other == null) return false;

        Book o = (Book) other;

        if(o.cost == cost && name.equals(o.name)) return true;

        return false;
    }
}

class GeneralizedSearch {
    public static boolean search(Object[] arr, Object item) {
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals(item)) {
                return true;
            }    
        }
        return false;
    }    
}
