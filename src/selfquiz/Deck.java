/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selfquiz;

import java.util.ArrayList;

/**
 *
 * @author Stone
 */
public class Deck
{
    private ArrayList<Term> terms;
    
    Deck(ArrayList<Term> terms) { this.terms = terms; }
    
    public ArrayList<Term> getTerms() { return terms; }
    public int size() { return terms.size(); }
}
