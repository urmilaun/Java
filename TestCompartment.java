public class TestCompartment {
    public static void main(String[] args) {
        Compartment Arr[] = new Compartment[10];
        Compartment Arr1 = new FirstClass();
        Compartment Arr2 = new Ladies();
        Compartment Arr3 = new General();
        Compartment Arr4 = new Luggage();

        Arr[1] = Arr1;
        Arr[2] = Arr2;
        Arr[3] = Arr3;
        Arr[4] = Arr4;

        int RandomNumber = (int) (Math.random() * 4) + 1;
        Arr[RandomNumber].notice();

        TestCompartment t1=new TestCompartment();
    }

}
