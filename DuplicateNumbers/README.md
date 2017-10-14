# Duplicate Number Counter

This question asks to find duplicate numbers in an array of numbers.

## Interview Question
"Given an array of numbers, write a method that will find any duplicate numbers in the array"

## Commentary about my answer

I know there is a way by subtracting expected sums from actual sums to determine duplicates in a series of numbers.  However, the question says an array of numbers, not a series of numbers, so that was not an assumption I could make.  In addition, the expected sum version expects a single duplicate, but this question asks for all duplicates.

In the end I took the array and built a Map of numbers (key) and times found in the array (value).  It's a O(n) answer which you would expect when looking for duplicates in an array.  If I could make the assumptions (above) I could make start with a constant-time algorithm by using (x)(x+1)/2 as the expected sum, but even then I need to sum the actual array, which would be a O(n) operation.