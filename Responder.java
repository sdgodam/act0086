import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    Random aleatorio;
    HashMap<String,String> respuestas;
    private ArrayList<String> respuestasA;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        
        respuestas = new HashMap<>();
        respuestas.put("processor","That sounds interesting. Tell me more...");
        respuestas.put("hello","Can you explain me your problem?");
        respuestas.put("problem","Can you say me your network configuration?");
        respuestas.put("dhcp","I need more information...");
        respuestas.put("help","What OS has your computer?");
        respuestas.put("windows","Has you install all the recommended security updates?");
       
        respuestasA = new ArrayList<>();
        respuestasA.add("That sounds interesting. Tell me more...");
        respuestasA.add("Can you explain me your problem?");
        respuestasA.add("Can you say me your network configuration?");
        respuestasA.add("I need more information...");
        respuestasA.add("What OS has your computer?");
        respuestasA.add("Has you install all the recommended security updates?");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String input)
    {
        String response = "";
        if(respuestas.containsKey(input)){
            response = respuestas.get(input);
        }else{
            response = respuestasA.get(aleatorio.nextInt(respuestas.size()));
        }
        return response;
    }
}
