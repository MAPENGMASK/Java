package datastructure.bst;

public class TestBst {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 10, 12, 1, 9};

        BinarySortTree bst = new BinarySortTree();

        for (int i:arr){
            bst.add(new Node(i));
        }
        //遍历
        bst.midShow();
        //查找
        //System.out.println(bst.search(20));
        //查找父节点
        //System.out.println(bst.searchParent(1).value);
        //delete son node
        System.out.println("---------");
        //bst.delete(12);
        bst.delete(10);
        bst.midShow();
    }
}
