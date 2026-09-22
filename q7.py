n=int(input("enter the number of elements in the universal set : "))
U=[]
A=[]
print("enter universal set elements : ")
for i in range(n):
    x=input(f"element {i+1} : ")
    U.append(x)
print("enter setA membership values : ")
for i in range(n):
    x=float(input(f" A({U[i]}) : "))
    A.append(x)
alpha=float(input("enter alpha value : "))
print("Alpha Cut")
for i in range(n):
    if A[i]>=alpha:
        print(A[i],"/",U[i])