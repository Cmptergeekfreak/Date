/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab3;

/**
 *
 * @author Joe
 */
public class Startup {
    
    public static void main(String[] args) {
        DateService ds = new DateService();

        String date = "03/15/2014";
        try {
            ds.convertStringToDate(date);
        } catch (RuntimeException rte) {
            System.out.println(rte.getLocalizedMessage());
        }
        date = "March 15, 2014 2:30 PM";
        try {
            ds.convertStringToCalendar(date);
        } catch (RuntimeException rte) {
            System.out.println(rte.getLocalizedMessage());
        }
    }

    
}
