/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package audioLibraryManager.commands;
import audioLibraryManager.commands.interfaces.*;
import audioLibraryManager.*;

import java.io.*;
import java.util.*;
import java.awt.Desktop;


/**
 * Used to play an audio file
 * @author Catalin Mazilu
 */
public class PlayCommand 
implements AudioCommand
{
    
    public String name ="play";
      /**
     * Returns the name of the command
     * @return name of command
     */
    public String getName(){
    
        return name;
        
    }
    
    /**
     * Runs the Change Directory command
     */
    public void runCommand(ShellPath path, String args)
    throws CommandException
    {
            System.out.println("Playing");
            StringTokenizer commandToken = new StringTokenizer(args);
        
            if (commandToken.countTokens()>2)
                throw(new CommandException("Invalid number of arguments"));
            commandToken.nextToken();

            String newpath = commandToken.nextToken().toString();
            System.out.println("New path is: " + newpath);
            File f = new File(newpath);
     
            System.out.println("Absolute path is: " + f.getAbsolutePath());

            if (true) {
                /*
                 * Plays the file
                 */
                
                Desktop d = Desktop.getDesktop();
                try {
                    //d.open(new File("c:\\app\\mp3\\doi\\ibelive.mp3"));
                    d.open(new File(f.getCanonicalPath()));
                } catch (IOException e){
                    System.out.append(e.getMessage());
                }
                
            } else {

                System.out.println(f.getAbsolutePath());
                throw(new CommandException("Incorect path"));

            }
    
    }
    
}

