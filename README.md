# Sorting Algorithms

A collection of sorting algorithms for with benchmarks for educational purposes.

## 📚 Algorithms Overview

| Name           | Type      | Short Description                                                                                                    |   Time Complexity <br/> (B / AVG / W)    |  Implemented?  |
|----------------|-----------|----------------------------------------------------------------------------------------------------------------------|:----------------------------------------:|:--------------:|
| Insertion Sort | simple    | Inserts elements directly to their correct position.                                                                 |         `O(n) / O(n^2) / O(n^2)`         |       ✔        |
| Selection Sort | simple    | Repeatedly searches for the min. element and places it in the right spot.                                            |       `O(n^2) / O(n^2)  / O(n^2)`        |       ✔        |
| Bubble Sort    | simple    | Swaps adjacent elements repeatedly until the whole array is sorted.                                                  |        `O(n^2) / O(n^2) / O(n^2)`        |       ✔        |
| Merge Sort     | efficient | Splits array in multiple partitions and merges them after sorting each partition individually.                       |  `O(n log n) / O(n log n) / O(n log n)`  |       ✔        |
| Quick Sort     | efficient | Splits array in multiple partitions, selects a pivot element for each partition, and sorts numbers around the pivot. |    `O(n log n) / O(n log n) / O(n^2)`    |       ✔        |
| Radix Sort     | efficient | Sorts numbers by the place of each digit.                                                                            |       `O(n\*k) /O(n\*k) / O(n*k)`        |       ✔        |

## 🕛 Time Overview

*Note: This list tells nothing about the efficiency of the algorithms. Measuring algorithms with time comparison is not
meaningful, as it is highly hardware dependant and also dependant on which background processes are running on the test
system. This list is just for a general overview, if you are not yet familiar with the Big-O-notation, but want a rough
comparison between the algorithms.*

Benchmark Specs:

- OS: Ubuntu 22.04
- CPU: AMD Ryzen 5 2600X
- RAM: 16 GB 2400 MHz

| Name           | Average Time¹ |
|----------------|--------------:|
| Insertion Sort |      1,568 ms |
| Selection Sort |      8,695 ms |
| Bubble Sort    |     14,002 ms |
| Merge Sort     |         18 ms |
| Quick Sort     |         14 ms |
| Radix Sort     |         17 ms |

¹ average time for sorting an array (same array for all algorithms) with 100,000 random, unsorted numbers (0 <= n <= 100,000).

## 💁🏻 Contributing

If you want to contribute to this project (e.g. by implementing an algorithm or by adding missing documentation), go ahead and open a pull request. 
I do not have certain contribution guidelines, but please try to match the general coding style of this repository.

## 📖 License
Read the <a href="./LICENSE">License</a> file. 
