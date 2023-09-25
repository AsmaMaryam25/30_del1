import java.util.Random;

public class Die {
    private int number = 0;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    Random random = new Random();

    public void rollDie() {
        number = random.nextInt(7);
    }
}
