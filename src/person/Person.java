package person;

public class Person {
    public String name;
    protected int height;
    int age;
    private int weight;
    
    public Person() {
    	System.out.println( "Person() called" );
    }
    
    public Person( int height ) {
    	System.out.println( "Person( int ) called" );
    }    
}