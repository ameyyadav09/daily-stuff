class Person:    
    age = 0
    def __init__(self,initial_Age):
        # Add some more code to run some checks on initial_Age
        if initial_Age >= 0:
            Person.age = initial_Age
        else:
            print "This person is not valid, setting age to 0."
    def amIOld(self):
        # Do some computations in here and print out the correct statement to the console
        if Person.age < 13:
            print "You are young."
        elif 13 <= Person.age < 18:
            print "You are a teenager."
        else:
            print "You are old."

    def yearPasses(self):
        # Increment the age of the person in here
        Person.age += 1
T=int(raw_input())
for i in range(0,T):
    age=int(raw_input())         
    p=Person(age)  
    p.amIOld()
    for j in range(0,3):
        p.yearPasses();        
    p.amIOld();
    print ""
             