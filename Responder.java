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
    Random aleatorio;
    HashMap<String,String> respuestas;
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
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int numero = aleatorio.nextInt(respuestas.size());
        String clave = "processor";
        if (numero == 1){
            clave = "hello";
        }else if (numero == 2){
            clave = "problem";
        }else if (numero == 3){
            clave = "dhcp";
        }else if (numero == 4){
            clave = "help";
        }else if (numero == 5){
            clave = "windows";
        }
        return respuestas.get(clave);
    }
}
