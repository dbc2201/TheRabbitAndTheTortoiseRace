/*   Created by IntelliJ IDEA.
 *   Author: Nishant Mishra (NishantMishra-1)
 *   Date: 29-10-2020
 *   Time: 14:54
 *   File: Rabbit.java
 */

package thread.rabbit;

import javax.swing.*;

public class Rabbit implements Runnable {

    private static final int MILESTONES = 5;

    private final Thread rabbit;

    public Rabbit() {
        this.rabbit = new Thread(this, "Rabbit");
    }

    public Thread getRabbit() {
        return rabbit;
    }

    @Override
    public void run() {
        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {
                case 0:
                    System.out.println("The Rabbit has started from the start line!");
                    break;
                case 1:
                    System.out.println("The Rabbit has reached the Cool River!");
                    break;
                case 2:
                    System.out.println("The Rabbit has reached the Mountain Hill!");
                    break;
                case 3:
                    System.out.println("The Rabbit has reached the Big Oak Tree!");
                    System.out.println("The Rabbit is leading and hence is going to sleep!");
                    try {
                        Thread.sleep(9000L);
                    } catch (InterruptedException e) {
                        System.err.println("The Rabbit's sleep got interrupted!");
                    }
                    break;
                case 4:
                    System.out.println("The Rabbit has reached the finish line!");
                    break;
            }
            try {
                Thread.sleep(1500L);
            } catch (InterruptedException e) {
                System.err.println("The rabbit has lost the path!");
            }
        }
        JOptionPane.showConfirmDialog(
                null,
                "The Rabbit has completed the race!",
                "Rabbit",
                JOptionPane.OK_CANCEL_OPTION
        );
    }
}
