import java.util.Random;


public class Die {
    
    Random rand = new Random();
    public int faceValue;

    public Die(){
        this.faceValue = 1;
    }

    public void roll(){
        faceValue = rand.nextInt(6) + 1;
    }

    public void setFaceValue(int value){
        faceValue = value;
    }

    public int getFaceValue(){
        return faceValue;
    }

    public String toString(){
        return "This dice is sitting on a face value of " + faceValue;
    }

}
