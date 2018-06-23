def get_gcd_equal_to_one_of(n)
  result = []
  (1..n).each do |number|
     result << number if n.gcd(number) == 1
  end
  result
end

puts get_gcd_equal_to_one_of(640)
