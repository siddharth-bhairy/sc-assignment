term=input("enter linguistic term : ")
membership=float(input("enter membership value : "))
print("1. Very")
print("2. More or Less")
print("3. Not")
choice=int(input("enter your choice : "))
if choice==1:
    x=membership**2
    print("Very",term,"=",x)
elif choice==2:
    x=membership**0.5
    print("More or Less",term,"=",x)
elif choice==3:
    x=1-membership
    print("Not",term,"=",x)
else:
    print("invalid choice")