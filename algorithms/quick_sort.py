####################################################
## Autor: Arthur Anthony da Cunha Romão E Silva   ##
## Matrícula: 20190011208                         ##
####################################################

from time import time
from random import randint

def quick_sort(A, s, e):
	if s < e:
		k = partition(A, s, e)
		quick_sort(A, s, k - 1)
		quick_sort(A, k + 1, e)


def partition(A, s, e):
	k = s
	for i in range(s + 1, e + 1):
		if A[i] <= A[s]:
			k += 1
			A[i], A[k] = A[k], A[i]
	A[k], A[s] = A[s], A[k]
	return k


for n in range(100,1001,100):
    qtd_samples = 1000
    c = 0
    for i in range(qtd_samples):
        A = [randint(-100, 100) for x in range(n)]
        begin = time()       
        quick_sort(A, 0, n - 1)
        end = time()
        c = c + abs(begin - end)
    c = c / qtd_samples
    print(n, c)
