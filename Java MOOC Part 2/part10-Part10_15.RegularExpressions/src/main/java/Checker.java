

public class Checker {

    public boolean isDayOfWeek(String string){
        if (string.matches("sun")){
            return true;
        }else if(string.matches("mon")){
            return true;
        }else if(string.matches("tue")){
            return true;
        }else if(string.matches("wed")){
            return true;
        }else if(string.matches("thu")){
            return true;
        }else if(string.matches("fri")){
            return true;
        }else if(string.matches("sat")){
            return true;
        }
        return false;
    }
    public boolean allVowels(String string){
        return string.matches("[aeiou]{1,}");
    }
    public boolean timeOfDay(String string){
        return string.matches("([01]+[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
    }
    
}
