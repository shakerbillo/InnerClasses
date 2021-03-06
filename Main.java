package com.shaker;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
//	Gearbox jaguar = new Gearbox(6);
//    jaguar.operateClutch(true);
//    jaguar.changeGear(1);
//    jaguar.operateClutch(false);
//    System.out.println(jaguar.wheelSpeed(1000));
//    jaguar.changeGear(2);
//    System.out.println(jaguar.wheelSpeed(2000));
//    jaguar.operateClutch(true);
//    jaguar.changeGear(3);
//    jaguar.operateClutch(false);
//    System.out.println(jaguar.wheelSpeed(8000));

//        class ClickListener implements Button.OnClickListener {   // Local class
//            public ClickListener(){
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());

        btnPrint.setOnClickListener(new Button.OnClickListener() {   // anonymous class
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked" );

            }
        });
        listen();
    }
    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;

                case 1:
                    btnPrint.onClick();
            }
        }

    }
}
