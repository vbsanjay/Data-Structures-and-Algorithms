# Array Representation of Binary Tree

![array representation of binary tree](img/representing%20binary%20tree%20as%20array.png)


# Important Formulas for Array to Binary Tree Representation
In a Binary Tree represented as an array:

## Formulas with 1-Based Indexing: (In Books)
- **Node at index `i`**:
  - To find the **left child node**, use the formula: `i * 2`
  - To find the **right child node**, use the formula: `(i * 2) + 1`
  - To find the **parent node**, use the formula: `i // 2`

## Formulas with 0-Based Indexing: (Practical Approach)
- **Node at index `i`**:
    - To find the left child node, use the formula: `2 * i + 1`
    - To find the right child node, use the formula: `2 * i + 2`
    - To find the parent node, use the formula: `(i - 1) // 2`

Apply these formulas to determine the relationships between nodes in the array when represented as a Binary Tree.

# Complete Binary Tree
- A binary tree, when represented as an array, has no empty indexes.
- A binary tree is considered a complete binary tree when all levels, except possibly the last, are fully filled, and all nodes are as far left as possible. 

# Full Binary Tree
- A full binary tree is one in which no more nodes can be added at the current height of the tree.

# Imcomplete Binary Tree
- An incomplete binary tree is a binary tree that does not satisfy the criteria of a complete binary tree, resulting in empty indexes when represented as an array.
