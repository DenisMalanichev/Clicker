package com.company;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Scanner;

public class Main {
    /**delay in ms**/
    public static int delay;
    public static int clicks_count;
    public static Robot robot;

    public static void main(String[] args) {

        try {
            System.out.println("-------CLICKER STARTED-------");
           robot = new Robot();

            System.out.println("Enter number of clicks: ");
            Scanner scanner = new Scanner(System.in);
            clicks_count = scanner.nextInt();
            System.out.println("Enter the delay: ");
            delay = scanner.nextInt();

            System.out.println("Clicking will start in 5 sec");

            Thread.sleep(5000);

            for(int i =0; i<clicks_count; i++){
                click(InputEvent.BUTTON1_DOWN_MASK);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void click(int button){
        robot.mousePress(button);
        robot.delay(250);
        robot.mouseRelease(button);
        robot.delay(delay);
    }
}
