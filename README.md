# CSC360 Recursion
 
Section Numbers
Write a function, the function prints the output to the command line. The output consists of the String
prefix followed by "section numbers" of the form 1.1., 1.2., 1.3., and so on. The levels argument
determines how may levels the section numbers have. For example, if levels is 2, then the section
numbers have the form x.y. If levels is 3, then section numbers have the form x.y.z. The digits permitted
in each level are always '1' through '3'. 

As an example, if prefix is the string "THERBLIG" and levels is 2, then the function would start by printing:
THERBLIG1.1.
THERBLIG1.2.
THERBLIG1.3.
and end by printing:
THERBLIG3.1.
THERBLIG3.2.
THERBLIG3.3.
The stopping case occurs when levels reaches zero (in which case the prefix is printed once by itself
followed by nothing else).



A Teddy Bear Picnic
This question involves a game with teddy bears. The game starts when I give you some bears. You can
then give back some bears, but you must follow these rules (where n is the number of bears that you
have):
1. If n is divisible by 5, then you may give back exactly 42 bears.
2. If n is even, then you may give back exactly n/2 bears.
3. If n is divisible by 3 or 4, then you may multiply the last two digits of n and give back this many
bears. 

Dont change the sequence of the above three conditions.
The goal of the game is to end up with EXACTLY 42 bears.

For example, suppose that you start with 250 bears. Then you could make these moves:
 --Start with 250 bears.
 --Since 250 is divisible by 5, you may return 42 of the bears, leaving you with 208 bears.
 --Since 208 is even, you may return half of the bears, leaving you with 104 bears.
 --Since 104 is even, you may return half of the bears, leaving you with 52 bears.
 --Since 52 is divisible by 4, you may multiply the last two digits (resulting in 10) and return these 10
bears. This leaves you with 42 bears.
 --You have reached the goal!

Write a recursive function to meet this specification:
bool bears(int n)
// Postcondition: A true return value means that it is possible to
win
// the bear game by starting with n bears. A false return value
means that
// it is not possible to win the bear game by starting with n
bears.
// Examples:
// bear(250) is true (as shown above)
// bear(42) is true
// bear(84) is true
// bear(53) is false
// bear(41) is false
