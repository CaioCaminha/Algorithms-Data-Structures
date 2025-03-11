package com.caminha.leetcode.trees

import kotlin.math.max


/**
 * diameter = left_height + right_height
 * */
fun diameterOfBinaryTree(root: TreeNode?): Int {
    val maxDiameter = mutableListOf<Int>(1)

    fun height(root: TreeNode?): Int {
        if(root == null) return 0

        val leftHeight = height(root.left)
        val rightHeight = height(root.right)
        val diameter = leftHeight + rightHeight

        maxDiameter[0] = max(maxDiameter[0], diameter)

        return 1 + Math.max(leftHeight, rightHeight)
    }

    height(root)

    return maxDiameter[0]
}

fun longestPathWithConstant(root: TreeNode?): Int {
    if(root == null) return 0

    val leftHeight = longestPath(root.left)
    if(leftHeight == -1) return -1

    val rightHeight = longestPath(root.right)
    if(rightHeight == -1) return -1

    //If the diference between left and right heigh it's greater than 1 the tree is unbalanced
    if(Math.abs(leftHeight - rightHeight) > 1) return -1

    return 1 + Math.max(leftHeight, rightHeight)
}

fun longestPath(root: TreeNode?): Int {
    //base case is when the root is null ->  return 0
    if(root == null) return 0

    // return 1 + the max of the greater one
    // This is calculating the MAX heigh
    return 1 + Math.max(heighClone(root.left), heighClone(root.right))
}


fun main() {
    println(
        longestPath(
            TreeNode(1).apply {
                left = TreeNode(2)
                    .apply {
                        left = TreeNode(4)
                        right = TreeNode(5)
                    }
                right = TreeNode(3)
            }
        )
    )
}