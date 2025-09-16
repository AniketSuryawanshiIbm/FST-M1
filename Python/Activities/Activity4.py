# Rock-Paper-Scissors game with replay option

print("Welcome to Rock-Paper-Scissors Game!")
print("Choices: Rock, Paper, Scissors")

while True:
    # Get input from both players
    player1 = input("Player 1, enter your choice: ").strip().lower()
    player2 = input("Player 2, enter your choice: ").strip().lower()

    # Check for a tie
    if player1 == player2:
        print("It's a tie!")

    # All winning cases for Player 1
    elif (player1 == "rock" and player2 == "scissors") or \
         (player1 == "scissors" and player2 == "paper") or \
         (player1 == "paper" and player2 == "rock"):
        print("Player 1 wins!")

    # Otherwise, Player 2 wins
    else:
        print("Player 2 wins!")

    # Ask if they want to play again
    play_again = input("Do you want to play another round? (Yes/No): ").strip().lower()

    if play_again != "yes":
        print("Thanks for playing!")
        break
