package at.jayden.project.basics.Handy;

public class Main {

    public static void main(String[] args) {

     Cam c1 = new Cam("Canon", "EOS 5D", Cam.TYPE.low);
     SimCard s1 = new SimCard(1, 123456789);
     memorycard m1 = new memorycard(32, 1,c1);

        Handy h1 = new Handy("Samsung", "Galaxy S10", c1, s1, m1);

        h1.takepicture();



    }
}
