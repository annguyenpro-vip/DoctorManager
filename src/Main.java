/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import View.DoctorView;

/**
 *
 * @author OS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mChon[] = {"Add Doctor",
            "Update Doctor",
            "Delete Doctor",
            "Search Doctor",
            "Exit"};
        DoctorView doctorListView = new DoctorView("\n======== Doctor Program ========", mChon);
        doctorListView.run();
    }
    
}
