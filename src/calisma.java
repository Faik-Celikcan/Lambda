import java.util.*;

public class calisma {

    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(4,2,6,11,-5,7,3,15));

        seko(sayi);


    }
    public static boolean tek(int a){

        return a%2!=0;
    }
    public static void s(){


    }
    public static void seko( List<Integer> sayi){

        sayi.stream().filter(t-> t%2==0).map(t->t*t).sorted().forEach(Lambda01::yazdir);

    }

}
