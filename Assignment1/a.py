#Assignment A: The below program is to Roll the Dice
import random
def rollTheDice(surface):
    number=random.randint(1, surface)
    return number

def main():
    surface=6
    roll1=True
    while roll1:
        roll2=input("Ready to roll? Enter Q to Quit")
        if roll2.lower() !="q":
            outcome=rollTheDice(surface)
            print("You have rolled a",outcome)
        else:
            roll1=False

main()