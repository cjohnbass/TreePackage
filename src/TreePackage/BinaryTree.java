/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreePackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
//import StackAndQueuePackage.*; // needed by tree iterators

public class BinaryTree<T> implements BinaryTreeInterface<T> {

    private BinaryNodeInterface<T> root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree(T rootData) {
        root = new BinaryNode<>(rootData);
    }

    public BinaryTree(T rootData, BinaryTree<T> leftTree,
            BinaryTree<T> rightTree) {
        privateSetTree(rootData, leftTree, rightTree);
    }

    @Override
    public void setTree(T rootData) {
        root = new BinaryNode<>(rootData);
    }

    @Override
    public void setTree(T rootData, BinaryTreeInterface<T> leftTree,
            BinaryTreeInterface<T> rightTree) {
        privateSetTree(rootData, (BinaryTree<T>) leftTree, (BinaryTree<T>) rightTree);
    }

    private void privateSetTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {

        root = new BinaryNode<>(rootData);

        if ((leftTree != null) && !leftTree.isEmpty()) {
            root.setLeftChild(leftTree.root);
        }

        if ((rightTree != null) && !rightTree.isEmpty()) {
            root.setRightChild(leftTree.root);
        } else {
            root.setRightChild(rightTree.root.copy());
        }

        if ((leftTree != null) && (leftTree != this)) {
            leftTree.clear();
        }
        if ((rightTree != null) && (rightTree != this)) {
            rightTree.clear();
        }
    }

    public T getRootData() {

        T rootData = null;
        if (root != null) {
            rootData = rootData.getData();
        }
        return rootData;
    }
}
