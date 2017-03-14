package pacman;

import java.util.Scanner;

public class MainPacman {

    public static void main(String[] args) {
        System.out.println("Let's play Pacman M8");
        Scanner in = new Scanner(System.in);
        pacman pacman1 = new pacman();
        int[][] a = new int[8][8];
        int poin = 0, lang = 0;
        String x;
        a[1][5] = 4;
        a[3][3] = 4;
        a[5][2] = 4;
        do {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (a[i][j] != 4) {
                        a[i][j] = 2;
                        if (j == 0 || i == 0 || j == 7 || i == 7 || i == 2 && j == 1 || i == 2 && j == 2 || i == 2 && j == 3 || i == 2 && j == 4 || i == 2 && j == 5 || i == 4 && j == 2 || i == 4 && j == 3 || i == 4 && j == 4 || i == 4 && j == 5 || i == 4 && j == 6) {
                            a[i][j] = 1;
                        }
                    }

                }

            }
            if (a[pacman1.getY()][pacman1.getX()] == 4) {
                a[pacman1.getY()][pacman1.getX()] = 3;
                poin = poin + 1;
            }
            a[pacman1.getY()][pacman1.getX()] = 3;
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (a[i][j] == 1) {
                        System.out.print("X");
                    }
                    if (a[i][j] == 2) {
                        System.out.print(" ");
                    }
                    if (a[i][j] == 3) {
                        System.out.print("@");
                    }
                    if (a[i][j] == 4) {
                        System.out.print("$");
                    }
                }
                System.out.println();
            }
            System.out.print("a = kiri , w = atas , s = bawah , d = kanan , masukkan inputan = ");
            x = in.nextLine();

            switch (x) {
                case "a":
                    pacman1.setKiri();
                    if (pacman1.getX() == 0) {
                        pacman1.setKanan();
                    } else if (a[pacman1.getY()][pacman1.getX()] == 1) {
                        pacman1.setKanan();
                    }
                    break;
                case "d":
                    pacman1.setKanan();
                    if (pacman1.getX() == 7) {
                        pacman1.setKiri();
                    } else if (a[pacman1.getY()][pacman1.getX()] == 1) {
                        pacman1.setKiri();
                    }
                    break;
                case "w":
                    pacman1.setAtas();
                    if (pacman1.getY() == 0) {
                        pacman1.setBawah();
                    } else if (a[pacman1.getY()][pacman1.getX()] == 1) {
                        pacman1.setBawah();
                    }
                    break;
                case "s":
                    pacman1.setBawah();
                    if (pacman1.getY() == 7) {
                        pacman1.setAtas();
                    } else if (a[pacman1.getY()][pacman1.getX()] == 1) {
                        pacman1.setAtas();
                    }
                    break;
            }

            lang = lang + 1;
            if (lang >= 20 ) {
                break;
            }
            System.out.println("poin : "+poin);
            System.out.println(lang);
        } while (poin < 3);
        if (lang >= 20) {
            System.out.println("Get Rekt M8");
        }else {System.out.println("Good moves scrubs");}
        System.out.print("langkah yang anda tempuh :"+lang);

    }
}
