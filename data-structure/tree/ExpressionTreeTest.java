package tree;

import org.junit.Test;

/**
 * @author yeobi Created 2020-02-21
 */
public class ExpressionTreeTest {

    @Test
    public void makeExpressionTree() {
        ExpressionTree expTree = new ExpressionTree();
        String exp = "12+7*";
        BinaryTreeNode binaryTree = expTree.makeExpressionTree(exp);

        // 전위 순회
        expTree.treeTraverse(new PreorderTraverse(), binaryTree);
        System.out.println();

        // 중위 순회
        expTree.treeTraverse(new InorderTraverse(), binaryTree);
        System.out.println();

        // 후위 순회
        expTree.treeTraverse(new PostorderTraverse(), binaryTree);
        System.out.println();

        int result = expTree.calculateExpressionTree(binaryTree);
        System.out.println("계산 결과 : " + result);
    }

}
