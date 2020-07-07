""" Node is defined as
class node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None
"""
import sys

def checkBST(root):
    
    if root is None:
        return True
    else:
        return check_helper(root, sys.maxsize, -sys.maxsize)
    
    

    
def check_helper(root, maximum, minimum):
    
    if root is None:
        return True
    
    if root.data >=maximum or root.data <=minimum:
        return False
    return check_helper(root.right, maximum, root.data) and check_helper(root.left, root.data, minimum)
