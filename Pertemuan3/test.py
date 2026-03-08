def f(n):
    if n == 0:
        print("basis")
        return 3
    elif n > 0:
        print("Rekurens")
        return 2 * f(n-1) + 4
    else:
        return "tidak sesuai batas"

print( f(5))