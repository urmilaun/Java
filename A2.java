abstract class Compartment {
    abstract void notice();
}

class FirstClass extends Compartment {
    public void notice() {
        System.out.println("THIS IS FIRST CLASS DEPARTMENT !!!");
    }
}

class Ladies extends Compartment {
    public void notice() {
        System.out.println("THIS IS LADIES DEPARTMENT !!!");
    }
}

class General extends Compartment {
    public void notice() {
        System.out.println("THIS IS GENERAL DEPARTMENT !!!");
    }
}

class Luggage extends Compartment {
    public void notice() {
        System.out.println("THIS IS LUGGAGE DEPARTMENT !!!");
    }
}




