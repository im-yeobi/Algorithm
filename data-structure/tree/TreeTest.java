package tree;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author yeobi Created 2020-02-21
 */
public class TreeTest {

    @Test
    public void init() {
        BinaryTreeNode binaryTree = new BinaryTreeNode(new Data(1));

        assertThat(binaryTree).isNotNull();
        assertThat(binaryTree.getData()).isNotNull();
    }

    @Test
    public void getLeftSubTree() {
        BinaryTreeNode binaryTree = new BinaryTreeNode(new Data(1));
        binaryTree.addLeftSubTree(new BinaryTreeNode(new Data(4)));

        BinaryTreeNode leftSubTree = binaryTree.getLeftSubTree();

        assertThat(leftSubTree.getData().getValue()).isEqualTo(4);
    }

    @Test
    public void getRightSubTree() {
        BinaryTreeNode binaryTree = new BinaryTreeNode(new Data(1));
        binaryTree.addRightSubTree(new BinaryTreeNode(new Data(3)));

        BinaryTreeNode rightSubTree = binaryTree.getRightSubTree();

        assertThat(rightSubTree.getData().getValue()).isEqualTo(3);
    }

    @Test
    public void traverse() {
        BinaryTreeNode binaryTree1 = new BinaryTreeNode(new Data(1));
        BinaryTreeNode binaryTree2 = new BinaryTreeNode(new Data(2));
        BinaryTreeNode binaryTree3 = new BinaryTreeNode(new Data(3));
        BinaryTreeNode binaryTree4 = new BinaryTreeNode(new Data(4));
        BinaryTreeNode binaryTree5 = new BinaryTreeNode(new Data(5));
        BinaryTreeNode binaryTree6 = new BinaryTreeNode(new Data(6));
        BinaryTreeNode binaryTree7 = new BinaryTreeNode(new Data(7));

        // binaryTree2 자식 노드
        binaryTree2.addLeftSubTree(binaryTree4);
        binaryTree2.addRightSubTree(binaryTree5);

        // binaryTree3 자식 노드
        binaryTree3.addLeftSubTree(binaryTree6);
        binaryTree3.addRightSubTree(binaryTree7);

        // binaryTree1 서브 트리
        binaryTree1.addLeftSubTree(binaryTree2);
        binaryTree1.addRightSubTree(binaryTree3);

        // 순회
//        TreeTraverse traverse = new PreorderTraverse();
        TreeTraverse traverse = new InorderTraverse();
//        TreeTraverse traverse = new PostorderTraverse();

        traverse.traverse(binaryTree1);
        System.out.println();
    }

}
