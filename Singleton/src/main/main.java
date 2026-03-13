package main;

import acs.cts.singleton.Hotel;

public class main {
    //psvm
    public static void main(String[] args) {
        Hotel hotel1= Hotel.getInstance("hotel1",25,15);
        Hotel hotel2= Hotel.getInstance("hotel2",45,0);

        hotel1.rezervaCamera();
        hotel1.rezervaCamera();

        hotel2.rezervaCamera();
        hotel2.rezervaCamera();

    }
}
