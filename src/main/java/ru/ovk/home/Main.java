package ru.ovk.home;

import java.util.Arrays;
import static ru.ovk.home.constant.TerminalConst.*;

public class Main {

    public static void main(String[] args) {
        DisplayTerminalMess(args);
    }

    private static void DisplayTerminalMess(final String[] args){
        String sCommand;

        if(args.length<1)  sCommand = "default";
        else  sCommand=args[0];

        switch (sCommand) {
            case CMD_ABOUT:
                displayAbout();
                break;
            case CMD_VERSION:
                displayVersion();
                break;
            case CMD_HELP:
                displayHelp() ;
                break;
            case CMD_DEFAULT:
                displayDefault();
                break;
            default:
                displayErr();
        }

    }

    private  static void displayVersion() {
        System.out.println(TELL_VERSION);
        System.exit(0);
    }

    private  static void displayAbout() {
        System.out.println(TELL_ABOUT);
        System.exit(0);
    }

    private  static void displayHelp() {
        System.out.println(TELL_HELP);
        System.exit(0);
    }

    private  static void displayDefault() {
        System.out.println("Welcome");
        System.exit(0);
    }

    private  static void displayErr() {
        System.out.println(TELL_ERROR);
        System.exit(-1);
    }

}
