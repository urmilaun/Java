//step 1
abstract class Instrument {
    abstract void play();
}

class Piano extends Instrument {
    public void play() {
        System.out.println("Piano is Playing : tan tan tan tan");
    }
}

class Flute extends Instrument {
    public void play() {
        System.out.println("Flute is Playing : toot toot toot toot");
    }
}

class Guiter extends Instrument {
    public void play() {
        System.out.println("Piano is Playing : tin tin tin tin");
    }
}

public class A1 {
    Instrument obj[];

    public A1() {
        obj = new Instrument[10];
        obj[0] = new Piano();
        obj[1] = new Piano();
        obj[2] = new Piano();
        obj[3] = new Piano();
        obj[4] = new Flute();
        obj[5] = new Flute();
        obj[6] = new Flute();
        obj[7] = new Guiter();
        obj[8] = new Guiter();
        obj[9] = new Guiter();

        for (int i = 0; i < obj.length; i++) {
            if (obj[i] instanceof Piano) {
                System.out.println("Object of Piano class is stored at index : " + i);
            } else if (obj[i] instanceof Flute) {
                System.out.println("Object of Flute class is stored at index : " + i);
            } else {
                System.out.println("Object of Guiter class is stored at index : " + i);
            }

        }
    }

    public static void main(String[] args) {

        A1 obj1 = new A1();

    }
}