# Multiplication table generator

# Ask the user for a number
num = int(input("Enter a number to generate its multiplication table: "))

print(f"\nMultiplication Table of {num}:")

# Loop from 1 to 10
for i in range(1, 11):
    print(f"{num} x {i} = {num * i}")
