CS 350 (Fall 2016: KP)
======
# Programming Assignment #2
## Due: 3rd November (By 2:30 PM)

As part of virtual memory support in an operating system you need to implement the LRU page replacement algorithm as discussed in the textbook (see section 9.4.4). You will test your algorithm on a page reference pattern (a series of page numbers listed in the test data file named pageRefString.txt.) Your program should create an output file named pg2out.txt in which you will output the contents of each frame after each page is referenced and output the total number of page faults for the algorithm. Your program logic should run for two cases: (a) number of frames allocated is 3; (b) number of frames allocated is 4.

You will write a Java class named PG2xxx (where xxx stands for your initials) in which you will define the various methods including the main method to implement the logic as per the description. The folder PG2xxx contains the pageRefString.txt file. You should also put the source file PG2xxx.java, other source files (if any) & the result file pg2out.txt into this folder.

Hint: Output file contents for the scenario depicted in Figure 9.15 may look like:

LRU algorithm with 3 frames:

```bash
7  -   -
7  0  -
7  0  1
2  0  1
2  0  1
2  0  3
2  0  3
4  0  3
 etc…
```

Total number of page faults is 12

### NOTE:
1. Your Java source code should be well-commented & well-structured
2. You must include your name, current date, & a description of the problem as comments
3. Electronic copy of the folder PG2xxx (zipped) must be posted by due date time to the appropriate location on the blackboard
4. You need to turn in a hardcopy of the source code & result file by the due date time to the instructor
