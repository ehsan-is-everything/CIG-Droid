# CIG-Droid

1. Static analysis and extracting CFG of input APK. We use Soot for this goal.
2. De-compilation of input APK and extracting source code.APK Tools and Dex2Jar.
3. Building Mock and Stub classes.
4. There is wrapper program that has 2 task:
A) Analyzing CFG and then building a dummy main (Driver). Drivers are building for traversing all pathes in program. 
B) Analysing xml files inorder to exteract possible input widgets e.g. EditText. then changing source code and making than input cases Symbolic with Debug.makeSymbolic..().  
5. A program for running automatically of jpf files and storing results.
