from datetime import datetime

# Ask user for inputs
name = input("Enter your name: ")
age = int(input("Enter your age: "))

# Get the current year
current_year = datetime.now().year

# Calculate the year they will turn 100
year_100 = current_year + (100 - age)

# Print the message
print(f"Hello {name}, you will turn 100 years old in the year {year_100}.")
