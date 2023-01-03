public class MoreValues {

    public static void main(String[] args) {

        int[] values = { 1, 1, 2, 3, 4, 5, 8, 13, 21, 34};

        int[] moreValues = new int[20];
        System.arraycopy(values, 0, moreValues, 0, values.length);

        moreValues[9] = 55;
        System.out.println("moreValues[10]  is " + moreValues[10] );
    }
}
