
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
    
    public void setHiddenWord(){
        hiddenWord = wordGenerator.generateWord();
    }
    
    public void setGuessedWord(){
        guessedWord = initializeGuessedWord();
    }
    
    public void setNumberOfTries(){
        numberOfTries = 0;
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
        showWelcome();
        while(guessedWord.contains("_")){
            guess(reader.getChar("Digite um caracter: "));
        }
        showResult();
    }
    
    private void showWelcome(){
        System.out.println("Bem-Vindo ao jogo da forca!");
    }
    
    private void guess(char guessedChar){
        StringBuilder auxBuilder = new StringBuilder(guessedWord);
        for(int i=0;i<hiddenWord.length();i++){
            if(hiddenWord.charAt(i)==guessedChar){
                auxBuilder.setCharAt(i, guessedChar);
            }
        }
        guessedWord = auxBuilder.toString();
        numberOfTries++;
        System.out.println(guessedWord);
    }
    
    private void showResult(){
        System.out.println(numberOfTries);
    }
}
