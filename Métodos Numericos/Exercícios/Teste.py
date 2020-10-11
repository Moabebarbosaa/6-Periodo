import numpy as np


def SubstituicaoProgressiva(a, b):
    n = np.size(b)
    x = np.zeros(n)
    for i in range(n):
        soma = 0
        for j in range(n - 1, -1, -1):
            soma += a[i][j] * x[j]

        x[i] = (b[i] - soma) / a[i][i]
    return x



A = np.array([[3, 0, 0, 0], [2, 1, 0, 0], [1, 0, 1, 0], [1, 1, 1, 1]])
b = np.array([4, 2, 4, 2])
print(SubstituicaoProgressiva(A, b))