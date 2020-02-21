package tree;

import java.util.Stack;

/**
 * @author yeobi Created 2020-02-21
 * @description 수식트리
 */
public class ExpressionTree {

    public BinaryTreeNode makeExpressionTree(String exp) {
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode binaryTree = null;

        for (int i = 0; i < exp.length(); i++) {
            char el = exp.charAt(i);
            if (isOperator(el)) {
                binaryTree = new BinaryTreeNode(new Data(el));
                binaryTree.addRightSubTree(stack.pop());
                binaryTree.addLeftSubTree(stack.peek());
            } else {
                binaryTree = new BinaryTreeNode(new Data(el - '0'));
            }
            stack.push(binaryTree);
        }

        return stack.pop();
    }

    private boolean isOperator(char el) {
        switch (el) {
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
            default:
                return false;
        }
    }

    public void treeTraverse(TreeTraverse treeTraverse, BinaryTreeNode binaryTree) {
        treeTraverse.traverse(binaryTree);
    }

    public int calculateExpressionTree(BinaryTreeNode binaryTree) {
        int op1, op2;

        if (binaryTree.getLeftSubTree() == null && binaryTree.getRightSubTree() == null) {
            return binaryTree.getData().getValue();
        }

        op1 = calculateExpressionTree(binaryTree.getLeftSubTree());
        op2 = calculateExpressionTree(binaryTree.getRightSubTree());

        switch (binaryTree.getData().getValue()) {
            case Data.ADDITION:
                return op1 + op2;
            case Data.SUBTRACT:
                return op1 - op2;
            case Data.MULTIPLY:
                return op1 * op2;
            case Data.DIVISION:
                return op1 / op2;
        }

        return 0;
    }

}
