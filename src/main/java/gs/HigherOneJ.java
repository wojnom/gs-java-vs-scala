package main.java.gs;

public class HigherOneJ {

    String myName = this.getClass().getSimpleName();

//    public HigherOneJ

    public final String constantOne = " (done)";

    public String firstOne() {
        return myName;
    }

    public String secondOne() {
        return java.time.LocalTime.now().toString();
    }

    public String centralMethod() {
        return firstOne() + " at " + secondOne() + " " + constantOne;
    }

}
