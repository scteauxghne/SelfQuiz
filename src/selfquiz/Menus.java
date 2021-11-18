/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfquiz;

/**
 *
 * @author Stone
 */
public class Menus
{
    public void menuSelector(int i)
    {
        if (i == 0) { mainMenu(); }
        if (i == 1) { commandsMenu(); }
    }
    public int commander(int i, String input)
    {
        if (i == 0) { return mainMenuCommand(input); } else { return -1; }
        if (i == 1) { return commandsMenuCommand(input); } else { return -1; }
    }
    public void mainMenu() // 0
    {
        System.out.println("==============");
        System.out.println("Self Quiz Game");
        System.out.println("==============");
        System.out.println();
        System.out.println("1. New Game");
        System.out.println("2. Commands");
    }
    public int mainMenuCommand(String input)
    {
        if (input == "1") { return 2; }
        if (input == "2") { return 1; }
        else { return -1; }
    }
    
    public void commandsMenu() // 1
    {
        System.out.println("---Commands---");
        System.out.println();
        System.out.println("1. Back");
    }
    public int commandsMenuCommand(String input)
    {
        if (input == "1") { return 0; }
        else { return -1; }
    }
    
    public void setupMenu(ArrayList<deck> decks, ArrayList<deck> selectedDecks) // 2
    {
        System.out.println("--- Game Setup ---");
        if (decks.size() > 0)
        }
            System.out.println();
            System.out.println("< Loaded Decks >");
            for (int i = 0; i < decks.size(); i++)
            {
                System.out.println((i + 1) + ". " + decks.get(i).getName());
            }
        }
        else
        {
            System.out.println();
            System.out.println("No decks loaded");
        }
        if (selectedDecks.size() > 0)
        {
            System.out.println();
            System.out.println("< Selected Decks >");
            for (int i = 0; i < session.getRemainingTerms.size(); i++)
            {
                System.out.println((decks.size() + i + 1) + ". " + selectedDecks.get(i).getName());
            }
        }
        System.out.println();
        System.out.println("Continue [ENTER]");
        System.out.println("Back [/"BACK/"]");
    }
    public int setupMenuCommand(String input)
    {
        if (input == "1") { return 0; }
        else { return -1; }
    }
}
