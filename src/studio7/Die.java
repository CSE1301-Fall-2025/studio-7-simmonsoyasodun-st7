package studio7;

public class Die {
    private int sides;

    public Die(int sides){
        this.sides = sides;
    }

    public int rollDie(){
        return (int)(Math.random()*this.sides) + 1;
    }

    public static void main(String[] args){
        Die myDie = new Die(6);
        System.out.println(myDie.rollDie());
    }
}
