####################################################
## Autor: Arthur Anthony da Cunha Romão E Silva   ##
## Matrícula: 20190011208                         ##
####################################################

from time import time
from random import randint

def insertion_sort(A, n):
	for i in range(1, n):
		k = A[i]
		j = i - 1
		while j >= 0 and A[j] > k:
			A[j + 1] = A[j]
			j -= 1
		A[j + 1] = k


for n in range(100,1001,100):
    qtd_samples = 1000
    c = 0
    for i in range(qtd_samples):
        A = [randint(-100, 100) for x in range(n)]
        begin = time()       
        insertion_sort(A, n - 1)
        end = time()
        c = c + abs(begin - end)
    c = c / qtd_samples
    print(n, c)
