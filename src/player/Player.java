package player;

public class Player {
    private String name;
    private char symbol;
    private String address;
    private long contactNumber;
    private String email;
    private int age;

    public void setPlayerdetails(String name,char symbol,String address ,long contactNumber,String email,int age){
        this.name=name;
        this.symbol=symbol;
        this.address=address;
        this.contactNumber=contactNumber;
        this.email=email;
        this.age=age;

    }
    public void setPlayernameandage(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setPlayerNameSymEmailAge(String name,char symbol,String email,int age){
        this.name=name;
        this.age=age;
        this.symbol=symbol;
        this.email=email;

    }
    public void setPlayerNamesym(String name,char symbol){
        this.name=name;
        this.symbol=symbol;

    }
    public String getPlayername (){
        return name;

    }
    public char getPlayersym(){
        return symbol;
    }
    public  void getPlayernamesym(){
        System.out.println("player name: "+this.name);
        System.out.println("player sym: "+this.symbol);
    }
    public void getPlayerdetails(){
        System.out.println("player name: "+this.name);
        System.out.println("player symbol: "+this.symbol);;
        System.out.println("player address: "+this.address);
        System.out.println("player contact number: "+this.contactNumber);
        System.out.println("player emailId: "+this.email);
        System.out.println("player age: "+this.age);
    }


}
