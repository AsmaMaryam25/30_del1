public class Test {
    public static void main(String[] args) {
       Die die1 = new Die();
       Die die2 = new Die();
       int[] frequencyOfSums = new int[13];
       for (int i = 0; i < 1000; i++){
        die1.rollDie();
        die2.rollDie();
        var sum = die1.getNumber() + die2.getNumber();
        
        frequencyOfSums[sum]++;
       }
       for (int i = 2; i <= 12; i++){
        System.out.println("sum af" + i);
    
       }
       }

    }
