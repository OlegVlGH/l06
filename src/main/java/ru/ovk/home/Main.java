package ru.ovk.home;

import java.util.Arrays;
import static ru.ovk.home.constant.TerminalConst.*;

public class Main {

    public static void main(String[] args) {
        DisplayTerminalMess(args);
    }


    private static void DisplayTerminalMess(final String[] args){
        String sCommand="";

        if(args.length<1 || args==null)  sCommand = "default";
        else  sCommand=args[0];

        switch (sCommand){
         case CMD_ABOUT:   System.out.println(TELL_ABOUT);    break;
         case CMD_VERSION: System.out.println(TELL_VERSION);  break;
         case CMD_HELP:    System.out.println(TELL_HELP);     break;
         case CMD_DEFAULT: System.out.println(TELL_DEFAULT);  break;
         default:      System.out.println(TELL_ERROR);
        }
     return;

    }




}
