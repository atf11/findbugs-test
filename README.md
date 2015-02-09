# findbugs-test
The goal is:  
1. Get findbugs to fail the build in errors  
2. Get findbugs to understand the jsr 305 annotations (@Nullable, etc)  
3. Configure so that all non-annotated things are assumed to be @NonNullable (@ParametersAreNonnullByDefault)  
  
Currently 1 and 2 works, but not 3  
