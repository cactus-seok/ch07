class InstanceofTest {
    public static void main(String[] args) {
        FireEngine2 fe2 = new FireEngine2();

        if(fe2 instanceof FireEngine2){
            System.out.println("This is a FireEngine instance");
        }

        if(fe2 instanceof Car2){
            System.out.println("This is a Car instance");
        }

        if(fe2 instanceof Object){
            System.out.println("This is a Object instance");
        }

        System.out.println(fe2.getClass().getName());
    }
}
class Car2{}
class FireEngine2 extends Car2{}