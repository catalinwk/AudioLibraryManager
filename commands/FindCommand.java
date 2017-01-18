/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package audioLibraryManager.commands;
import audioLibraryManager.commands.interfaces.*;
import audioLibraryManager.*;

import java.io.*;
import java.util.*;



/**
 * Finds a song by name, author or album
 * @author CatalinMazilu
 */
public class FindCommand
implements AudioCommand
{
     /**
     * name of the command
     */       
    public String name ="find";
     
    /**
     * Returns the name of the command
     * @return name of command
     */
      public String getName(){
    
        return name;
        
    }
    
     /**
     * Find a song
     */
    public void runCommand(ShellPath path, String args)
    throws CommandException
    {
     
            StringTokenizer commandToken = new StringTokenizer(args);
        
            if (commandToken.countTokens()==1 || commandToken.countTokens()>3)
                throw(new CommandException("Usage: find [parameter] value\n-name find by name\n-author find by author\n-album find by album"));
            
            commandToken.nextToken();
            String parameter = commandToken.nextToken().toString();
            
            /*
             * find by name
             */
            if (parameter.contentEquals("-name")){
                
                System.out.println("Find by name");
                
            } 
            /*
             * find by author
             */
            else if (parameter.contentEquals("-author")){
                System.out.println("Find by author");
            }
            /*
             * find by album
             */
            else if (parameter.contentEquals("-album")){
            
                    System.out.println("Find by album");
            }
            else {
                throw(new CommandException("Incorect parameter.\nUsage: find [parameter] value\n-name find by name\n-author find by author\n-album find by album"));
            }
            
    
    }
}
    
    
