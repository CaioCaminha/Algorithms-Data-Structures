package com.caminha.leetcode.trees

import com.sun.source.tree.Tree

class RedBlackTree<T>(
    var root: RedBlackTree<T>?,
    var left: RedBlackTree<T>?,
    var right: RedBlackTree<T>?,
    var isRed: Boolean,
    var value: T
) {

    fun rotate_left(u: RedBlackTree<T>) {
        var v = u.right
        u.right = v?.left

        if(v?.left != null) {
            v?.left?.root = u
        }
        //makes u's parent v's parents
        v?.root = u.root
        if (u.root == null) {
            u.root = v
        } else if(u.root?.left == u) { //check if u is a left child
            u.root?.left = v //assign u's parent left child link to v
        } else { // is a right child
            u.root?.right = v //assign u's parent right child link to v
        }

        //now makes V the parent of U and U a left child of V
        //I assume it's because U is less than V - It needs to be on the right
        v?.left = u
        u.root = v
    }




}

data class TreeNode(var value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
