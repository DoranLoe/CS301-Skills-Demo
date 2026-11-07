# Module 7

## Three examples of NP
Issue: there are no problems GUARANTEED to be NP in a way that makes them not P.</br> 
P vs NP is still an unsolved problem. There are no problems that are for certain not P. Just very very likely not P. </br>
Due to this there are no specific examples of problems that are NP and not in P, however the theoretical set of NP can be broken down into 3 general subsets:

### All P problems
By definition, P is a subset of NP therefore all P questions are NP. </br>
Simply put, if you can solve a problem in polynomial time with a normal turning machine, a non-deterministic turning machine definitely can. </br>

An example for a problem in this category would include most problems really, but single out one, Searching an unsorted list. This can be done in O(n) time which lies within the efficient polynomial time range. Because it's in P, it's in NP.
### All problems that are NP-complete
Since this type of complexity is transitive, If you can "reduce" a problem to a P problem, essentially translating or mapping it onto one, then it is a P problem. Much the same goes for NP, If you can reduce a problem to an NP problem, then it is also an NP problem.</br>
NP-complete then is a specific category where if one NP-complete problem is proven to be P then all of NP is P. It is the group of the hardest NP problems. </br>

Examples of NP-complete problems include Sudoku and the traveling salesman problem. Checking a solution to these is easy, just make sure it's a valid output that follows the criteria of the problem. Finding an answer however is hard becasue sometimes you are required to use a brute force "guess and check" method to make progress.
### NP-Itermediate problems
If we assume that P =/= NP, then by Ladner's Theorem made in 1975, there exists problems in NP that are neither P nor NP-complete. [I had to look this one up, ](https://en.wikipedia.org/wiki/NP-intermediate)These problems are called NP-Intermediate. If an NP-I problem were to be proven to be P, it wouldn't collapse all of NP into being P, just the ones it maps to.</br>

An exapmle of an NP-I problem is the Minimum Circuit Size Problem. Given a truth table of some boolean function and an integer, is there a circuit that represents the function that is at most the size of the integer?

## Difference between three different words
Universality, Computability, and Intractability are three different characteristics that have little to do with one another and their differences should be as self evident as just knowing what they are.
### Universality
The universal set in set theory is the set of all relevant elements. A set of which all other sets are subsets of. Universality is in-like. It's the characteristic of something that allows for all other relevant things to be expressed within. </br>
To bring it to something relevant, a Universal Turing Machine is a Turing Machine that can act as if it was any other Turing Machine. 
### Computability
Computability is the characteristic of a problem to be computable. Something is computable when it can be figured out by using mathmatics or otherwise logicing it out. Not all things are computable. There's a thing called the halting problem that kinda shows that. This is different from universality since it has nothing in common with it. There's a conjecture that anything computable can be computed by some Turing Machine and thus a Universal Turing Machine but that is far from saying that there is a similarity between Computability and Universality beyond maybe that they are both characteristics a thing can possess.
### Intractability
Intractability is a characteristic of a problem to not be able to be solved in polynomial time. Polynomial Time is the cutoff for a computation to be considered efficient as anything beyond this would require exponential time. Exponential time is BAD and can quickly make something take too long to reasonably calculate. This is a large thing when considering P vs NP. This is in contrast to Computability, which is something's ability to be solved AT ALL (using computing and thus Turing Machines). 