package com.caminha.leetcode.trees

import com.caminha.leetcode.LinkedLists.ListNode
import com.sun.source.tree.BinaryTree


class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class BinarySearchTree {
    var root = TreeNode(0)
}

fun call(root: TreeNode?, num: Int): Int? {
    return traverse(root, num)?.`val`
}

fun traverse(root: TreeNode?, num: Int): TreeNode? {
    if (root == null) { return null }
    if(num == root.`val`) {
        println("Found it ${root.`val`}")
        return  root
    }

    if(root.`val` > num) {
        traverse(root.left, num)
    } else{
        traverse(root.right, num)
    }
    return root
}

fun main() {
    println(
        call(
            root = TreeNode(5).apply {
                left = TreeNode(1).apply {
                    left = TreeNode(-1).apply {}
                    right = TreeNode(3).apply {}
                }
                right = TreeNode(8).apply {
                    left = TreeNode(7).apply {}
                    right = TreeNode(9).apply {}
                }
            },
            num = 9
        )
    )
}

