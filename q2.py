n= int(input("enter the number of elements in the universal set : "))
U=[]
A=[]
B=[]
print("enter universal set elements : ")

for i in range(n):
    x=input(f"element {i+1} : ")
    U.append(x)
print("enter setA membership values : ")
for i in range(n):
    x=float(input(f" A({U[i]}) : "))
    A.append(x)
print("enter setB membership values : ")
for i in range(n):
    x=float(input(f" B({U[i]}) : "))
    B.append(x)

print("(A union B)'")
for i in range(n):
    x=1-max(A[i],B[i])
    print(x,"/",U[i])

print("A' intersection B'")
for i in range(n):
    x=min(1-A[i],1-B[i])
    print(x,"/",U[i])

print("(A intersection B)'")
for i in range(n):
    x=1-min(A[i],B[i])
    print(x,"/",U[i])

print("A' union B'")
for i in range(n):
    x=max(1-A[i],1-B[i])
    print(x,"/",U[i])