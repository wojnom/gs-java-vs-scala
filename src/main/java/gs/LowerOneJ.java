package main.java.gs;

public class LowerOneJ extends HigherOneJ {

    String myNameLocal = this.getClass().getSimpleName();

    @Override
    public String firstOne() {
        return myNameLocal;
    }
}
