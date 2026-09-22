r=int(input("enter the number of rows in relation R : "))
m=int(input("enter the number of columns in relation R : "))
R=[]
print("enter relation R values : ")
for i in range(r):
    row=[]
    for j in range(m):
        x=float(input(f"R[{i}][{j}] : "))
        row.append(x)
    R.append(row)
m2=int(input("enter the number of rows in relation S : "))
c=int(input("enter the number of columns in relation S : "))
S=[]
print("enter relation S values : ")
for i in range(m2):
    row=[]
    for j in range(c):
        x=float(input(f"S[{i}][{j}] : "))
        row.append(x)
    S.append(row)
if m!=m2:
    print("composition not possible")
else:
    print("Max-Min Composition")
    for i in range(r):
        for j in range(c):
            values=[]
            for k in range(m):
                values.append(min(R[i][k],S[k][j]))
            print(max(values),end=" ")
        print()
    print("Max-Product Composition")
    for i in range(r):
        for j in range(c):
            values=[]
            for k in range(m):
                values.append(R[i][k]*S[k][j])
            print(max(values),end=" ")
        print()