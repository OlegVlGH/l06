package ru.ovk.home;

import java.util.Arrays;
import static ru.ovk.home.constant.TerminalConst.*;
import static ru.ovk.home.constant.TerminalMessageConst.*;
public class Main {

    public static void main(String[] args) {
        DisplayTerminalMess(args);
    }


    private static void DisplayTerminalMess(final String[] args){
        String sCommand="";

        if(args.length<1 || args==null)  sCommand = "default";
        else  sCommand=args[0];

        switch (sCommand){
         case ABOUT:   System.out.println(MABOUT); break;
         case VERSION: System.out.println(MVERSION);break;
         case HELP:    System.out.println(MHELP);break;
         case DEFAULT: System.out.println(MDEFAULT);break;
         default:      System.out.println(MERROR);
        }
     return;

    }




}
