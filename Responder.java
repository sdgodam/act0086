import java.util.Random;
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
    ArrayList<String> respuestas;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        respuestas = new ArrayList<>();
        respuestas.add("That sounds interesting. Tell me more...");
        respuestas.add("Can you explain me your problem?");
        respuestas.add("Can you say me your network configuration?");
        respuestas.add("I need more information...");
        respuestas.add("What OS has your computer?");
        respuestas.add("Has you install all the recommended security updates?");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return respuestas.get(aleatorio.nextInt(respuestas.size()));
    }
}
