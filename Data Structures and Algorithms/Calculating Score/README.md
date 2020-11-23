QUESTION:

One day three best friends Ali, Bilal and Umer decided to form a team and take part in programming
contests. Participants are usually offered several problems during programming contests. Long
before the start the friends decided that they will implement a problem if at least two of them are sure
about the solution. Otherwise, the friends won&#39;t write the problem&#39;s solution.
This contest offers n problems to the participants. For each problem we know, which friend is sure
about the solution. Help the friends find the number of problems for which they will write a solution.

Input
The first input line contains a single integer n (1 ≤ n ≤ 1000) — the number of problems in the
contest. Then n lines contain three integers each, each integer is either 0 or 1. If the first number in
the line equals 1, then Ali is sure about the problem&#39;s solution, otherwise he isn&#39;t sure. The second
number shows Bilal&#39;s view on the solution, the third number shows Umer&#39;s view. The numbers on the
lines are separated by spaces.

Output
Print a single integer — the number of problems the friends will implement on the contest.
Examples
Input
3
1 1 0
1 1 1
1 0 0
Output
2

Input
2
1 0 0
0 1 1
Output
1

Note
In the first sample Ali and Bilal are sure that they know how to solve the first problem and all three of
them know how to solve the second problem. That means that they will write solutions for these
problems. Only Ali is sure about the solution for the third problem, but that isn&#39;t enough, so the
friends won&#39;t take it.
In the second sample the friends will only implement the second problem, as Bilal and Umer are
sure about the solution.
