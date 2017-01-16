/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package audioLibraryManager.commands;
import audioLibraryManager.commands.interfaces.*;
import java.io.*;
import audioLibraryManager.*;

/**
 *
 * @author HP
 */
public class CdCommand 
implements AudioCommand

{
    /**
     * Name of the command
     */
    String name="cd";
    
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
    public void runCommand(ShellPath path)
    throws CommandException
    {
        System.out.println("Running CD command");
        path.setPath("..");
        throw(new CommandException("Testare "));
        
    }
    
    
    
    
}
