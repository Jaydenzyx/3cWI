package at.jayden.project.basics.calculator;

public class main {
    public static void main(String[] args) {
        BasicCalculator b1 = new BasicCalculator();
        b1.add(5, 6);
        b1.sub(5, 6);
        b1.mul(5, 6);
        b1.div(5, 6);

        ScienceCalculator s1 = new ScienceCalculator();
        s1.sin(30);
        s1.cos(30);
        s1.sqrt(30);

    }
}
