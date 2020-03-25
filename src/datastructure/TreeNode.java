package datastructure;

public class TreeNode {
    int value;

    TreeNode lNode;
    TreeNode rNode;
    public TreeNode(int value){
        this.value = value;
    }

    public void setlNode(TreeNode lNode) {
        this.lNode = lNode;
    }

    public void setrNode(TreeNode rNode) {
        this.rNode = rNode;
    }
    //前序遍历
    public void frontShow(){
        System.out.println(value);
        if (lNode != null)
            lNode.frontShow();
        if (rNode != null)
            rNode.frontShow();
    }
    //中序遍历
    public void midShow(){
        if (lNode != null)
            lNode.midShow();
        System.out.println(value);
        if (rNode != null)
            rNode.midShow();
    }
    //后序遍历
    public void afterShow(){
        if (lNode != null)
            lNode.afterShow();
        if (rNode != null)
            rNode.afterShow();
        System.out.println(value);
    }
    //前序查找
    public TreeNode frontSearch(int tag){
        TreeNode target = null;
        if (this.value == tag){
            return this;
        }else {
            if (lNode != null)
                target = lNode.frontSearch(tag);

            if (target != null)
                return target;

            if (rNode != null)
                target = rNode.frontSearch(tag);
        }
        return target;
    }
    //中序查找
    public TreeNode midSearch(int tag){
        TreeNode target = null;
        if (lNode != null)
            target = lNode.midSearch(tag);
        if (this.value == tag)
            return this;
        if (target != null)
            return target;
        if (rNode != null)
            target = rNode.midSearch(tag);
        return target;
    }
    //后序查找
    public TreeNode afterSearch(int tag){
        TreeNode target = null;
        if (lNode != null)
            target = lNode.afterSearch(tag);
        if (target != null)
            return target;
        if (rNode != null)
            target = rNode.afterSearch(tag);
        if (this.value == tag)
            return this;
        return target;
    }
    //删除子树
    public void delete(int tag){
        TreeNode parent = this;
        if (parent.lNode != null && parent.lNode.value == tag){
            parent.lNode = null;
            return;
        }
        if (parent.rNode != null && parent.rNode.value == tag){
            parent.rNode = null;
            return;
        }
        parent = lNode;
        if (parent != null)
            parent.delete(tag);
        parent = rNode;
        if (parent != null)
            parent.delete(tag);
    }
}
