# Add Two Numbers

## Overview

This Java program adds two numbers represented by linked lists. Each node in the linked lists contains a single digit, and the digits are stored in reverse order. The program adds the two numbers and returns the result as a linked list in the same reverse order format.

## Linked List Representation

- **Example**:
  - Number 1: 342 is represented as 2 -> 4 -> 3
  - Number 2: 465 is represented as 5 -> 6 -> 4
  - Result: 807 is represented as 7 -> 0 -> 8

## Classes

### ListNode

A class representing a node in a singly-linked list.

- **Fields**:
  - `int val`: The value of the node.
  - `ListNode next`: The reference to the next node.

- **Constructor**:
  - `ListNode(int x)`: Initializes the node with a value `x`.

### Solution

A class that contains the method to add two numbers represented by linked lists.

- **Method**:
  - `ListNode addTwoNumbers(ListNode l1, ListNode l2)`: Adds two numbers and returns the result as a linked list.
  - `void printList(ListNode node)`: A helper method to print the linked list.

## How It Works

1. A dummy head node is created to simplify edge cases where the result might start with a carry that needs to be added.
2. A loop runs until both lists are exhausted and there is no carry left.
3. Values from `l1` and `l2` are extracted (defaulting to 0 if a list is null), and their sum and carry are calculated.
4. A new node with the value `sum % 10` is created and added to the result list.
5. The pointers `l1` and `l2` are advanced if they are not null.
6. The method returns `dummyHead.next`, which is the head of the result list.

## Example

- **Input**:
  - List 1: 2 -> 4 -> 3
  - List 2: 5 -> 6 -> 4
- **Output**:
  - Result: 7 -> 0 -> 8


