Here's a corrected and refined version of your explanation for Heap Sort:

# Heap Sort

## Brute Force Approach

- **Step 1:** Convert unsorted array to heap
    - Iterate over the array (Time complexity: O(n))
    - For each element, insert it into the heap (Time complexity: O(log n) per insertion)
    - Overall Time Complexity: O(n log n) and Space Complexity: O(n)

- **Step 2:** Delete elements
    - Remove elements from the heap and add them to the end of the array

- **Step 3: Result**
    - After removing all elements from the heap, you arrive at the sorted array

## Optimal Approach

The difference between the brute force and optimal approach is in Step 1. This reduces the time complexity from O(n) + O(n log n) to o(nlogN). This also reduced space complexity form o(n) to o(1)

- **Step 1:** Heapify the array in-place
    - Start from the right leaf node
    - Compare the current node with its children
    - **Step 1.1:** If the children are less than or equal to the current node, no changes are required
    - **Step 1.2:** If either child is greater than the current node, swap with the larger child
    - Repeat this process for all non-leaf nodes, moving towards the root

- **Step 2:** Delete elements from the heap
    - Remove the root element (largest in a max heap) and place it at the end of the array
    - Heapify the remaining elements

**Step 3:** Result
    - After removing all elements from the heap, you arrive at the sorted array

Note: Heapify operations can be classified as: (I made this classification based on my observation, not anywhere from text book)
1. Heapify down:
   - Bottom-up (used to heapify array in-place)
   - Top-down (used when deleting the root node)
2. Heapify up:
   - Bottom-up (used when inserting a new node)
   - Top-down (not commonly used)