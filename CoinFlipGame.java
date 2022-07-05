package APComputerScience;

public class CoinFlipGame {

    public static void main(String[] args) {
        int coinFlip= (int) (Math.random()*2);
        if (coinFlip==0){
            System.out.println("Heads");

        }
        else {
            System.out.println("Tails");
        }
    }
}
