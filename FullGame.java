
/**
 * Escreva uma descrição da classe FullGame aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class FullGame
{
    private WordGuessingGame wordGuessingGame;
    private InputReader reader;

    public FullGame(){
        wordGuessingGame = new WordGuessingGame();
        reader = new InputReader();
    }

    public void reset(){
        wordGuessingGame.setHiddenWord();
        wordGuessingGame.setGuessedWord();
        wordGuessingGame.setNumberOfTries();
    }

    public void play(){
        do{
            wordGuessingGame.play();
            reset();
        }while(reader.getChar("Pretende jogar outra vez?(s/n)")=='s');
    }
}
