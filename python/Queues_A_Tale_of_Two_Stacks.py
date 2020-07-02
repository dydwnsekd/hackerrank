# https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=stacks-queues

class MyQueue(object):
    def __init__(self):
        self.queue = []
    
    def peek(self):
        return self.queue[-1]
        
    def pop(self):
        self.queue.pop()
        
    def put(self, value):
        self.queue.insert(0, value)

queue = MyQueue()
t = int(input())
for line in range(t):
    values = map(int, input().split())
    values = list(values)
    if values[0] == 1:
        queue.put(values[1])        
    elif values[0] == 2:
        queue.pop()
    else:
        print(queue.peek())