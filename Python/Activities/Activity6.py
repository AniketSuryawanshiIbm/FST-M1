# Number pattern using nested loops

# Outer loop for rows (1 to 9)
for i in range(1, 10):
    # Inner loop for printing numbers
    for j in range(i):
        print(i, end="")  # print number without newline
    print()  # move to next line
