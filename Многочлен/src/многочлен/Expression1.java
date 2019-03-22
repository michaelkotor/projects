/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package многочлен;

/**
 *
 * @author milan
 */
public class Expression1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Poly n = new Poly(3);
        n.add(2, 2);
        n.add(1, 4);
        n.add(0, 1);
        System.out.println(n.Meaning(n, 3));

        LinkList pol1 = new LinkList();
        for (int i = 1; i < 4; i++) {
            pol1.insertFirst(i, i + 1);
        }
        pol1.displayList();

        LinkList pol2 = new LinkList();
        for (int i = 1; i < 4; i++) {
            pol2.insertFirst(i, i + 1);
        }
        pol2.displayList();
        LinkList pol3 = new LinkList();
        Link current1 = pol1.first;
        Link current2 = pol2.first;
        int f3;
        while (current1 != null) {
            int f1 = current1.getFactor();
            int f2 = current2.getFactor();

            int p1 = current1.getPower();
            int p2 = current2.getPower();

            if (p1 == p2) {
                f3 = f1 + f2;
                pol3.insertFirst(f3, p2);
            } else {
                pol3.insertFirst(f2, p2);
                //сдеалть разные степени ДЗ
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        pol3.displayList();
        //
    }
}
