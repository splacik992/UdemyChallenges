package Tabs;

import java.util.Arrays;
import java.util.List;

public class Tabs {

    private static List<String> taa() {

        String[] tab = new String[5];

        tab[0] = "A";
        tab[1] = "B";
        tab[2] = "C";
        tab[3] = "D";
        tab[4] = "E";
        return Arrays.asList(tab);

    }

    private static double[] tab1(double[] a) {
        return new double[]{a[2], a[1], a[0]};

    }

    public static void main(String[] args) {

        Tabs a = new Tabs();
        System.out.println(Tabs.taa());

        //noinspection ResultOfMethodCallIgnored
        System.out.println(Arrays.toString(tab1(new double[]{1, 2, 3})));


    }

}
