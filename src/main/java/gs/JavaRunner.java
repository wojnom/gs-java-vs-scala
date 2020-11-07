package main.java.gs;

public class JavaRunner {

    public static void main(String[] args) {
        HigherOneJ higher = new HigherOneJ();
        LowerOneJ lower = new LowerOneJ();
        System.out.println("Hey, Java coder (really?!?!?!?!)" +
                "\nMessage from higher one is:\n" + higher.centralMethod() +
                "\nMessage from lower one is:\n" + lower.centralMethod());
    }

}
