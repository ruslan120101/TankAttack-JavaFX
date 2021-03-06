
// This entire file is part of my masterpiece.
// Ruslan Ardashev

package tankattack;

import Sprites.*;
import java.awt.image.*;
import java.io.*;
import java.util.logging.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.stage.*;
import javax.imageio.*;


/**
 *
 * @author Ruslan
 */
public class FirstWorld extends World {

    @Override
    public void createInitialSprites() {
        
        createPlayerSprite();
        // Other sprites
        createEnemies();
        
        
    }

    @Override
    public void signalEndOfLevel() {

        TankAttack.sharedInstance.transitionFromFirstWorldToSecondWorld();
    
    }

    private void createEnemies() {
        
        // Minion(double x, double y, World world, double leftXLimit, double rightXLimit, boolean goingRight)
        
//         Enemy 1
        Minion one = new Minion(50.0, 40.0, this, 30.0, 150.0, true);
        
        
        // Enemy 2
        Minion two = new Minion(245.0, 80.0, this, 150.0, 400.0, false);
        
        
        // Enemy 3
        Minion three = new Minion(540.0, 60.0, this, 400.0, 560.0, true);
        
        
        
    }

}
