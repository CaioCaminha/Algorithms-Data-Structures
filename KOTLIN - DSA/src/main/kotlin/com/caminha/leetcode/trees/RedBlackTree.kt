package com.caminha.leetcode.trees

import com.sun.source.tree.Tree

class RedBlackTree<T>(
    val root: RedBlackTree<T>?,
    val left: RedBlackTree<T>?,
    val right: RedBlackTree<T>?,
    val isRed: Boolean,
    var value: T
) {

    inline fun <reified T> inser(root: RedBlackTree<T>?): RedBlackTree<T>? {

    }




}

data class TreeNode(var value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
