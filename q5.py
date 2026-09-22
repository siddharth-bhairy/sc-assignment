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
p=int(input("enter the number of elements in set C : "))
C=[]
print("enter setC elements : ")
for i in range(p):
    x=input(f"element {i+1} : ")
    C.append(x)
MA=[]
MB=[]
MC=[]
print("enter setA membership values : ")
for i in range(n):
    x=float(input(f" A({A[i]}) : "))
    MA.append(x)
print("enter setB membership values : ")
for i in range(m):
    x=float(input(f" B({B[i]}) : "))
    MB.append(x)
print("enter setC membership values : ")
for i in range(p):
    x=float(input(f" C({C[i]}) : "))
    MC.append(x)
print("IF A THEN B ELSE C")
for i in range(n):
    for j in range(m):
        for k in range(p):
            x=max(min(MA[i],MB[j]),min(1-MA[i],MC[k]))
            print(x,end=" ")
        print()