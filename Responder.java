import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;

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
    private HashMap responseMap = new HashMap();
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        randomGenerator = new Random();
        responses = new ArrayList<String>();
        fillResponseMap();
        fillResponses();
        
    }

     //String input
    public String generateResponse()
    {
        int index = randomGenerator.nextInt(responses.size());
        return responses.get(index);
        //return "That sounds interesting. Tell me more...";
       // if(input.contains("slow"))
        //{
         //   return responseMap.get("slow");
       // }
        
    }

    private void fillResponses()
    {
        responses.add("That sounds odd. Could you describe \n" +
        "that problem in more detail?");
        responses.add("No other customer has ever \n" +
        "complained about this before \n" +
        "What is your system configuration?");
        responses.add("Thats a known problem with Vista." +
        "Windows 7 is much better.");
        responses.add("I need a bit more information on that");
        responses.add("have you checked that you do not \n" +
        "have a dll conflict?");
        responses.add("That is explained in the manual. \n" +
        "Have you read the manual?");
        responses.add("Your description is a bit \n" +
        "Wishy-washy. Have you got an expeert \n" +
        "there with you who could describe \n" +
        "This more precisly?");
        responses.add("Thats not a bug, it's a feature!");
        responses.add("Could you elaborate on that?");
        
    }
    private void fillResponseMap()
    {
        responseMap.put("slow",
        "I think this has to do with your hardware. \n" +
        "Upgrading your processor should solve all" +
        "performance problems. \n" +
        "Have you got a problem with our software?");
        responseMap.put("bug",
        "Well, you know, all software has some bugs \n" +
        "But our software engineers are working very" +
        "hard to fix them. \n" +
        "Can you describe the problem a bit further?");
        responseMap.put("expensive",
        "The cost of the product is quite competitive. \n" +
        "have you looked around and" +
        "really compared our features?");
    }
}
