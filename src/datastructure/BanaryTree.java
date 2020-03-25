package datastructure;

public class BanaryTree {
    TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }
    //前序遍历
    public void frontShow(){
        root.frontShow();
    }
    //中序遍历
    public void midShow(){
        root.midShow();
    }
    //后序遍历
    public void afterShow(){
        root.afterShow();
    }
    //前序查找
    public TreeNode frontSearch(int tag){
        return root.frontSearch(tag);
    }
    //中序查找
    public TreeNode midSearch(int tag){
        return root.midSearch(tag);
    }
    //后序查找
    public TreeNode afterSearch(int tag){
        return root.afterSearch(tag);
    }
    //删除子树
    public void delet(int tag){
        root.delete(tag);
    }
}
