/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findingbrotherjones1;

import byui.cit260.findingBrotherJones.model.Player;

/**
 *
 * @author Kayla Finlayson
 */
public class FindingBrotherJones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
