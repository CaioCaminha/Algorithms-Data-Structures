package com.caminha.leetcode.trees

import java.util.LinkedList
import java.util.Queue
import java.util.Stack



fun maxDepth(root: TreeNode?): Int {
    if(root == null) return 0

    val left = maxDepth(root.left)
    val right = maxDepth(root.right)

    return 1 + maxOf(left, right)
}