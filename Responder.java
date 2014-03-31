import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;

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
    HashMap<HashSet<String>,String> respuestas;
    private ArrayList<String> respuestasA;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();

        HashSet<String> set1 = new HashSet<>();
        set1.add("processor");
        set1.add("hello");

        HashSet<String> set2 = new HashSet<>();
        set2.add("problem");
        set2.add("dhcp");

        HashSet<String> set3 = new HashSet<>();
        set3.add("windows");
        set3.add("help");

        HashSet<String> set4 = new HashSet<>();
        set4.add("help");

        
        respuestas = new HashMap<>();
        respuestas.put(set1, "Hi. Can you explain me your problem?");
        respuestas.put(set2,"Can you say me your network configuration?");
        respuestas.put(set3,"Be free change to a Linux distribution");
        //respuestas.put("processor","That sounds interesting. Tell me more...");
        //respuestas.put("hello","Can you explain me your problem?");
        //respuestas.put("problem","Can you say me your network configuration?");
        //respuestas.put("dhcp","I need more information...");
        respuestas.put(set4,"What OS has your computer?");
        //respuestas.put("windows","Has you install all the recommended security updates?");

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
    public String generateResponse(HashSet<String> input)
    {
        String response = "";
        if(respuestas.containsKey(input)){
            response = respuestas.get(input);
        }else{
            if(respuestasA.size() != 0){
                int numAleatorio = aleatorio.nextInt(respuestasA.size());
                response = respuestasA.get(numAleatorio);
                respuestasA.remove(numAleatorio);
            }else{
                response = "I dont understand what you are saying to me...";
            }
        }

        return response;
    }
}