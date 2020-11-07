import de.unistuttgart.iste.rss.oo.hamstersimulator.datatypes.Location;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Territory;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.Hamster;
import java.io.IOException;
import java.io.File;
import java.io.*;
/**
 * Beschreiben Sie hier die Klasse HomeworkHamsterGame.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class HomeworkHamsterGame extends SimpleHamsterGame
{   
    protected final mysterioushamster mysteriousPaule;

    HomeworkHamsterGame(){
        mysteriousPaule = new mysterioushamster(paule);
        File terFile = new File ("+libs/territories/example01.ter");
        try(
        InputStream targetStream = new FileInputStream(terFile);
        ) {
            game.initialize(targetStream);
        } catch (IOException ex){
            throw new RuntimeException(ex);
        }
        game.displayInNewGameWindow();
    }
}
