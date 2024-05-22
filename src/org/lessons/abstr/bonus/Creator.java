package org.lessons.abstr.bonus;

public abstract class Creator {

    public static Object create(String object){
        if (object.equals("dvd")){
            Dvd dvd = new Dvd();
            return dvd;
        } else if (object.equals("playstation")) {
            PlayStation playStation = new PlayStation();
            return playStation;
        }else {
            return null;
        }
    }
}
