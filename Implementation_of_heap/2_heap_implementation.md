# Implementation of Heaps

## Rules to Implement Heaps
- Heaps are complete binary trees.
- In a max heap, the largest element should be the root node, and each parent node should be greater than or equal to its child nodes.
- In a min heap, the smallest element should be the root node, and each parent node should be less than or equal to its child nodes.
- Heaps are typically implemented using arrays for efficient indexing.
- The heap property (max or min) must be maintained during insertion and deletion operations.

## Types of heap
- Max heap
- Min heap
- Learn one type of heap (e.g., max heap), as the logic for other types of heaps (e.g., min heap) is similar.

# Heapify
Heapify is the process of maintaining the heap property in a binary heap. It involves two main operations:
1. **Heapify Up (Bubble Up)**: Adjusts elements upwards when a new element is added, ensuring each parent is greater than or equal to its children in a max heap.
2. **Heapify Down (Bubble Down)**: Adjusts elements downwards when the root element is removed, ensuring the heap property is restored from the root downwards.

# Max Heap
Your steps for inserting a node into a max heap are mostly correct, but I'll simplify and clarify them a bit:

# Max Heap
## Insert a Node in Max Heap
- **Step 1: Representation**
    - Represent the heap as an array where each node is an element.

- **Step 2: Insert at End**
    - Insert the new element at the end of the array. This means you are adding the element as the leftmost leaf.

- **Step 3: Bubble Up (Heapify Up)  / Travel From Left to Root**
    - Use the formula `(i - 1) // 2` to find the parent node in the array, where `i` is the index of the current node.
    - **Step 3.1:** Compare the inserted node with its parent node.
    - **Step 3.2:** In a max heap, if the parent node is smaller than the inserted node, swap them.
    - **Step 3.3:** If the parent node is greater than inserted node, no changes are required.

- **Step 4: Stop**
    - Stop when the parent node is greater than or equal to the current node, or when the current node reaches the root.

- **Time Complexity:** (logN)

## Delete a node in Max Heap
Your steps for deleting the root node in a max heap are mostly correct, but I will refine and clarify them a bit:

## Delete the Root Node in Max Heap
- **Step 1: Representation**
    - Represent the heap as an array where each node is an element.

- **Step 2: Delete the Root**
    - According to heap properties, you can only delete the root element (maximum element in a max heap).

- **Step 3: Bring Leaf to the Root**
    - Move the last element (rightmost leaf) to the root position.

- **Step 4: Bubble Down (Heapify Down) / Travel From Root to Leaf**
    - Compare the current element (now at the root) with its child nodes.
    - Use the formulas `2 * i + 1` and `2 * i + 2` to find the left and right child nodes in the array, where `i` is the index of the current node.
        - **Step 4.1:** If both child nodes are smaller than the current node, no changes are required.
        - **Step 4.2:** If one child node is greater than the current node, swap the current node with the larger child.
        - **Step 4.3:** If both child nodes are greater than the current node, swap the current node with the largest child node.

- **Step 5: Stop**
    - Repeat this process, moving the current node down the tree, until it is greater than or equal to both its children or it reaches a leaf node.

- **Time Complexity:** (logN)

**Reference:**
[2.6.3 Heap - Heap Sort - Heapify - Priority Queues
](https://www.youtube.com/watch?v=HqPJF2L5h9U)