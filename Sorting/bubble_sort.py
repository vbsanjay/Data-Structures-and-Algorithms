# Bubble Sort:
# Step 1: Nested loop
#           - build a nested for loop.
# Step 2: Outer loop: 
#           - iterate for total number of elements in the array.
#           - a element is sorted at each iteration.
# Step 3: Inner loop: 
#           - iterate from index 0 to n - i - 1.
#           - Why n - i - 1?
#               - the greatest element at each iterations shifts to right which does no require sorting after it's shift.
# Step 4: Compare adjacent elements:
#           - Compare adjacent elements and swap if required.

# Key Idea:
#   - The largest element at each iteratiosn shifts to the right.
#   - Image the largest element as a bubble which pops out of the water.

arr = [5,3,8,4,6]

def bubble_sort_increasing_order(arr):
    n = len(arr)
    for i in range(n):
        swap = False  # this helps us to achieve best case time complexity: O(N).
        # when no swaps occurs it means array is already sorted
        for j in range(n - i - 1):
            if arr[j] > arr[j+1]:
                # swapping to push the largest to the right
                temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
                swap = True
        if swap == False:
            break
    

bubble_sort_increasing_order(arr)

print("bubble_sort_increasing_order")

for x in arr:
    print(x, end = " ")

arr = [8,4,5,3,1]

def bubble_sort_non_increasing_order(arr):
    n = len(arr)
    for i in range(n):
        swap = False  # this helps us to achieve best case time complexity: O(N).
        # when no swaps occurs it means array is already sorted
        for j in range(n - i - 1):
            if arr[j] < arr[j+1]:
                # swapping to push the largest to the right
                temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
                swap = True
        if swap == False:
            break
    

bubble_sort_non_increasing_order(arr)

print("\nbubble_sort_non_increasing_order")

for x in arr:
    print(x, end = " ")

# Author: vbsanjay 
# Time Complexity: 
#               - Best: O(N)
#               - Average: O(N^2)
#               - Worst: O(N^2)
# Space Complexity: 
#               - Worst: O(1)