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
         case ABOUT:   System.out.println("тестовое приложение"); break;
         case VERSION: System.out.println("О приложении");break;
         case HELP:    System.out.println("Помощь" + "\n vesrsion  версия приложения" + "\n about о приложении");break;
         case DEFAULT: System.out.println("умолчание");break;
         default:      System.out.println("Нет такой команды");
        }
     return;

    }




}
