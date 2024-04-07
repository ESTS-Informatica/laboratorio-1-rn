
/**
 * Escreva uma descrição da classe WordGuessingGame aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WordGuessingGame
{
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    private InputReader reader;
    private WordGenerator wordGenerator;
    
    public WordGuessingGame(){
        reader = new InputReader();
        wordGenerator = new WordGenerator();
        hiddenWord = wordGenerator.generateWord();
        guessedWord = initializeGuessedWord();
        numberOfTries = 0;
    }
    
    public String getHiddenWord(){
        return hiddenWord;
    }
    
    public String getGuessedWord(){
        return guessedWord;
    }
    
    public int getNumberOfTries(){
        return numberOfTries;
    }
    
    private String initializeGuessedWord(){
        String aux = "";
        for(int i = 0; i < hiddenWord.length(); i++){
            aux = aux + "_";
        }
        return aux;
    }
    
    private void showGuessedWord(){
        System.out.println(guessedWord);
    }
    
    public void play(){
        
    }
    
    private void showWelcome(){
        System.out.println("Bem-Vindo ao jogo da forca!");
    }
    
    private void guess(char guessedChar){
        String aux="";
        for(int i=0;i<hiddenWord.length();i++){
            if(hiddenWord.charAt(i)==guessedChar){
                aux = hiddenWord.substring(0,i) + guessedChar + hiddenWord.substring(i + 1);
            }
        }
        guessedWord = aux;
        numberOfTries++;
    }
}
