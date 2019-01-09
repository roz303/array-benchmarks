# array-benchmarks
For some reason, a 3D array seems to be faster than a 2D array of comparable size. Here's a sample of the output data:

    Entire iteration took: 68.444039 milliseconds.
    Equivalent 2d array time: 914.284444 milliseconds
    
If I replace each calculation with setting each cell to 1, the results are:

    Entire iteration took: 72.88094 milliseconds.
    Equivalent 2d array time: 515.200074 milliseconds
