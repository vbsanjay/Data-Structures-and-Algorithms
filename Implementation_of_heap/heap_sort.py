from typing import List

def heapify(nums: List[int], n: int, i: int):
    largest = i
    left = 2 * i + 1
    right = 2 * i + 2

    if left < n and nums[left] > nums[largest]:
        largest = left

    if right < n and nums[right] > nums[largest]:
        largest = right

    if largest != i:
        nums[i], nums[largest] = nums[largest], nums[i]
        heapify(nums, n, largest)

def build_max_heap(nums: List[int]):
    n = len(nums)
    # Start from the last non-leaf node and heapify down to the root node
    for i in range(n // 2 - 1, -1, -1):
        heapify(nums, n, i)

def sortArray(nums: List[int]) -> List[int]:
    n = len(nums)
    # Step 1: Build a max heap from the unsorted array
    build_max_heap(nums)
    # nums represent a heap now
    
    # Step 2: Extract elements one by one from the heap
    for i in range(n-1, 0, -1):
        nums[i], nums[0] = nums[0], nums[i]  # Move current root to end
        heapify(nums, i, 0)  # call max heapify on the reduced heap
    
    return nums


print(sortArray([10,20,15,12,40,25,18]))



# bit complex code but works. written the simpler code above
# I came up with this code

# def heapify(nums: List[int], current_node: int, index: int, n: int) -> None:
#     if index < 0:
#          return
#     # check child nodes -> heapify down
#     left_node = index * 2 + 1
#     right_node = index * 2 + 2

#     if left_node >= n and right_node >= n:
#           heapify(nums, nums[index-1], index-1, n)
#     elif left_node < n and right_node < n:
#         if current_node < nums[left_node] and current_node < nums[right_node]:
#             # swap the greatest
#             if nums[left_node] > nums[right_node]:
#                 temp = nums[index]
#                 nums[index] = nums[left_node]
#                 nums[left_node] = temp
#                 heapify(nums, nums[left_node], left_node, n)
#             else:
#                 temp = nums[index]
#                 nums[index] = nums[right_node]
#                 nums[right_node] = temp
#                 heapify(nums, nums[right_node], right_node, n)
#         elif current_node >= nums[left_node] and current_node >= nums[right_node]:
#             heapify(nums, nums[index-1], index-1, n)
#         elif current_node < nums[left_node]:
#             temp = nums[index]
#             nums[index] = nums[left_node]
#             nums[left_node] = temp
#             heapify(nums, nums[left_node], left_node, n)
#         else:
#             temp = nums[index]
#             nums[index] = nums[right_node]
#             nums[right_node] = temp
#             heapify(nums, nums[right_node], right_node, n)
#     else:
#         if left_node < n:
#             if current_node < nums[left_node]:
#                 temp = nums[index]
#                 nums[index] = nums[left_node]
#                 nums[left_node] = temp
#                 heapify(nums, nums[left_node], left_node, n)
#         else:
#             if current_node < nums[right_node]:
#                 temp = nums[index]
#                 nums[index] = nums[right_node]
#                 nums[right_node] = temp
#                 heapify(nums, nums[right_node], right_node, n)