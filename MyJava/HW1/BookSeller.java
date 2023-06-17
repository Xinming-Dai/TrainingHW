package HW1;
// Static 2

public class BookSeller {
    static Book[] inventory;
    
    public static void sellBooks(){
        inventory = new Book[]{new Book("fagfa"), new Book("jlijo")};
        
        for(int i = 0; i < inventory.length; i++){
            System.out.println(inventory[i].name);
        }
    }
    
    public static class Book {
        String name;
        
        public Book(String name){
            this.name = name; // this refers to the current object 
        }
    }

    public static void main(String[] args){
        sellBooks();
    }
}
