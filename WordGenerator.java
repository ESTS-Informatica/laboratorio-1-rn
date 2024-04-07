import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 * Escreva uma descrição da classe WordGenerator aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WordGenerator
{
    private List<String> words;
    
    public WordGenerator(){
        words = new ArrayList<String>();
    }
    
    private void fillArrayList(){
        words.add("boolean");
        words.add("break");
        words.add("byte");
        words.add("case");
        words.add("char");
        words.add("class");
        words.add("continue");
        words.add("do");
        words.add("double");
        words.add("else");
        words.add("enum");
        words.add("for");
        words.add("if");
        words.add("import");
        words.add("int");
    }
    
    public String generateWord(){
        Random random = new Random();
        return words.get(random.nextInt(15));
    }
    
    public void addWord(String word){
        words.add(word);
    }
}
