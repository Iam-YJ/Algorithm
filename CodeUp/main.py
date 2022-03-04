# # 6001
# print("Hello")
#
# # 6002
# print("Hello World")
#
# # 6003
# print("Hello")
# print("World")
#
# # 6004
# print("'Hello'")
#
# # 6005
# print('"Hello World"')
#
# # 6006
# print('"' + "!@#$%^&*()'")
#
# # 6007
# print("\"C:\\Download\\'hello'.py\"")
#
# # 6008
# print("print(\"Hello\\nWorld\")")
#
# # 6009
# c = input()
# print(c)
#
# # 6010
# c = input()
# print(int(c))
#
# # 6011
# f = input()
# f = float(f)
# print(f)
#
# # 6012
# a = input()
# b = input()
# print(a)
# print(b)
#
# # 6013
# a = input()
# b = input()
# print(b)
# print(a)
#
# # 6014
# f = input()
# f = float(f)
# print(f)
# print(f)
# print(f)
#
# # 6015
# a, b = input().split()
# print(a)
# print(b)
#
# # 6016
# a, b = input().split()
# print(b, a)
#
# # 6017
# s = input()
# print(s, s, s)
#
# # 6018
# h, m = input().split()
# print(h, m, sep=":")
#
# # 6019
# y, m, d = input().split(".")
# print(d, m, y, sep="-")
#
# # 6020
# f, b = input().split("-")
# print(f, b, sep="")
#
# # 6021
# s = input()
# str = list(s)
#
# for c in str:
#     print(c)
#
# # 6022
# s = input()
# print(s[:2], s[2:4], s[4:])
#
# # 6023
# h, m, s = input().split(":")
# print(m)
#
# # 6024
# w1, w2 = input().split()
# s = w1 + w2
# print(s)
#
# # 6025
# a, b = input().split()
# c = int(a) + int(b)
# print(c)
#
# # 6026
# a, b = input().split()
# c = float(a) + float(b)
# print(c)
#
# # 6027
# a = input()
# n = int(a)
# print('%x'% n)
#
# # 6028
# a = input()
# n = int(a)
# print('%x'% n)
#
# # 6029
# a = input()
# n = int(a, 16)
# print('%o' % n)
#
# # 6030
# n = ord(input())
# print(n)
#
# # 6031
# c = int(input())
# print(chr(c))
#
# # 6032
# n = int(input())
# print(-(n))
#
# # 6033
# n = ord(input())
# print(chr(n+1))
#
# # 6034
# a, b = input().split()
# c = int(a)-int(b)
# print(c)
#
# # 6035
# a, b = input().split()
# c = float(a) * float(b)
# print(c)
#
# # 6036
# w, n = input().split()
# print(w*int(n))
#
# # 6037
# n = input()
# s = input()
# print(int(n)*s)
#
# # 6038
# n, s = input().split()
# print(int(n)**int(s))
#
# # 6039
# n, s = input().split()
# print(float(n)**float(s))
#
# # 6040
# a, b = input().split()
# print(int(a)//int(b))
#
# # 6041
# a, b = input().split()
# print(int(a)%int(b))
#
# # 6042
# a = input()
# print(format(float(a), ".2f"))
#
# # 6043
# a, b = input().split()
# c = float(a) / float(b)
# print(format(c, ".3f"))
#
# # 6044
# a, b = input().split()
# c = int(a)
# d = int(b)
# print(c+d)
# print(c-d)
# print(c*d)
# print(c//d)
# print(c%d)
# print(format(c/d, ".2f"))
#
# # 6045
# a, b, c = input().split()
# d = int(a) + int(b) + int(c)
# e = d / 3.00
# print(d, format(e, ".2f"))
#
# # 6046
# a = input()
# print(int(a) << 1)
#
# # 6047
# a, b = input().split()
# print(int(a) << int(b))
#
# # 6048
# a, b = input().split()
#
# if(int(a) < int(b)):
#     print(True)
# else:
#     print(False)
#
# # 6049
# a, b = input().split()
#
# if(int(a) == int(b)):
#     print(True)
# else:
#     print(False)
#
# # 6050
# a, b = input().split()
#
# if(int(a) <= int(b)):
#     print(True)
# else:
#     print(False)
#
# # 6051
# a, b = input().split()
#
# if(int(a) != int(b)):
#     print(True)
# else:
#     print(False)
#
# # 6052
# a = input()
# print(bool(int(a)))
#
# # 6053
# a = input()
# b = bool(int(a))
# print(not b)
#
# # 6054
# a, b = input().split()
# print(bool(int(a)) and bool(int(b)))
#
# # 6055
# a, b = input().split()
# print(bool(int(a)) or bool(int(b)))
#
# # 6056
# a, b = input().split()
# c = bool(int(a))
# d = bool(int(b))
# print((c and (not d)) or ((not c) and d))
#
# # 6057
# a, b = input().split()
# c = bool(int(a))
# d = bool(int(b))
# print((c and d) or ((not c) and (not d)))
#
# # 6058
# a, b = input().split()
# c = bool(int(a))
# d = bool(int(b))
#
# if(((not c) and (not d))):
#     print("True")
# else:
#     print("False")
#
# # 6059
# a = input()
# print(~int(a))
#
# # 6060
# a, b = input().split()
# print(int(a)&int(b))
#
# # 6061
# a, b = input().split()
# print(int(a)|int(b))
#
# # 6062
# a, b = input().split()
# print(int(a)^int(b))
#
# # 6063
# a, b = input().split()
# a = int(a)
# b = int(b)
# c = (a if (a>b) else b)
# print(c)
#
# # 6064
# a, b, c = input().split()
# a = int(a)
# b = int(b)
# c = int(c)
# small = a if (a < b) else b
# small = small if (small < c) else c
# print(small)
#
# # 6065
# a, b, c = input().split()
# a = int(a)
# b = int(b)
# c = int(c)
#
# if a%2 == 0 :
#     print(a)
# if b%2 == 0 :
#     print(b)
# if c%2 == 0 :
#     print(c)
#
# # 6066
# a, b, c = input().split()
# list = [int(a), int(b), int(c)]
#
# for i in range(0, len(list)):
#     if list[i] % 2 == 0:
#         print("even")
#     else:
#         print("odd")
#
# # 6067
# n = input()
# n = int(n)
#
# if(n < 0):
#     if(n % 2 == 0 ):
#         print('A')
#     else:
#         print('B')
# else:
#     if(n % 2 == 0 ):
#         print('C')
#     else:
#         print('D')
#
# # 6068
# n = input()
# n = int(n)
#
# if n >= 90 :
#     print('A')
# elif n >= 70 :
#     print('B')
# elif n >= 40 :
#     print('C')
# else:
#     print('D')
#
# # 6069
# w = input()
#
# if w == 'A':
#     print('best!!!')
# elif w == 'B':
#     print('good!!')
# elif w == 'C':
#     print('run!')
# elif w == 'D':
#     print('slowly~')
# else:
#     print('what?')
#
# # 6070
# w = input()
# w = int(w)
#
# if w//3 == 1:
#     print('spring')
# elif w//3 == 2:
#     print('summer')
# elif w//3 == 3:
#     print('fall')
# else:
#     print('winter')
#
# # 6071
# n = int(input())
#
# while n != 0:
#     print(n)
#     n = int(input())
#
# # 6072
# n = int(input())
#
# while n != 0:
#     print(n)
#     n -= 1
#
# # 6073
# n = int(input())
#
# while n != 0:
#     n -= 1
#     print(n)
#
# # 6074
# c = ord(input())
# t = ord('a')
# while t<=c :
#   print(chr(t), end=' ')
#   t += 1
#
# # 6075
# n = int(input())
# num = 0
#
# while num <= n:
#     print(num)
#     num += 1
#
# # 6076
# n = int(input())
#
# for i in range(n+1):
#     print(i)
#
# # 6077
# n = int(input())
# sum = 0
#
# for i in range(n+1):
#     if i % 2 == 0 :
#         sum += i
# print(sum)
#
# # 6078
# while True:
#      x=input()
#      print(x)
#      if x=='q':
#           break
#
# # 6079
# while True:
#     sum = 0
#     a = int(input())
#     for i in range(a+1):
#         sum += i
#         if sum >= a :
#             print(i)
#             break
#
# # 6080
# a, b = input().split()
# a = int(a)
# b = int(b)
#
# for i in range(1, a+1):
#     for j in range(1, b+1):
#         print(i, j)
#
# # 6081
# a = input()
# a = int(a, 16)
# for i in range(1, 16):
#     print('%X' % a, '*%X' % i, '=%X' % (a * int(i)), sep='')
#
# # 6082
# a = int(input())
#
# for i in range(1, a+1):
#     if int(str(i)[-1]) != 0 and int(str(i)[-1]) % 3 == 0:
#         print("X", end=" ")
#     else:
#         print(i, end=" ")
#
# # 6083
# a, b, c = input().split()
# for i in range(int(a)):
#     for j in range(int(b)):
#         for k in range(int(c)):
#             print(i,j,k,sep=" ")
# print(int(a)*int(b)*int(c))
#
# # 6084
# h, b, c, s = input().split()
# h = int(h)
# b = int(b)
# c = int(c)
# s = int(s)
#
# save = h * b * c * s / 8 / 1024 / 1024
#
# print(round(save,1), "MB")
#
# # 6085
# w, h, b = map(int, input().split())
# print("%.2f MB" %(round(w*h*b/8/1024/1024,2)))
#
# # 6086
# a = int(input())
#
# sum = 0
# num = 1
# while True:
#     sum += num
#     num += 1
#     if sum >= a:
#         break
# print(sum)
#
# # 6087
# a = int(input())
#
# for i in range(1, a+1):
#     if i % 3 != 0:
#         print(i, end=' ')
#
# # 6088
# a, d, n = input().split()
# a = int(a)
# d = int(d)
# n = int(n)
#
# number = d*(n-1)+a
# print(number)
#
# # 6089
# a, r, n = map(int, input().split())
#
# num = a * r ** (n-1)
# print(num)
#
# # 6090
# a, m, d, n = map(int, input().split())
#
# num_list = [a]
#
# for i in range(n):
#     num = num_list[i] * m + d
#     num_list.append(num)
#
# print(num_list[n-1])
#
#
# # 6091
# a, b, c = map(int, input().split())
#
# d = 1
# while d%a != 0 or d%b != 0 or d%c != 0:
#     d += 1
# print(d)
#
# # 6092
# a = int(input())
# num_list = input().split()
#
# list = []
#
# for i in range(23):
#     list.append(0)
#
# for num in num_list:
#     list[int(num)-1] += 1
#
# for num in list:
#     print(num, end=' ')
#
# # 6093
# a = int(input())
# list = input().split()
#
# for i in reversed(list):
#     print(i, end=' ')
#
# # 6094
# a = int(input())
# list = input().split()
#
# for i, num in enumerate(list):
#     list[i] = int(num)
#
# print(min(list))
#
# # 6095
# white = int(input())
#
# baduk = [[0 for j in range(20)] for i in range(20)]
#
# for i in range(n):
#     x, y = map(int,input().split())
#     baduk[x][y] = 1
#
# for i in range(1,20):
#     for j in range(1,20):
#         print(baduk[i][j], end=' ')
#     print()
#
# # 6096
# a = [[] * 19 for _ in range(19)]
# for i in range(19):
#     a[i] = list(map(int, input().split()))
#
# n = int(input())
#
# for i in range(n):
#     b, c = map(int, input().split())
#
#     for j in range(19):
#         if (a[b - 1][j] == 1):
#             a[b - 1][j] = 0
#         else:
#             a[b - 1][j] = 1
#
#     for j in range(19):
#         if (a[j][c - 1] == 1):
#             a[j][c - 1] = 0
#         else:
#             a[j][c - 1] = 1
#
# for i in range(19):
#     for j in range(19):
#         print(a[i][j], end=' ')
#     print()

# # 6097
# h, w = map(int, input().split())
# a = [[0 for _ in range(w+1)] for _ in range(h+1)]
#
# n = int(input())
#
# for i in range(n):
#     l, d, x, y = map(int, input().split())
#
#     if d == 0 :
#         for i in range(l):
#             a[x][y + i] = 1
#     else :
#         for i in range(l):
#             a[x+i][y] = 1
#
# for i in range(1, h+1):
#     for j in range(1, w+1):
#         print(a[i][j], end=' ')
#     print()

# 6098
a = [[] * 10 for _ in range(10)]

for i in range(10):
    a[i] = list(map(int, input().split()))



