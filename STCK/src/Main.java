import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> mass1 = new ArrayList<>();
        ArrayList<Integer> mass2 = new ArrayList<>();
        mass1.add(1);
        mass1.add(2);
        mass1.add(3);
        mass1.add(4);
        mass1.add(5);
        mass1.add(6);
        mass1.add(7);
        mass1.add(8);

        mass2.add(13);
        mass2.add(23);
        mass2.add(33);
        mass2.add(43);
        mass2.add(53);
        mass2.add(63);
        mass2.add(73);
        mass2.add(83);
        mass2.add(93);


        for (int i = 0; i < mass1.size(); i++) {
            System.out.print(mass1.get(i) + " ");
        }
        System.out.println("");
        System.out.println("HI");
        for (int i = 0; i < mass2.size(); i++) {
            System.out.print(mass2.get(i) + " ");
        }
        System.out.println("");

        merge(mass1, mass2);

    }




    public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> third = new ArrayList<>();
        for (int k = 0; k < a.size() + b.size(); k++) {
            if (i > a.size() - 1) {
                int temp = b.get(j);
                third.add(k, temp);
                j++;
            } else if (j > b.size() - 1) {
                int temp = a.get(i);
                third.add(k, temp);
                i++;
            } else if (a.get(i) < b.get(i)) {
                int temp = a.get(i);
                third.add(k, temp);
                i++;
            } else {
                int temp = b.get(j);
                third.add(k, temp);
                j++;
            }
        }
        a = third;
        for (Integer x : a) {
            System.out.print(x + " ");
        }
    }
}