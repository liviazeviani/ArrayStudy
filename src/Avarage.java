public class Avarage {

    public static void main(String[] args) {

        float[] temp = {1.2F, 3.2F, 5.9F, 9.6F};

        float sum = 0.0F;
        for (int i = 0; i < temp.length; i++){
            sum += temp[i];
        }
        float avarage = sum/ temp.length;

        System.out.println("The avarage of the numbers is " + avarage);
    }
}
