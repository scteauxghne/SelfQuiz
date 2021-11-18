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
}
