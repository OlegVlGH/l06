package ru.ovk.home;

import java.util.Arrays;
import java.util.Scanner;

import static ru.ovk.home.constant.TerminalConst.*;

public class Main {
    public static void main(String[] args) {
        DisplayTerminalMess(args);
        final Scanner scaner = new Scanner(System.in);
        String command = "";
        while (!CMD_EXIT.equals(command)) {
            command = scaner.nextLine();
            DisplayTerminalMess(command);
        }
    }

    private static void DisplayTerminalMess(final String[] args) {
        String sCommand;
        if (args.length < 1) sCommand = "default";
        else sCommand = args[0];
        final int result = DisplayTerminalMess(sCommand);
       // System.exit(result);
    }

    private static int DisplayTerminalMess(final String sCommand) {
        switch (sCommand) {
            case CMD_ABOUT:
                return displayAbout();
            case CMD_VERSION:
                return displayVersion();
            case CMD_HELP:
                return displayHelp();
            case CMD_DEFAULT:
                return displayDefault();
            case CMD_EXIT:
                return displayExit();
            default:
                return displayErr();
        }
    }

    private static int displayVersion() {
        System.out.println(TELL_VERSION);
        return 0;
    }

    private static int displayAbout() {
        System.out.println(TELL_ABOUT);
        return 0;
    }

    private static int displayHelp() {
        System.out.println(TELL_HELP);
        return 0;
    }

    private static int displayDefault() {
        System.out.println("Welcome");
        return 0;
    }

    private static int displayErr() {
        System.out.println(TELL_ERROR);
        return -1;
    }

    private static int displayExit() {
        System.out.println(TELL_EXIT);
        return 0;
    }

}
