
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
    
    public WordGuessingGame(){
        hiddenWord = "abc";
        guessedWord = "___";
        numberOfTries = 0;
    }
    
    private String getHiddenWord(){
        return hiddenWord;
    }
    
    private String getGuessedWord(){
        return guessedWord;
    }
    
    private int getNumberOfTries(){
        return numberOfTries;
    }
    
    private void showGuessedWord(){
        System.out.println(guessedWord);
    }
}
