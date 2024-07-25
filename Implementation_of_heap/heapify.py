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
    build_max_heap(nums)
    return nums
