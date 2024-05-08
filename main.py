x = int(input("Input pls"))
mas = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
mas1 = mas.copy()
a = len(mas1)
print(a)
mid = a // 2
while True:
    print("mid", mid)

    if x == mas1[mid]:
        print("Success!")
        print(mas1[mid])
        break

    elif x > mas1[mid]:
        print("Check High")
        mas1 = mas1[mid:]
        print(mas1)
        a = len(mas1)
        print("a", a)

    elif x < mas1[mid]:
        print("Check Low")
        mas1 = mas1[:mid]
        print(mas1)
        a = len(mas1)
        print("a", a)

    mid = a // 2



