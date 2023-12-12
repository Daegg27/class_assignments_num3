public class DieDriver {
    
    static public void main(String[] args){

        Die diceOne = new Die();
        Die diceTwo = new Die();
        Die diceThree = new Die();

        System.out.println(diceOne);

        diceTwo.roll();
        System.out.println("\n" + diceTwo.getFaceValue());

        diceThree.setFaceValue(4);
        System.out.println("\n" + diceThree);




    }


}
