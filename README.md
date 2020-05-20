# DataStructures 

[Tutorial Here](https://www.geeksforgeeks.org/data-structures/)

**1. Arrays**

**2. Stacks**


**3. Queues**


**4. LinkedList** - A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations. The elements in a linked list are linked using pointers.

- **Singly Linked List** - A linear data structure, where each element is connected to the next one by a pointer.

    A node of Singly Linked List looks like below:

    `[ data | next node ]`

- **Doubly Linked List** - Linked List where each element points to the next one, and the next element points to the previous one. The "previous" of head points to null and the so does the "next" of the last node.

    A node of Singly Linked List looks like below:

    `[ previous node | data | next node ]`

- **Circular Linked List** - very similar to Singly Linked List, however the last node instead of null, points to the head.

**5. Binary Tree** - A tree whose elements have atmost 2 children is called a binary tree. Since each element in a binary tree can have only 2 children, we typically name them the left and right child. 

- **Perfect Binary Tree** is one where each node has exactly 2 child.

- **Full Binary Tree** is one where each node has either 0 or 2 children.

- **Complete Binary Tree** is if all levels are completely filled except possibly the last level and the last level has all keys as left as possible

- **Balanced Binary Tree** is one if the height of the tree is O(Log n) where n is the number of nodes.

About Trees:

        - The number of nodes at `depth 'd'` of a perfect binary tree is `2^d`

        - A perfect binary tree of `height 'h'` has `2^(h+1) - 1` nodes

        - Number of leaf nodes in a perfect binary tree of `height 'h'` is `2^h`

        - Number of internal nodes in a perfect binary tree of `height 'h'` is `2^h - 1`

        - The minimum number of nodes in a binary tree of `height 'h'` is `h+1`

        - The maximum number of nodes in a binary tree of `height 'h'` is `2^(h+1) - 1`

---

## **Tree Traversals**

[Details](https://www.geeksforgeeks.org/bfs-vs-dfs-binary-tree/)

Two kinds of Traversals for trees.

1. **Breadth First Traversal** (or Level Order Traversal)
2. **Depth First Traversal**

- Inorder Traversal (Left-Root-Right)
- Preorder Traversal (Root-Left-Right)
- Postorder Traversal (Left-Right-Root)

What's the difference between the above four kinds of traversals?

All four traversals require O(n) time as they visit every node exactly once. However, there is difference in terms of extra space required.

1. Extra Space required for Level Order Traversal is O(w) where w is maximum width of Binary Tree. In level order traversal, queue one by one stores nodes of different level.

2. Extra Space required for Depth First Traversals is O(h) where h is maximum height of Binary Tree. In Depth First Traversals, stack (or function call stack) stores all ancestors of a node.

Maximum Width of a Binary Tree at depth (or height) h can be `2^h` where h starts from 0.

**What to pick?**

1. Extra Space can be one factor
2. Depth First Traversals are typically recursive and recursive code requires function call overheads.
3. The most important points is, BFS starts visiting nodes from root while DFS starts visiting nodes from leaves. So if our problem is to search something that is more likely to closer to root, we would prefer BFS. And if the target node is close to a leaf, we would prefer DFS.