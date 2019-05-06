
import java.util.Random;
import java.util.ArrayList;

public class randomTester
{
    // instance variables - replace the example below with your own
    private Random random;
    private ArrayList<String> answer;
    /**
     * Constructor for objects of class randomTester
     */
    public randomTester()
    {
        // initialise instance variables
        random = new Random();
        answer = new ArrayList();
        answer.add("No");
        answer.add("Yes");
        answer.add("Maybe");
    }

    public int minAndMax1(int max)
    {
        //return random.nextInt(max) + 1;
        return minAndMax2(1, max);
    }

    public int minAndMax2(int min, int max)
    {
        return random.nextInt(max - min + 1) + min;
    }

    public int throwDice()
    {
        return random.nextInt(6) + 1;
    }

    public String getResponse()
    {
        // int answer = random.nextInt(3);
        // if(answer == 0) {
        // return "Yes";
        // }
        // else if(answer == 1) {
        // return "No";
        // }
        // else {
        // return "Maybe";
        // }

        return answer.get(random.nextInt(answer.size()));
    }

    public void printMultiRandom(int howMany)
    {
        for(int i = 0; i<howMany; i++) {
            printOneRandom();
        }

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printOneRandom()
    {
        // put your code here
        System.out.println(random.nextInt());
    }
}
