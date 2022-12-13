import java.util.*;

public class L6 {

    public static void main(String[] args) {
//        KindaSet k1 = new KindaSet();
//        Set<Integer> ints = new HashSet<>();
//
//        k1.meth_add(5);
//        k1.meth_add(7);
//        k1.meth_add(13);
//
//        System.out.println(k1.meth_Size());
//        System.out.println(k1.meth_toString());
//        for (int i = 0; i < 10; i++) {
//            int rK =new Random().nextInt(-10,10);
//            System.out.printf("  %d", rK);
//            k1.meth_add(rK);
//            ints.add(rK);
//        }
//        System.out.println("\n"+k1.meth_toString());
//
//        for (int i: ints) {
//            System.out.printf("%d  ", i);
//        }
//        System.out.println();
//
//        Iterator<Integer> paddle = ints.iterator();
//        while (paddle.hasNext()){
//            int i = paddle.next();
//            if (i<0) paddle.remove();
//        }
//
//        ints.forEach(i-> {
//            i++;
//            System.out.printf("%d  ", i);
//        });
//
//        List<Integer> a = ints.stream().filter(ints :: contains).collect(Collectors.toList());
//        System.out.println(a);

        reverseComparator compy = new reverseComparator();
        CustomTSet tree = new CustomTSet();

        for (int i = 0; i < 10; i++) {
            int r = new Random().nextInt(-10,10);
            System.out.printf("%d   ", r);
            tree.m_add(r);
        }
        System.out.println();

        tree.m_show();

        TreeSet<Integer> properTree = new TreeSet<>(compy);
        for (int i = 0; i < 6; i++) {
            int r = new Random().nextInt(-10,10);
            System.out.printf("%d   ", r);
            properTree.add(r);
        }
        System.out.println();
        System.out.println(properTree);

    }
}
