# Search Engine Auto-Complete System

A Trie-based auto-complete search system that provides Google-like search suggestions
using efficient data structures.

## Features
- Prefix-based search
- Frequency-based ranking
- Fast lookup using Trie
- Top-K suggestions using Priority Queue

## Data Structures Used
- Trie
- HashMap
- Priority Queue (Max Heap)
- DFS

## Time Complexity
- Insert: O(L)
- Search: O(L)
- Auto-complete: O(P + N log K)

## How to Run
1. Compile all `.java` files
2. Run `Main.java`

## Example
Input: `jav`  
Output: `java, javascript, javac`
