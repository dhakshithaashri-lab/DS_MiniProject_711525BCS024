 Data Structures Mini Project – Smart Traffic System

Reg No: 711525BCS024  
Name: Dhakshithaa Shri JR  
Batch: B  
Course: B25CSI201 – Data Structures  

## Problem Statement
A smart traffic system manages vehicles at an intersection using priority-based processing. 
Emergency vehicles such as ambulances and fire trucks must be given higher priority than normal vehicles. 
The system dynamically inserts, displays, searches, and processes vehicles using a priority queue.

## Objectives
- To implement a priority queue using a heap data structure.
- To process emergency vehicles before normal vehicles.
- To perform searching and display operations on vehicle data.
- To demonstrate sorting and priority-based scheduling.

## Data Structures Used
- Priority Queue (Min Heap)
- Array

## Algorithms Implemented
- Priority Queue using Heap
- Linear Search
- Priority-based Processing

## Operations Performed
1. Insert Vehicle  
2. Display Vehicles  
3. Process Highest Priority Vehicle  
4. Search Vehicle  
5. Exit  

## How to Compile and Run

Compile the program:

javac SmartTrafficSystem.java

Run the program:

java SmartTrafficSystem

## Sample Input / Output

SMART TRAFFIC SYSTEM

1. Insert Vehicle  
2. Display Vehicles  
3. Process Highest Priority Vehicle  
4. Search Vehicle  
5. Exit  

Enter choice: 1  
Enter Vehicle ID: 101  
Enter Vehicle Type: Emergency  
Enter Congestion Level: 5  
Enter Travel Time: 12  
Vehicle inserted successfully.

Enter choice: 2  

Vehicle List:
ID: 101  
Type: Emergency  
Congestion: 5  
Travel Time: 12  

## Time Complexity

Insertion: O(log n)  
Deletion: O(log n)  
Search: O(n)  
Display: O(n)  

## Space Complexity

O(n)

## Applications

- Smart traffic management systems  
- Emergency vehicle routing  
- Intelligent transportation systems  
- Urban traffic monitoring  

## Conclusion

The Smart Traffic System successfully demonstrates the use of a priority queue and heap data structure to manage vehicles efficiently. Emergency vehicles are processed first based on priority, improving traffic flow and response time in real-world scenarios.
