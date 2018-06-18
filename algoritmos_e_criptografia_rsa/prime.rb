require 'prime'
#método para calcular todos os divisores primos de um número n
# implementação similar ao python deste repositório
# para rubystas (fatorar um número natural)
def prime_factors(n)
  result = []
  compare =  n
  # pega todos os primos da classe prime de ruby
  # itera sobre cada um deles e tenta dividir quantas vezes possível
  # o mesmo numero primo até que passe para o próximo num primo
  # este range vai somente até a raiz quadrada deste numero n.
  Prime.each(Math.sqrt(n).to_i) do |prime|
    until compare % prime != 0
      result << prime
      compare = compare / prime
    end
  end
  return result
end

#faça a fatoração do numero natural inputado (p =17 x q= 41)
puts prime_factors(697)
