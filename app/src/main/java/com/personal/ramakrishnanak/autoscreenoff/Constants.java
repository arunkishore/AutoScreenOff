package com.personal.ramakrishnanak.autoscreenoff;

/**
 * Created by ramakrishnanak on 03/03/16.
 */

public class Constants {
    public interface ACTION {
        public static String MAIN_ACTION = "com.personal.ramakrishnanak.autoscreenoff.action.main";
        public static String PREV_ACTION = "com.personal.ramakrishnanak.autoscreenoff.action.prev";
        public static String PLAY_ACTION = "com.personal.ramakrishnanak.autoscreenoff.action.play";
        public static String NEXT_ACTION = "com.personal.ramakrishnanak.autoscreenoff.action.next";
        public static String PAUSE_ACTION = "com.personal.ramakrishnanak.autoscreenoff.action.pause";
        public static String STARTFOREGROUND_ACTION = "com.personal.ramakrishnanak.autoscreenoff.action.startforeground";
        public static String STOPFOREGROUND_ACTION = "com.personal.ramakrishnanak.autoscreenoff.action.stopforeground";
    }

    public interface NOTIFICATION_ID {
        public static int FOREGROUND_SERVICE = 101;
    }
}