Solution to Lunar Logic's internship application problem at https://internships.lunarlogic.io/
# Description
Write Ruby (Ruby candidate) or Java/Kotlin (Android candidate) code that as an input accepts an array consisting of three numbers (integers). The code should change these numbers to meet the following requirements:
1. Each number should be divisible by three.
2. Sum of all three numbers should be as large as possible.
Changing a number means increasing (decreasing is not allowed) any of its digits. Increasing a digit by one means one change, that is increasing a digit by five would mean five changes. You can perform up to six changes in total for all three numbers.
For example:
1. [110, 222, 3333] can be changed to [111, 222, 3333] - this is one change
2. [111, 222, 33] can be changed to [114, 333, 33] - here we have six changes
You can distribute changes among numbers as you wish. Digit 9 cannot be changed.

Examplary solution
```
INPUT: [784, 4765, 5291]
OUTPUT: [984, 6765, 6291]
```
For some input numbers there is more than one solution possible. In such cases it’s enough to return one of them. However, if you’d like to do something extra, you can return all of the possible solutions. Also, it’s okay to submit a partially working solution.

## How to run?

Execute the jar with `java -jar` command. You can either provide input as application arguments, or you will be prompted to enter them one by one.

Example:
```
java -jar LunarLogic.jar 784 4765 5291
[984, 6765, 6291]
```
```
java -jar LunarLogic.jar 
784
4765
5291
[984, 6765, 6291]
```
