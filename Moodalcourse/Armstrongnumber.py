#Assignment 3: The below program is to check whether the number is Armstrong number or not

def checkarmstrongnumber(number):
    # Initializing Sum and Number of Digits
    sumofdigits = 0
    numberofdigits = 0

    # Calculating Number of individual digits
    individualdigits = number
    while individualdigits > 0:
        numberofdigits = numberofdigits + 1
        individualdigits = individualdigits // 10

    # Finding Armstrong Number
    individualdigits = number
    for number in range(1, individualdigits + 1):
        lastdigit = individualdigits % 10
        sumofdigits = sumofdigits + (lastdigit ** numberofdigits)
        individualdigits //= 10
    return sumofdigits

# End of Function

# User Input
inputnumber = int(input("\nPlease Enter the Number to Check for Armstrong: "))

if (inputnumber == checkarmstrongnumber(inputnumber)):
    print("\n %d is Armstrong Number.\n" % inputnumber)
else:
    print("\n %d is Not a Armstrong Number.\n" % inputnumber)
