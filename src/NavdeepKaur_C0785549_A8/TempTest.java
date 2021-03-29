package NavdeepKaur_C0785549_A8;

import javax.swing.*;

public class TempTest {
    public static void testTemperature(String[] days, double[] temp, double[] speed){
        for (int i = 0; i < days.length; i++){
            double temperatureFeel = temp[i] - (temp[i] * speed[i])/100;
            JOptionPane.showMessageDialog(null,
                    "THe temperature is feeling like " + temperatureFeel + " on the day " + days[i]);
        }
    }
}
