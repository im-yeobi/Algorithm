package tree;

import java.util.Objects;

/**
 * @author yeobi Created 2020-02-21
 * @description 중위순회
 */
public class InorderTraverse implements TreeTraverse {

    @Override
    public void traverse(BinaryTreeNode node) {
        if (Objects.isNull(node)) {
            return;
        }

        traverse(node.getLeftSubTree());    // 왼쪽 서브 트리
        System.out.print(node.toString()); // 루트
        traverse(node.getRightSubTree());   // 오른쪽 서브 트리
    }

}
