#!/usr/bin/python

a = []

a.append("A")
a.append("B")
a.append("C")
a.append("D")
a.append("E")

print(a)
print("Removed: " + a.pop()) # Removes E
print("Removed: " + a.pop()) # Removes D
print("Removed: " + a.pop()) # Removes C
print(a)