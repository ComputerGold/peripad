package qhe.gold.peripad;

public class Main {
    public static void main(String[] args){
        int Version = 3;
        if (args.length == 1 && args[0] == "-devmode"){
            boolean devmode = true;
        }
        else{
            boolean devmode = false;
        }
        PeriPad peripad = new PeriPad();
    }
}
