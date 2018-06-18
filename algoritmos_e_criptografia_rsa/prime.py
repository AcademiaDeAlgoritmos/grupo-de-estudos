
# programação comentada após apresentação e explicações.
# Esta implementação não herda classe nativa
# e calcula os primos considerando o ver implementação em ruby*
# Python program to print prime factors
# ver sieve of erasthótenes
import math

# A function to print all prime factors of
# a given number n
def primeFactors(n):
    # método sem classe nativa para números primos
    #divide por 2 (primeiro numero primo até que não seja mais
    # possível fazê-lo)
    # Print the number of two's that divide n
    while n % 2 == 0:
        print 2,
        n = n / 2
    # quando não der tenta com os próximos primos de 3 a ]
    # raiz quadrada do numero n.
    # é preciso estabelecer que o range vai pular de 2 em 2.
    # para pegar somente os primos dentro do range.
    # n must be odd at this point
    # so a skip of 2 ( i = i + 2) can be used
    for i in range(3,int(math.sqrt(n))+1,2):

        # while i divides n , print i ad divide n
        while n % i== 0:
            print i,
            n = n / i

    # Condition if n is a prime
    # number greater than 2
    if n > 2:
        print n

# Driver Program to test above function
# coloque aqui o input que vc quer decompor.
# ATENÇÃO !! Não ponha um número gigantesco e rode em sua maquina local!
n = 3782
primeFactors(n)

