####################################################
## Autor: Arthur Anthony da Cunha Romão E Silva   ##
## Matrícula: 20190011208                         ##
####################################################

from time import time
from random import randint

def merge(A, s, m, e):
    i, j = s, m + 1
    n = e - s + 1

    B = [0] * n

    for k in range(n):
        if j > e or A[i] < A[j] and i <= m: 
            B[k] = A[i]
            i += 1
        else:
            B[k] = A[j]
            j += 1

    for k in range(n):
        A[s + k] = B[k]


def merge_sort(A, s, e):
    if s < e:
        m = (s + e) // 2
        merge_sort(A, s, m)
        merge_sort(A, m + 1, e)
        merge(A, s, m, e)


for n in range(100,1001,100):
    qtd_samples = 1000
    c = 0
    for i in range(qtd_samples):
        A = [randint(-100, 100) for x in range(n)]
        begin = time()       
        merge_sort(A, 0, n - 1)
        end = time()
        c = c + abs(begin - end)
    c = c / qtd_samples
    print(n, c)