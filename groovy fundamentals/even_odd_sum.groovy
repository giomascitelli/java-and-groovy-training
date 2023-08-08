""" 
Codewars Kata Training
Groovy Fundamentals

Given a list of integers, determine whether the sum of its elements is odd or even.

Give your answer as a string matching "odd" or "even".

If the input array is empty consider it as: [0] (array with a zero).

Examples:
Input: [0]
Output: "Even"

Input: [0, 1, 4]
Output: "Odd"

Input: [0, -1, -5]
Output: "Even"

"""

def odd_or_even(List<Integer> arr) {

    int sum = (arr.isEmpty()) ? 0 : arr.sum()

    return (sum % 2 == 0) ? "Even" : "Odd"
}

