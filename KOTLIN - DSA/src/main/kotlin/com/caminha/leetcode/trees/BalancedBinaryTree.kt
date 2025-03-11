package com.caminha.leetcode.trees

import kotlin.math.abs

fun isBalanced(root: TreeNode?): Boolean {
    return height(root) != -1
}

/**
 * This function it's also checking if the tree is balanced
 * That's the reason why it's returning -1 when the tree is not balanced
 * */
fun height(root: TreeNode?): Int {
    if(root == null) return 0

    val leftHeight = height(root.left)
    if(leftHeight == -1) return -1

    val rightHeight = height(root.right)
    if(rightHeight == -1) return -1

    //If the diference between left and right heigh it's greater than 1 the tree is unbalanced
    if(Math.abs(leftHeight - rightHeight) > 1) return -1

    //returning 1 + max value of left and right height.
    //1 counts for the current node itself
    return 1 + Math.max(leftHeight, rightHeight)
}


//Basic example of calculating the heigh of a binary tree
// Mostly will be recursion
fun heighClone(root: TreeNode?): Int {
    //base case is when the root is null ->  return 0
    if(root == null) return 0

    // return 1 + the max of the greater one
    // This is calculating the MAX heigh
    return 1 + Math.max(heighClone(root.left), heighClone(root.right))
}

fun isBalancedPython(root: TreeNode?): Boolean {
    var balanced = true

    fun heighPython(root: TreeNode?): Int{
        if(root == null) return 0

        val leftHeight = heighPython(root.left)
        if(!balanced) return 0

        val rightHeight = heighPython(root.right)
        if(abs(leftHeight - rightHeight) > 1) {
            balanced = false
            return 0
        }

        return 1 + Math.max(leftHeight, rightHeight)
    }
    heighPython(root)
    return balanced
}

