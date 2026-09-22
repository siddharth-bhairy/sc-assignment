n=int(input("enter the number of elements in set A : "))
A=[]
print("enter setA elements : ")
for i in range(n):
    x=input(f"element {i+1} : ")
    A.append(x)
m=int(input("enter the number of elements in set B : "))
B=[]
print("enter setB elements : ")
for i in range(m):
    x=input(f"element {i+1} : ")
    B.append(x)
MA=[]
MB=[]
print("enter setA membership values : ")
for i in range(n):
    x=float(input(f" A({A[i]}) : "))
    MA.append(x)
print("enter setB membership values : ")
for i in range(m):
    x=float(input(f" B({B[i]}) : "))
    MB.append(x)
print("IF A THEN B")
for i in range(n):
    for j in range(m):
        x=min(MA[i],MB[j])
        print(x,end=" ")
    print()