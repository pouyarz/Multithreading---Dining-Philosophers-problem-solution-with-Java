# Multithreading---Dining-Philosophers-problem-solution-with-Java
A multi-thread program as a solution for the problem of dining philosophers.

# Problem description:
Five philosophers are sitting on a round table caught in deep thought. Besides thinking, they have to eat every now and then or they will starve. Between each philosopher is one chopstick. In the middle of the table is a bowl of spaghetti. Two chopsticks are required in order to eat the entangled spaghetti. If a philosopher (task) wants to eat (run), he has to acquire the chopstick (resources) of both of his neighbors. He can only get the chopsticks if none of his neighbors are using them. This implies that no neighboring philosophers can eat at the same time and that at most two philosophers can eat at a time. A solution to the problem has to guarantee mutually exclusive access to the resources. Absence of deadlock and absence of starvation are important as well, however, we don’t want to address starvation at the moment.
- The monitor dining controls the distribution of the chopsticks.
- Each philosopher, before starting to eat, invoke the operation pickup. After the successful completion of the operation, the philosopher may eat. The philosopher invokes the putdown operation, and may start to think. Thus, philosopher i invokes the operations pickup and putdown.
- We count the number of times that each philosopher gets to eat to see if starvation happens.
