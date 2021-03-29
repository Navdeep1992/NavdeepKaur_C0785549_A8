package NavdeepKaur_C0785549_A8;

import javax.swing.*;
import java.util.*;

public class Temperature {
    static int  n = Integer.parseInt(JOptionPane.showInputDialog("Enter the total number of days \n"));
    String[] day = new String[n];
    double[] temperature = new double[n];
    double[] speed = new double[n];

    public static void main(String[] args) {
        Temperature tem = new Temperature();
        for (int i = 0; i< Temperature.n; i++) {
            String day = tem.getDay();
            double temperature = tem.getTemperature(day);
            double speed = tem.getWindSpeed(day);
            tem.temperature[i] = temperature;
            tem.day[i] = day;
            tem.speed[i] = speed;
            System.out.println(day);
            System.out.println(temperature);
            System.out.println(speed);
        }

        TempTest.testTemperature(tem.day,tem.temperature,tem.speed);
        System.out.println(Arrays.toString(tem.temperature));
        System.out.println(Arrays.toString(tem.speed));
        System.out.println(Arrays.toString(tem.day));
    }

    public double getTemperature(String day){
        double temp = 0;
        temp = Double.parseDouble(JOptionPane.showInputDialog("Please enter the temperature of the " + day));
        return temp;
    }
    public String getDay(){
        String  day = "";
        day = JOptionPane.showInputDialog("Please enter the Day: ");
        return day;
    }
    public double getWindSpeed(String day){
        double speed = 0;
        speed = Double.parseDouble(JOptionPane.showInputDialog("Please enter the speed of the wind of the day " + day));
        return speed;
    }
}
