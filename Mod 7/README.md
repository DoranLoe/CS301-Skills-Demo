# Module 7

## Three examples of NP
Issue: there are no problems GUARANTEED to be NP in a way that makes them not P.</br> 
P vs NP is still an unsolved problem. There are no problems that are for certain not P. Just very very likely not P. </br>
Due to this there are no specific examples of problems that are NP and not in P, however the theoretical set of NP can be broken down into 3 general subsets:
### All P problems
By definition, P is a subset of NP therefore all P questions are NP. </br>
Simply put, if you can solve a problem in polynomial time, there are ways to solve it slower.
### All problems that are NP-complete
Since this type of complexity is transitive, If you can "reduce" a problem to a P problem, essentially translating or mapping it onto one, then it is a P problem. Much the same goes for NP, If you can reduce a problem to an NP problem, then it is also an NP problem.</br>
NP-complete then is a specific category where if one NP-complete problem is proven to be P then all of NP is P. It is the group of the hardest NP problems. It includes things like Sudoku, or the traveling salesman problem.
### NP-Itermediate problems
If we assume that P =/= NP, then by Ladner's Theorem made in 1975, there exists problems in NP that are neither P nor NP-complete. [I had to look this one up, ](https://en.wikipedia.org/wiki/NP-intermediate)These problems are called NP-Intermediate. If an NP-I problem were to be proven to be P, it wouldn't collapse all of NP into being P, just the ones it maps to.
## Difference between three different words
### Universality
### computability
### interactability 