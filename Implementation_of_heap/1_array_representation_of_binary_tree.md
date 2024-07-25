# Array Representation of Binary Tree

![array representation of binary tree](img/representing%20binary%20tree%20as%20array.png)


# Important Formulas for Array to Heap Representation

In a heap represented as an array:

- **Node at index `i`**:
  - To find the **left child node**, use the formula: `i * 2`
  - To find the **right child node**, use the formula: `(i * 2) + 1`
  - To find the **parent node**, use the formula: `i // 2`

Apply these formulas to determine the relationships between nodes in the array when represented as a heap.