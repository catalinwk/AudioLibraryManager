/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package audioLibraryManager;
import java.util.*;
import java.io.*;

/**
 * This class creates a shell to be used for a LibraryAudioManager
 * @author Catalin Mazilu
 */
public class AudioShell {
    /**
     * Used for storing registered commands
     */
    ArrayList<String> commandList = new ArrayList<String>();
    
    /**
     * Storing current Path to display
     */
    String currentPath = "";
    
    /**
     * Used to initialise CurrentPath
     */
    AudioShell(){
       
        File path = new File(".");
        currentPath = path.getAbsolutePath();
    }
    
    
    /**
     * Used to initialise Shell
     */
    
    public void initShell(){
        System.out.print(currentPath);
    }
    
    
    public void registerCommand(){
        
    }
    
    
    public void runCommand(){
        
    }
    
    
}
