import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Territory;
import java.io.PrintStream;
import javafx.application.Platform;
import java.io.*;

/**
 * Abstrakte Klasse Exercise03Base - beschreiben Sie hier die Klasse
 * 
 * @author (Ihr Name)
 * @version (eine Version-Nummer oder ein Datum)
 */
public abstract class Exercise03Base extends SimpleHamsterGame
{
    protected Territory territory;
    protected PrintStream output = System.out;

    Exercise03Base() {
        
        File terFile = new File ("+libs/territories/example01.ter");
            try(
            InputStream targetStream = new FileInputStream(terFile);
            ) {
            game.initialize(targetStream);
        } catch (IOException ex){
            throw new RuntimeException(ex);
        }
        this.territory = this.game.getTerritory();
    }

    abstract void printWithJavaFX();

    public void challenge3() {
        Platform.runLater(() -> { 
            printWithJavaFX(); 
        });
    }
}
