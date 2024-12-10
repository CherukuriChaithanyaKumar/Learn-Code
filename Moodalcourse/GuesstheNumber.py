#Assignment 2: The below program is to guess the correct number between 1 to 100
import random
def guessthecorrectnumber(validnumber):
    if validnumber.isdigit() and 1<= int(validnumber) <=100:
        return True
    else:
        return False

def main():
    outcomenumber=random.randint(1,100)
    guessnumber=False
    guess=input("Guess a number between 1 and 100:")
    guessednumber=0
    while not guessednumber:
        if not guessthecorrectnumber(guess):
            guess=input("I wont count this one Please enter a number between 1 to 100")
            continue
        else:
            incrementalnumber=1
            guess=int(guess)

        if guess<outcomenumber:
            guess=input("Too low. Guess again")
        elif guess>outcomenumber:
            guess=input("Too High. Guess again")
        else:
            print("You guessed it in",incrementalnumber,"guesses!")
            guessednumber=True

main()