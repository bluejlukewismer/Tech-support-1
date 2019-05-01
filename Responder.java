import java.util.ArrayList;
import java.util.Random;




/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random randomGenerator;
    private ArrayList<String> responses;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        randomGenerator = new Random();
        responses = new ArrayList<String>();
        fillResponses();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int index = randomGenerator.nextInt(responses.size());
        return responses.get(index);
        //return "That sounds interesting. Tell me more...";
    }
}
