class Iphone{
    final int MODEL;
    final String COLOR;
    static int width = 70;
    static int height = 210;

    Iphone(int model, String color){
        MODEL = model;
        COLOR = color;
    }

    Iphone(){
        this(12, "SpaceGrey");
    }

    public String toString(){
        return MODEL +" "+ COLOR;
    }

}
class FinalIphoneTest{
    public static void main(String[] args) {
        Iphone ip = new Iphone(11, "RoseGold");
        System.out.println(ip.MODEL);
        System.out.println(ip.COLOR);
        System.out.println(ip);
    }
}
