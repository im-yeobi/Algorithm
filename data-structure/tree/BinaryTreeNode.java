package tree;

/**
 * @author yeobi Created 2020-02-21
 * @description 이진트리
 */
public class BinaryTreeNode {

    private Data data;
    private BinaryTreeNode left;
    private BinaryTreeNode right;

    // 초기화
    public BinaryTreeNode(Data data) {
        this.data = data;
    }

    // getter
    public Data getData() {
        return data;
    }

    // 왼쪽 서브 트리 반환
    public BinaryTreeNode getLeftSubTree() {
        return left;
    }

    // 오른쪽 서브 트리 반환
    public BinaryTreeNode getRightSubTree() {
        return right;
    }

    // 왼쪽 서브 트리 추가
    public void addLeftSubTree(BinaryTreeNode subTree) {
        left = subTree;
    }

    // 오른쪽 서브 트리 추가
    public void addRightSubTree(BinaryTreeNode subTree) {
        right = subTree;
    }

    @Override
    public String toString() {
        return "[" + data + "] ";
    }

}
