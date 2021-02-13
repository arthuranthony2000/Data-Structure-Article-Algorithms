######################################################################
## Author: Arthur Anthony da Cunha Romão E Silva                   ###
## Enrollment: 20190011208                                         ###
##                                                                 ###
######################################################################

class Graph(object):
	def __init__(self, length):
		self.length = length
		self.vertices = [[0] * length for x in range(length)]
		self.visited = [0] * length

	def addEdge(self, u, v):
		self.vertices[u - 1][v - 1] = 1
		self.vertices[v - 1][u - 1] = 1

	def show(self):
		for x in self.vertices:
			for y in x:
				print(y, end=" ")
			print("")

	def bfs(self, u):
		print(u, end=" ")
		queue = [u - 1]
		self.visited[u - 1] = 1

		while len(queue) > 0:
			u = queue[0]
			for v in range(self.length):
				if(self.vertices[u][v] == 1 and self.visited[v] == 0):
					self.visited[v] = 1
					queue.append(v)					
					print(v + 1, end=" ")
			queue.pop(0)
		print("")



g = Graph(7)
g.addEdge(1, 2)
g.addEdge(2, 3)
g.addEdge(3, 4)
g.addEdge(4, 5)
g.addEdge(5, 6)
g.addEdge(6, 7)
g.bfs(1)

print()