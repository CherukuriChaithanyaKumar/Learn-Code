#Assignment A: The below program is to Roll the Dice
import random
def rollTheDice(surfaces):
    number=random.randint(1, surfaces)
    return number

def main():
    surfaces=6
    continuethegame=True
    while continuethegame:
        userinput=input("Ready to roll? Enter Q to Quit")
        if userinput.lower() !="q":
            outcome=rollTheDice(surfaces)
            print("You have rolled a",outcome)
        else:
            continuethegame=False

main()