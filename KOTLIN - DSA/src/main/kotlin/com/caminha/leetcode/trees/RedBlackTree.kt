package com.caminha.leetcode.trees

class RedBlackTree<T>(
    var root: RedBlackTree<T>?,
    var parent: RedBlackTree<T>?,
    var left: RedBlackTree<T>?,
    var right: RedBlackTree<T>?,
    var isRed: Boolean,
    var value: T
) {

    fun rotate_left(u: RedBlackTree<T>) {
        var v = u.right
        u.right = v?.left

        if(v?.left != null) {
            v?.left?.parent = u
        }
        //makes u's parent v's parents
        v?.parent = u.parent
        if (u.parent == null) {
            u.parent = v
        } else if(u.parent?.left == u) { //check if u is a left child
            u.parent?.left = v //assign u's parent left child link to v
        } else { // is a right child
            u.parent?.right = v //assign u's parent right child link to v
        }

        //now makes V the parent of U and U a left child of V
        //I assume it's because U is less than V - It needs to be on the right
        v?.left = u
        u.parent = v
    }

    fun rotate_right(u: RedBlackTree<T>) {
        var v = u.left
        u.left = v?.right

        if(v?.right != null) {
            v?.right?.parent = u
        }

        v?.parent = u.parent
        if(u.parent == null) {
            u.parent = v
        } else if(u.parent?.right == u) {  // check if it's a right child

        }
    }




}


/**
 * helper function to shif nodes from one reference to another
 * new node will be placed at the old node location and the old node will be removed from the tree
 */
fun <T> RedBlackTree<T>.shiftNodes(old: RedBlackTree<T>, new: RedBlackTree<T>) {
    if(old.parent == null) {
        //this.parent = new -> if we assume that this would be the root node
        old.parent = new // means that old is the root
    } else if(old == old.parent?.left) {
        old.parent?.left = new // update the parent's left pointer to point to new
    } else { //old is a right child
        old.parent?.right = new // update the parent's right pointer to point to new
    }
    new.parent = old.parent
}

data class TreeNode(var value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
