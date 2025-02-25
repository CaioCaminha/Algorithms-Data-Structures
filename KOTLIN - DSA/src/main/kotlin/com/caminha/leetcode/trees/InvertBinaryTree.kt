package com.caminha.leetcode.trees


/**
 * Better solution that I've came across alone but matches with Gregg Hogg.
 * This one we Swaps the Tree in place without extra memory allocation
 * Better Space Complexity and in Theory it's faster because we don't need to create a new Object
 * but leetcode doesn't agree with that.
 * */
fun invertTree(root: TreeNode?): TreeNode? {
    if(root == null) return null

    val newRight = root.left
    root.left = root.right
    root.right = newRight

    invertTree(root.right)
    invertTree(root.left)

    return root
}

fun anotherInvertTree(root: TreeNode?): TreeNode? {
    if(root == null) return null

    /**
     * Worse Space Complexity because creates a new TreeNode resulting in
     * More memory allocation
     * */
    var left = anotherInvertTree(root.right)
    var right = anotherInvertTree(root.left)
    var result = TreeNode(root.`val`)
    result.right = right
    result.left = left
    return result
}