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

print("union")
for i in range(n):
    print(max(A[i],B[i]),"/",U[i])

print("intersection")
for i in range(n):
    print(min(A[i],B[i]),"/",U[i])

print("Complement of A")
for i in range(n):
    print(1-A[i],"/",U[i])

print("Complement of B")
for i in range(n):
    print(1-B[i],"/",U[i])