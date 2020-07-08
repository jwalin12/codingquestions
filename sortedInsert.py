#!/bin/python3

import math
import os
import random
import re
import sys

class DoublyLinkedListNode:
    def __init__(self, node_data):
        self.data = node_data
        self.next = None
        self.prev = None

class DoublyLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None

    def insert_node(self, node_data):
        node = DoublyLinkedListNode(node_data)

        if not self.head:
            self.head = node
        else:
            self.tail.next = node
            node.prev = self.tail


        self.tail = node

def print_doubly_linked_list(node, sep, fptr):
    while node:
        fptr.write(str(node.data))

        node = node.next

        if node:
            fptr.write(sep)

# Complete the sortedInsert function below.

#
# For your reference:
#
# DoublyLinkedListNode:
#     int data
#     DoublyLinkedListNode next
#     DoublyLinkedListNode prev
#
#
def sortedInsert(head, data):


    if data < head.data:
        node = DoublyLinkedListNode 
        node.data = data
        node.next = head
        head.prev = node
        return node

    pointer = head
    while data > pointer.data and pointer.next is not None:
        pointer = pointer.next
    
    if pointer.data < data:
            node = DoublyLinkedListNode 
            node.data = data
            pointer.next = node
            node.prev = pointer
            node.next = None

    else:
        node = DoublyLinkedListNode 
        node.data = data
        second = pointer
        first = pointer.prev
        second.prev = node
        first.next = node
        node.prev = first
        node.next = second
    return head
    


    
    

if __name__ == '__main__':
