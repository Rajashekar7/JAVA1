package main;

public class Person {
    int id;
    protected String firstName;
    protected String lastName;

    public Person(){

    }
    public Person(String firstName, String lastName0){
        this.firstName = firstName;
        this.lastName = lastName0;

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString(){
        return getFullName();
    }
    public String getFullName(){
        StringBuilder sb = new StringBuilder();
        if(firstName != null)
                sb.append(firstName).append(' ');
        if(lastName !=null)
                sb.append(lastName);
        if(sb.length()==0)
                sb.append("NO NAME");
        return sb.toString();
    }
}
